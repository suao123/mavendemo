package com.demo.service.impl;

import com.demo.service.TenterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenderServiceimpl implements TenterpriseService {

    @Autowired
    private TenderMapper tenderMapper;

    @Override
    public List<Tender> list() {
        TenderExample example = new TenderExample();
        return tenderMapper.selectByExample(example);
    }

    @Override
    public void update(Tender tender) {
        tenderMapper.updateByPrimaryKey(tender);
    }

    @Override
    public void add(Tender tender) {
        tenderMapper.insert(tender);
    }

    @Override
    public Tender get(Integer t_id) {
        return tenderMapper.selectByPrimaryKey(t_id);
    }

    @Override
    public void delete(Integer t_id) {
        tenderMapper.deleteByPrimaryKey(t_id);
    }

    @Override
    public List<Tender> search(String keyword) {
        TenderExample example = new TenderExample();
        example.or().andTNameLike("%" + keyword + "%");
        return tenderMapper.selectByExample(example);
    }

    @Override
    public List<Tender> search_name(String t_name) {
        TenderExample example = new TenderExample();
        example.or().andTTnameLike("%" +  t_name +"%");
        return tenderMapper.selectByExample(example);
    }
}
