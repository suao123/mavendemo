package com.demo.service;

import java.util.List;

public interface TenterpriseService {
    /**
     * 列出所有招标书
     */
    List<Tender> list();

    /**
     * 增加一条数据
     *
     * @param tender
     */
    void add(Tender tender);

    /**
     * 通过id删除一条数据
     *
     * @param t_id
     */
    void delete(Integer t_id);

    /**
     * 更新一条数据
     *
     * @param tender
     */
    void update(Tender tender);

    /**
     * 根据t_id获取一条数据
     *
     * @param t_id
     * @return
     */
    Tender get(Integer t_id);

    /**
     * 根据keyword返回相应的招标书集合
     *
     * @param keyword
     * @return
     */
    List<Tender> search(String keyword);

    /**
     * 根据“企业名称”返回相应的产品集合
     *
     * @param t_name
     * @return
     */
    List<Tender> search_name(String t_name);
}

