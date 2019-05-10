package com.demo.controller;

import com.demo.service.ValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class ValidateCodeController {

    @Autowired
    private ValidateCode validateCode;

    /**
     * 取得后台验证码并显示
     * */
    @RequestMapping(value = "validateCode", method = {RequestMethod.GET, RequestMethod.POST})
    public void ValidateCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Cache-Contol", "no-cache");
        //获得验证码答案
        String verifCode = validateCode.generateTextCode();
        request.getSession().setAttribute("validateCode", verifCode);
        //显示验证码
        response.setContentType("image/jpeg");
        BufferedImage bim = validateCode.generateImageCode(verifCode,  90, 30, 5, true, Color.WHITE, Color.BLUE, null);
        ImageIO.write(bim, "JPEG", response.getOutputStream());

    }
}
