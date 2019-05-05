package com.demo.service;

import java.util.List;

public interface OrderService {

    /**
     * 根据ID饭hi对应的Order
     *
     * @param o_id
     * @return
     */
    Order get(Integer o_id);

    /**
     * 返回所有的订单
     *
     * @return
     */
    List<Order> listAll();

    /**
     * 按照买方、订单状态来查询
     *
     * @param e_phone
     * @param excludedStatus
     * @return
     */
    List<Order> list(String e_phone, Integer excludedStatus);

    /**
     * 返回e_phone下的订单
     * @param  e_phone
     * @return
     */
    List<Order> listByEnterprisePhone(String e_phone);


    /**
     * 返回s_phone下的订单
     * @param  s_phone
     * @return
     */
    List<Order> listByStudioPhone(String s_phone);

    /**
     * 更新订单
     *
     * @param order
     */
    void update(Order order);

    /**
     * 增加订单
     *
     * @param order
     */
    void add(Order order);

}
