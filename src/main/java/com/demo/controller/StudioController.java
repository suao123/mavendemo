package com.demo.controller;

import com.demo.model.Studio;
import com.demo.model.Tender;
import com.demo.service.StudioService;
import com.demo.service.TenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class StudioController {

    @Autowired
    private StudioService studioService;

    @Autowired
    private TenderService tenderService;

    @Autowired
    private TenderService tenderservice;

    @RequestMapping("/Studioadmin/login")
    public String login() {
        return "/Studioadmin/login";
    }

    @RequestMapping("/Studioadmin/logincheck")
    public @ResponseBody
    Object logincheck(HttpSession session, HttpServletRequest request) {
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        HashMap<String, String> res = new HashMap<>();
        if (studioService.get(phone) == null) {
            res.put("stateCode", "0");
        } else if (null == studioService.get(phone, password)) {
            res.put("stateCode", "1");
        } else if (studioService.get(phone, password).getsState() != 0) {
            res.put("stateCode", "3");
        } else {
            session.setAttribute("studio", studioService.get(phone, password));
            ;
            res.put("stateCode", "2");
        }
        return res;
    }

    @RequestMapping("/Studioadmin/register")
    public String register() {
        return "/Studioadmin/register";
    }

    @RequestMapping("/Studioadmin/loginout")
    public String logout(HttpSession session) {
        session.removeAttribute("studio");
        return "redirect:/Enterpriseadmin";
    }

    @RequestMapping("/Studioadmin/registeramdmin")
    public @ResponseBody
    Object registercheck(HttpServletRequest request) {
        String name = request.getParameter("name");
        String sname = request.getParameter("sname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String pwd = request.getParameter("password");
        String validateCode = request.getParameter("validateCode").toLowerCase();
        String currentValidateCode = String.valueOf(request.getSession().getAttribute("validateCode")).toLowerCase();
        HashMap<String, String> res = new HashMap<>();
        if (validateCode.equals(currentValidateCode)) {
            res.put("stateCode", "1");
            return res;
        }
        Studio studio = new Studio();
        studio.setsSname(sname);
        studio.setsName(name);
        studio.setsPhone(phone);
        studio.setsEmail(email);
        studio.setPwd(pwd);
        studio.setsState(0);
        res.put("stateCode", "0");
        return res;
    }

    @RequestMapping("/Studioadmin/idnex")
    public String index() {
        return "Studioadmin/index";
    }

    @RequestMapping("/Studioadmin/update")
    public @ResponseBody
    Object updateStudio(HttpServletRequest request, HttpSession session) {
        Studio oldStudio = (Studio) session.getAttribute("studio");
        String phone = oldStudio.getsPhone();
        HashMap<String, String> res = new HashMap<>();
        Studio studio = new Studio();
        String name = request.getParameter("name");
        String sname = request.getParameter("sname");
        String email = request.getParameter("email");
        String info = request.getParameter("info");
        String pwd = request.getParameter("password");
        studio.setsState(oldStudio.getsState());
        studio.setPwd(pwd);
        studio.setsEmail(email);
        studio.setsPhone(phone);
        studio.setsName(name);
        studio.setsSname(sname);
        studio.setsInfo(info);
        if (phone.length() == 11) {
            studioService.update(phone, studio);
            session.removeAttribute("studio");
            session.setAttribute("studio", studio);
            res.put("stateCode", "1");
        } else {
            res.put("stateCode", "0");
        }
        return res;
    }

    @RequestMapping("/Studioadmin/Tender/{page}")
    public String Tender(Model model, HttpSession session, @PathVariable("page") int page) {
        Studio studio = (Studio) session.getAttribute("studio");
        String phone = studio.getsPhone();
        List<Tender> tenders = tenderService.list()
                .stream()
                .filter(s -> s.getsPhone().equals(phone))
                .collect(Collectors.toList());

        model.addAttribute("page", page);
        if (tenders.size() % 20 == 0)
            model.addAttribute("endPage", tenders.size() / 20);
        else
            model.addAttribute("endPage", tenders.size() / 20 + 1);

        model.addAttribute("begin", String.valueOf((page - 1) * 20));

        if (page == (tenders.size() / 20) + 1)
            if (tenders.size() / 20 == 0) {
                model.addAttribute("end", tenders.size());
            } else {
                model.addAttribute("end", tenders.size() - 1);
            }
        else
            model.addAttribute("end", String.valueOf(page * 20 - 1));
        model.addAttribute("tenders", tenders);
        return "/Studioadmin/Tender";
    }

    @RequestMapping("/Studioadmin/allTender/{page}")
    public String allTender(Model model, @PathVariable("page") int page) {
        List<Tender> tenders = tenderService.list();

        model.addAttribute("page", page);
        if (tenders.size() % 20 == 0)
            model.addAttribute("endPage", tenders.size() / 20);
        else
            model.addAttribute("endPage", tenders.size() / 20 + 1);

        model.addAttribute("begin", String.valueOf((page - 1) * 20));

        if (page == (tenders.size() / 20) + 1)
            if (tenders.size() / 20 == 0) {
                model.addAttribute("end", tenders.size());
            } else {
                model.addAttribute("end", tenders.size() - 1);
            }
        else
            model.addAttribute("end", String.valueOf(page * 20 - 1));
        model.addAttribute("tenders", tenders);
        return "/Studioadmin/allTender";
    }


    @RequestMapping("/Studioadmin/MyTender/{page}")
    public String MyTender(Model model, HttpSession session, @PathVariable("page") int page) {
        Studio studio = (Studio) session.getAttribute("studio");
        String phone = studio.getsPhone();
        List<Tender> tenders = tenderService.list()
                .stream()
                .filter(s -> s.getsPhone().equals(phone))
                .collect(Collectors.toList());

        model.addAttribute("page", page);
        if (tenders.size() % 20 == 0)
            model.addAttribute("endPage", tenders.size() / 20);
        else
            model.addAttribute("endPage", tenders.size() / 20 + 1);

        model.addAttribute("begin", String.valueOf((page - 1) * 20));

        if (page == (tenders.size() / 20) + 1)
            if (tenders.size() / 20 == 0) {
                model.addAttribute("end", tenders.size());
            } else {
                model.addAttribute("end", tenders.size() - 1);
            }
        else
            model.addAttribute("end", String.valueOf(page * 20 - 1));
        model.addAttribute("tenders", tenders);
        return "/Studioadmin/MyTender";
    }

    @RequestMapping("/Studioadmin/searchStudio/{page}")
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
        return "/Studioadmin/searchStudio";
    }

    @RequestMapping(value = "/Studioadmin/search")
    public String search() {
        return "/Studioadmin/search";
    }
}

