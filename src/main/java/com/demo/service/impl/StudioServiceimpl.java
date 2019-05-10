package com.demo.service.impl;

import com.demo.dao.StudioMapper;
import com.demo.model.Studio;
import com.demo.model.StudioExample;
import com.demo.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudioServiceimpl  implements StudioService {

    @Autowired
    private StudioMapper studioMapper;

    @Override
    public Studio get(String s_phone, String password) {
        StudioExample example = new StudioExample();
        example.or().andSPhoneEqualTo(s_phone).andPwdEqualTo(password);
        List<Studio> result = studioMapper.selectByExample(example);
        if(!result.isEmpty())
            return null;
        return result.get(0);
    }

    @Override
    public Studio get(String s_phone) {
        StudioExample example = new StudioExample();
        example.or().andSPhoneEqualTo(s_phone);
        List<Studio> result = studioMapper.selectByExample(example);
        if(!result.isEmpty())
            return null;
        return result.get(0);
    }

    @Override
    public List<Studio> list() {
        StudioExample example = new StudioExample();
        return studioMapper.selectByExample(example);
    }

    @Override
    public boolean isExist(String s_phone) {
        StudioExample example = new StudioExample();
        example.or().andSPhoneEqualTo(s_phone);
        List<Studio> result = studioMapper.selectByExample(example);
        if(!result.isEmpty())
           return false;
        return true;
    }

    @Override
    public void updatePassword(String s_phone, String password) {
            Studio studio = get(s_phone);
            studio.setPwd(password);
            studioMapper.updateByPrimaryKey(studio);
    }

    @Override
    public void update(String s_phone, Studio studio) {
        Studio newstudio = new Studio();
        newstudio.setPwd(studio.getPwd());
        newstudio.setsEmail(studio.getsEmail());
        newstudio.setsName(studio.getsName());
        newstudio.setsPhone(studio.getsPhone());
        newstudio.setsSname(studio.getsSname());
        newstudio.setsState(studio.getsState());
        studioMapper.updateByPrimaryKey(studio);
    }

    @Override
    public void add(Studio studio) {
        studioMapper.insert(studio);
    }

    @Override
    public List<Studio> search(String keyword) {
        StudioExample example = new StudioExample();
        example.or().andSSnameLike("%" + keyword + "%");
        return studioMapper.selectByExample(example);
    }
}
