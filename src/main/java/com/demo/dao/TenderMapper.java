package com.demo.dao;

import com.demo.model.Tender;
import com.demo.model.TenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenderMapper {
    int countByExample(TenderExample example);

    int deleteByExample(TenderExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Tender record);

    int insertSelective(Tender record);

    List<Tender> selectByExample(TenderExample example);

    Tender selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Tender record, @Param("example") TenderExample example);

    int updateByExample(@Param("record") Tender record, @Param("example") TenderExample example);

    int updateByPrimaryKeySelective(Tender record);

    int updateByPrimaryKey(Tender record);
}