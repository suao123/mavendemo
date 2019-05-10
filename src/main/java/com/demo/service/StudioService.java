package com.demo.service;

import com.demo.model.Studio;

import java.util.List;

public interface StudioService {

    /**
     * 返回所有的用户
     * @return
     */
    List<Studio> list();

    /**
     * 更改用户密码
     *
     * @param s_phone
     * @param password
     */
    void updatePassword(String s_phone, String password);

    /**
     * 更改用户信息
     *
     * @param s_phone
     *
     */
    void update(String s_phone, Studio studio);

    /**
     * 根据tel获取用户
     *
     * @param s_phone
     * @return
     */
    Studio get(String s_phone);

    /**
     * 根据用户名和密码来查询用户
     *
     * @param s_phone
     * @param password
     * @return
     */
    Studio get(String s_phone, String password);


    /**
     * 根据电话判断用户是否存在
     *
     * @param s_phone
     * @return
     */
    boolean isExist(String s_phone);

    /**
     * 增加一条用户数据
     *
     * @param studio
     */
    void add(Studio studio);


    /**
     * 根据keyword返回相应的工作室集合
     *
     * @param keyword
     * @return
     */
    List<Studio> search(String keyword);
}
