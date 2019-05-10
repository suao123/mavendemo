package com.demo.controller;

import com.demo.model.Enterprise;
import com.demo.model.Order;
import com.demo.model.Studio;
import com.demo.model.Tender;
import com.demo.service.EnterpriseService;
import com.demo.service.OrderService;
import com.demo.service.StudioService;
import com.demo.service.TenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Path;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
public class EnterpriseController {

    @Autowired
    private EnterpriseService  enterpriseService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private TenderService tenderService;

    @Autowired
    private StudioService studioService;

    @RequestMapping("/index")
    public String login(){
        return "/Enterprise/login";
    }

    @RequestMapping(value = "/Enterprise/loginCheck")
    public @ResponseBody
    Object loginCheck(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        String e_phone = request.getParameter("e_phone");
        String password = request.getParameter("password");
        HashMap<String, String> res = new HashMap<>();
        if(enterpriseService.get(e_phone) == null){
            res.put("stateCode", "0");
        } else if(null == enterpriseService.get(e_phone, password)){
             res.put("stateCode", "1");
        } else if(enterpriseService.get(e_phone, password).getEnState() != 0){
            res.put("stateCode", "3");
        } else {
            session.setAttribute("enterprise", enterpriseService.get(e_phone, password));;
            res.put("stateCode", "2");
        }
        return res;
    }

    @RequestMapping("/Enterprise/loginout")
    public  String logout(HttpSession session){
        session.removeAttribute("enterprise");
        return "redirect:/Enterprise";
    }

    @RequestMapping("/Enterprise/register")
    public String register(){
        return "/Enterprise/register";
    }

    @RequestMapping("/Enterprise/registerCheck")
    public @ResponseBody Object registerCheck(HttpServletRequest request){
        String phone = request.getParameter("phone");
        String enname = request.getParameter("enname");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        String validateCode = request.getParameter("validateCode").toLowerCase();
        String currentValidateCode = String.valueOf(request.getSession().getAttribute("validateCode")).toLowerCase();
        HashMap<String, String> res = new HashMap<>();
        if(validateCode.equals(currentValidateCode)){
            res.put("stateCode", "0");
            return res;
        }
        Enterprise enterprise = new Enterprise();
        enterprise.setEnName(name);
        enterprise.setEnEname(enname);
        enterprise.setEnEmail(email);
        enterprise.setPwd(pwd);
        enterprise.setEnPhone(phone);
        enterprise.setEnState(0);


        if(enterpriseService.isExist(phone)){
            res.put("stateCode", "0");
        } else {
            res.put("stateCode", "1");
            enterpriseService.add(enterprise);
        }
        return res;
    }

    @RequestMapping("/Enterprise/index")
    public String home(){
        return "/Enterprise/index";
    }

    @RequestMapping("/Enterprise/update")
    public @ResponseBody Object updateenterprise(HttpServletRequest request, HttpSession session){
        Enterprise oldEnterprise = (Enterprise) session.getAttribute("enterprise");
        String  e_phone = oldEnterprise.getEnPhone();
        HashMap<String, String> res = new HashMap<>();
        Enterprise newEnterprise = new Enterprise();
        String phone = e_phone;
        String enname = request.getParameter("enname");
        String name = request.getParameter("name");
        String boss = request.getParameter("boss");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        String info = request.getParameter("info");
        newEnterprise.setEnBoss(boss);
        newEnterprise.setEnState(oldEnterprise.getEnState());
        newEnterprise.setEnPhone(phone);
        newEnterprise.setEnEmail(email);
        newEnterprise.setEnEname(enname);
        newEnterprise.setEnName(name);
        newEnterprise.setPwd(pwd);
        newEnterprise.setEnInfo(info);
        if(phone.length() == 11){
            enterpriseService.update(phone, newEnterprise);
            session.removeAttribute("enterprise");
            session.setAttribute("enterprise", newEnterprise);
            res.put("stateCode", "1");
        } else {
            res.put("stateCode", "0");
        }
        return res;
    }

    @RequestMapping("/Enterprise/tender")
    public String Tender(){
        return "/Enterprise/tender";
    }

    @RequestMapping(value = "/Enterprise/addTender", method = {RequestMethod.GET, RequestMethod.POST})
    public  @ResponseBody Object addTender(Model model, HttpServletRequest request, HttpSession session) throws IOException{
        Enterprise enterprise = (Enterprise) session.getAttribute("enterprise");
        Tender tender = new Tender();
        MultipartHttpServletRequest multipartRequest =(MultipartHttpServletRequest) request;
        String t_name = multipartRequest.getParameter("name");
        String t_phone = multipartRequest.getParameter("phone");
        String t_email = multipartRequest.getParameter("email");
        String t_startdate = multipartRequest.getParameter("startdate");
        String t_txt = "";
        String t_info = multipartRequest.getParameter("info");
        String en_phone = enterprise.getEnPhone();
        String t_enddate = multipartRequest.getParameter("enddate");
        Integer t_addperson = 0;
        MultipartFile file = multipartRequest.getFile("file");
        String originalFileName = file.getOriginalFilename();
        String path = "/home/lizhisuao/桌面/demo/mavendemo/src/main/webapp/static-doxc/";
        HashMap<String, String> res = new HashMap<>();
        String filepath = "";
        if(!file.isEmpty()){
            String newFilename = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
            File newfile = new File(path + newFilename);
            file.transferTo(newfile);
            t_txt = newFilename;
        } else {
            res.put("stateCode", " 2");
            return res;
        }
        tender.settName(t_name);
        tender.settPhone(t_phone);
        tender.settEmail(t_email);
        tender.settStartdate(t_startdate);
        tender.settTxt(t_txt);
        tender.settInfo(t_info);
        tender.setEnPhone(en_phone);
        tender.settEnddate(t_enddate);
        tender.settAddperson(t_addperson);
        tenderService.add(tender);
        res.put("stateCode", "1");
            return res;
    }

