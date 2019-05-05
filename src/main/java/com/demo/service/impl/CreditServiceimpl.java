package com.demo.service.impl;

import com.demo.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditServiceimpl implements CreditService {

    @Autowired
    private CreditMapper creditMapper;

    @Override
    public List<Credit> list() {
        CreditExample example = new CreditExample();
        return creditMapper.selectByExample(example);
    }

    @Override
    public void add(Credit credit) {
        creditMapper.insert(credit);
    }
}
