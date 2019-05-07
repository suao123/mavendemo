package com.demo.service;

import com.demo.model.Credit;

import java.util.List;

/**
 * 用户信用积分
 */
public interface CreditService {

    /**
     * 返回所有信用记录
     * @return
     */
    List<Credit> list();

    /**
     *增加记录
     */
    void add(Credit credit);

}
