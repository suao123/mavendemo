package com.demo.controller;

import com.demo.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudioController {

    @Autowired
    private StudioService studioService;

    @RequestMapping("/Studioadmin/login")
    public String login(){
        return "/Studioadmin/login";
    }

    @RequestMapping("/Studioadmin/logincheck")
    public @ResponseBody Object logincheck(){

    }
}
