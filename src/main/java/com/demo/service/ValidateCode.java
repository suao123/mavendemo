package com.demo.service;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 验证码服务（接口）
 */
public interface ValidateCode {
    public String generateTextCode();
    /**
     * 已有验证码，生成验证码图片
     * @param textCode 文本验证码
     * @param width  图片宽度（如果宽度过小，验证码就不好看
     * @param interLine 图片中干扰线的条数
     * @param randomLocation 每个字符的高低位置的随机
     * @param backColor 图片颜色
     * @param foreColor 字体颜色
     * @param lineColor 干扰颜色
     * @return 图片缓存对象
     */
    public BufferedImage generateImageCode(String textCode, int width, int height, int interLine,
                                           boolean randomLocation, Color backColor, Color foreColor, Color lineColor);

    public Color getRandomColor();
}
