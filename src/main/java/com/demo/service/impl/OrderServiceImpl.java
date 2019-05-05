package com.demo.service.impl;

import com.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order get(Integer o_id) {
        return orderMapper.selectByPrimaryKey(o_id);
    }

    @Override
    public List<Order> listAll() {
        OrderExample example = new OrderExample();
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<Order> list(String e_phone, Integer excludedStatus) {
        OrderExample example = new OrderExample();
        example.or().andEnPhoneEqualTo(e_phone);
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<Order> listByEnterprisePhone(String e_phone) {
        OrderExample example = new OrderExample();
        example.or().andEnPhoneEqualTo(e_phone);
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<Order> listByStudioPhone(String s_phone) {
        OrderExample example = new OrderExample();
        example.or().andSPhoneEqualTo(s_phone);
        return orderMapper.selectByExample(example);
    }

    @Override
    public void update(Order order) {
            orderMapper.updateByPrimaryKey(order);
    }

    @Override
    public void add(Order order) {
        orderMapper.insert(order);
    }
}