    @RequestMapping("/Enterprise/showTender/{page}")
    public String showTender(Model model, HttpSession session, @PathVariable("page") int page){
        Enterprise enterprise = (Enterprise) session.getAttribute("enterprise");
        String en_phone = enterprise.getEnPhone();
        List<Enterprise> enterprises = enterpriseService.list()
                                                                                                .parallelStream()
                                                                                                .filter(en -> en.getEnPhone().equals(en_phone))
                                                                                                .collect(Collectors.toList());

        model.addAttribute("page",page);
        if(enterprises.size() % 20 == 0)
            model.addAttribute("endPage", enterprises.size() / 20);
        else
            model.addAttribute("endPage", enterprises.size() / 20 + 1);

        model.addAttribute("begin",String.valueOf((page - 1) * 20));

        if(page == (enterprises.size() / 20) + 1)
            if(enterprises.size() / 20 == 0){
                model.addAttribute("end", enterprises.size());
            }else{
                model.addAttribute("end", enterprises.size() - 1);
            }
        else
            model.addAttribute("end", String.valueOf(page * 20 - 1));
        model.addAttribute("enterprises", enterprises);
        return "/Enterprise/showTender";
    }

    @RequestMapping("/Enterprise/allTender/{page}")
    public String allTender(Model model, @PathVariable("page") int page){
        List<Enterprise> enterprises = enterpriseService.list()
                                                                                        .parallelStream()
                                                                                        .collect(Collectors.toList());

        model.addAttribute("page",page);
        if(enterprises.size() % 20 == 0)
            model.addAttribute("endPage", enterprises.size() / 20);
        else
            model.addAttribute("endPage", enterprises.size() / 20 + 1);

        model.addAttribute("begin",String.valueOf((page - 1) * 20));

        if(page == (enterprises.size() / 20) + 1)
            if(enterprises.size() / 20 == 0){
                model.addAttribute("end", enterprises.size());
            }else{
                model.addAttribute("end", enterprises.size() - 1);
            }
        else
            model.addAttribute("end", String.valueOf(page * 20 - 1));
        model.addAttribute("enterprises", enterprises);
        return "/Enterprise/allTender";
    }

    @RequestMapping("/Enterprise/showOrder/{page}")
    public String showOrder(Model model, @PathVariable("page") int page, HttpSession session){
        Enterprise enterprise  = (Enterprise) session.getAttribute("enterprise");
        String en_phone = enterprise.getEnPhone();
        List<Order> orders = orderService.listByEnterprisePhone(en_phone);

        model.addAttribute("page",page);
        if(orders.size() % 20 == 0)
            model.addAttribute("endPage", orders.size() / 20);
        else
            model.addAttribute("endPage", orders.size() / 20 + 1);

        model.addAttribute("begin",String.valueOf((page - 1) * 20));

        if(page == (orders.size() / 20) + 1)
            if(orders.size() / 20 == 0){
                model.addAttribute("end", orders.size());
            }else{
                model.addAttribute("end", orders.size() - 1);
            }
        else
            model.addAttribute("end", String.valueOf(page * 20 - 1));
        model.addAttribute("enterprises", orders);
        model.addAttribute("orders", orders);
        return "/Enterprise/showOrder";
    }

    @RequestMapping("/Enterprise/searchStudio/{page}")
    public String searchStudio(Model model, @RequestParam String keyword, @PathVariable("page") int page) {
        List<Studio> studios = studioService.search(keyword);

        model.addAttribute("page", page);
        if (studios.size() % 20 == 0)
            model.addAttribute("endPage", studios.size() / 20);
        else
            model.addAttribute("endPage", studios.size() / 20 + 1);

        model.addAttribute("begin", String.valueOf((page - 1) * 20));

        if (page == (studios.size() / 20) + 1)
            if (studios.size() / 20 == 0) {
                model.addAttribute("end", studios.size());
            } else {
                model.addAttribute("end", studios.size() - 1);
            }
        else
            model.addAttribute("end", String.valueOf(page * 20 - 1));
        model.addAttribute("studios", studios);
        return "/Enterprise/searchStudio";
    }

    @RequestMapping(value = "/Enterprise/search")
    public String search() {
        return "/Enterprise/search";
    }

}
