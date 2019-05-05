package com.demo.service;

import com.demo.model.Enterprise;

import java.util.List;

/**
 * 企业相关服务
 */

public interface EnterpriseService {

    /**
     * 返回所有的用户
     * @return
     */
    List<Enterprise> list();

    /**
     * 更改用户密码
     *
     * @param e_phone
     * @param password
     */
    void updatePassword(String e_phone, String password);

    /**
     * 更改用户信息
     *
     * @param e_phone
     *
     */
    void update(String e_phone, Enterprise enterprise);

    /**
     * 根据tel获取用户
     *
     * @param e_phone
     * @return
     */
    Enterprise get(String e_phone);

    /**
     * 根据用户名和密码来查询用户
     *
     * @param e_phone
     * @param password
     * @return
     */
    Enterprise get(String e_phone, String password);


    /**
     * 根据电话判断用户是否存在
     *
     * @param e_phone
     * @return
     */
    boolean isExist(String e_phone);

    /**
     * 增加一条用户数据
     *
     * @param enterprise
     */
    void add(Enterprise enterprise);
}
