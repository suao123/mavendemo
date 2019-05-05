package com.demo.service.impl;

import com.demo.service.ValidateCode;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

@Service("validateCode")
public class ValidateCodeimpl implements ValidateCode {

    @Override
    public String generateTextCode(){
        StringBuffer code = new StringBuffer();
        int i = 0;
        Random r = new Random();

        while(i < 4){
            int t = r.nextInt(200);
            if(t >= 'a' && t <= 'z'){
                code.append((char) t);
                i++;
            }
            else if(t >= 'A' && t <= 'Z'){
                code.append((char) t);
                i++;
            }
        }
        return code.toString();
    }

    @Override
    public BufferedImage generateImageCode(String textCode, int width, int height, int interLine,
                                           boolean randomLocation, Color backColor, Color foreColor, Color lineColor){
        //创建内存图像,不带透明的对象
        BufferedImage bim = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //获取图形上下文
        Graphics2D g = (Graphics2D) bim.getGraphics();

        //画背景图
        g.setColor(backColor == null ? getRandomColor(): backColor);
        g.fillRect(0, 0, width, height);

        //画背景图
        Random r = new Random();
        int x = 0, y = 0, x1 = width, y1 = 0;
        for (int i = 0; i < interLine; i++){
            g.setColor(lineColor == null ? getRandomColor() : lineColor);
            y = r.nextInt(height);
            y1 = r.nextInt(height);
            g.drawLine(x, y, x1, y1);
        }

        for(int i = 0; i < 50; i++){
            int x2, y2;
            y2 = r.nextInt(height);
            x2 = r.nextInt(width);
            g.drawLine(x2, y2, x2, y2);
        }

        //字体大小都为图片的80%
        int fsize = (int)(height * 0.8);
        int fx = height - fsize;
        int fy = fsize;

        //写验证码字符
        for(int i = 0; i < textCode.length(); i++){
            fy = randomLocation ? (int)((Math.random() * 0.3 + 0.6) * height) : fy;
            g.setColor(foreColor == null ? getRandomColor() : foreColor);
            int jiaodu = r.nextInt(60)-30;
            double hudu = jiaodu * Math.PI / 180;
            g.rotate(hudu, fx, fy);
            g.drawString(textCode.charAt(i) + "", fx, fy);
            g.rotate(-hudu, fx, fy);
            fx += fsize * 0.9;
        }

        g.dispose();
        return bim;
    }

    @Override
    public Color getRandomColor(){
        Random r = new Random();
        Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        return c;
    }
}
