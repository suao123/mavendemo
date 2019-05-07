package com.demo.controller;

import com.demo.model.Enterprise;
import com.demo.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class EnterpriseController {

    @Autowired
    private EnterpriseService  enterpriseService;

    @RequestMapping(value = {"/Enterpriseadmin/index",  "/Enterpriseamdin"})
    public String login(){
        return "/Enterpriseadmin/login";
    }

    @RequestMapping(value = "/Enterpriseadmin/loginCheck")
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

    @RequestMapping("/Enterpriseadmin/loginout")
    public  String logout(HttpSession session){
        return "redirect:/Enterpriseadmin";
    }

    @RequestMapping("/Enterpriseadmin/register")
    public String register(){
        return "/Enterpriseadmin/register";
    }

    @RequestMapping("/Enterpriseadmin/registerCheck")
    public @ResponseBody Object registerCheck(HttpServletRequest request){
        String phone = request.getParameter("phone");
        String enname = request.getParameter("enname");
        String name = request.getParameter("name");
        String boss = request.getParameter("boss");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        String validateCode = request.getParameter("validateCode").toLowerCase();
        String currentValidateCode = String.valueOf(request.getSession().getAttribute("validateCode")).toLowerCase();
        HashMap<String, String> res = new HashMap<>();
        if(validateCode.equals(currentValidateCode)){
            res.put("stateCode", "1");
            return res;
        }
        Enterprise enterprise = new Enterprise();
        enterprise.setEnName(name);
        enterprise.setEnEname(enname);
        enterprise.setEnEmail(email);
        enterprise.setPwd(pwd);
        enterprise.setEnPhone(phone);
        enterprise.setEnBoss(boss);
        enterprise.setEnState(0);
        if(enterpriseService.isExist(phone)){
            res.put("stateCode", "0");
        } else {
            res.put("stateCode", "1");
        }
        return res;
    }

    @RequestMapping("/Enterpriseadmin/home")
    public String home(){
        return "/Enterpriseadmin/home";
    }

    @RequestMapping("/Enterpriseadmin/update")
    public @ResponseBody Object updateenterprise(HttpServletRequest request, HttpSession session){
        Enterprise oldEnterprise = (Enterprise) session.getAttribute("enterprise");
        String  e_phone = oldEnterprise.setEnPhone();
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
        if(phone.length() == 1){
            enterpriseService.update(phone, newEnterprise);
            session.removeAttribute("enterprise");
            session.setAttribute("enterprise", newEnterprise);
            res.put("stateCode", "1");
        } else {
            res.put("stateCode", "0");
        }
    }

    @RequestMapping("/Enterpriseadmin/tender")
    public String Tender(){
        return "/Enterpriseadmin/tender";
    }

    @RequestMapping("/Enterpriseadmin/addTender")
    public  @ResponseBody Object addTender(Model model, HttpServletRequest request, HttpSession session) throws  Exception{


    }
}
