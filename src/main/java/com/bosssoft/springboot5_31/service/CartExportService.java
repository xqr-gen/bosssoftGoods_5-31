package com.bosssoft.springboot5_31.service;

import com.bosssoft.springboot5_31.pojo.po.CartPO;

import java.util.List;

/**
 * @Author: DEll
 * @Date: 2021/6/14 19:49
 */
public interface CartExportService {
    /**
     *
     * @Param: []
     * @Return: java.lang.Integer
     */
    public Integer getCount();
    /**
     *
     * @Param: [pageOn]
     * @Return: java.util.List<com.bosssoft.springboot5_31.pojo.po.CartPO>
     */
    public List<CartPO> getListByPage(Integer pageOn);
}
