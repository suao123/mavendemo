package com.demo.service.impl;

import com.demo.dao.EnterpriseMapper;
import com.demo.model.Enterprise;
import com.demo.model.EnterpriseExample;
import com.demo.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EmptyStackException;
import java.util.List;


@Service
public class EnterpriseServiceimpl implements EnterpriseService {

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @Override
    public List<Enterprise> list() {
        EnterpriseExample example = new EnterpriseExample();
        return enterpriseMapper.selectByExample(example);
    }

    @Override
    public void updatePassword(String e_phone, String password) {
        Enterprise enterprise = get(e_phone);
        enterprise.setPwd(password);
        enterpriseMapper.updateByPrimaryKeySelective(enterprise);
    }

    @Override
    public void update(String e_phone, Enterprise enterprise) {
        Enterprise newenterprise = get(e_phone);
        newenterprise.setEnName(enterprise.getEnName());
        newenterprise.setPwd((enterprise.getPwd()));
        newenterprise.setEnBoss(enterprise.getEnBoss());
        newenterprise.setEnEmail(enterprise.getEnEmail());
        newenterprise.setEnEname(enterprise.getEnName());
        newenterprise.setEnState(enterprise.getEnState());
        enterpriseMapper.updateByPrimaryKeySelective(newenterprise);
    }

    @Override
    public Enterprise get(String e_phone) {
        return enterpriseMapper.selectByPrimaryKey(e_phone);
    }

    @Override
    public Enterprise get(String e_phone, String password) {
        EnterpriseExample example = new EnterpriseExample();
        example.or().andEnPhoneEqualTo(e_phone).andPwdEqualTo(password);
        List<Enterprise> result = enterpriseMapper.selectByExample(example);
        if(!result.isEmpty())
            return null;
        return result.get(0);
    }

    @Override
    public boolean isExist(String e_phone) {
        EnterpriseExample example = new EnterpriseExample();
        example.or().andEnPhoneEqualTo(e_phone);
        List<Enterprise> result = enterpriseMapper.selectByExample(example);
        if(!result.isEmpty())
            return true;
        return false;
    }

    @Override
    public void add(Enterprise enterprise) {
        enterpriseMapper.insert(enterprise);
    }
}
