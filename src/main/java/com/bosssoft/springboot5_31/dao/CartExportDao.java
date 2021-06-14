package com.bosssoft.springboot5_31.dao;

import com.bosssoft.springboot5_31.pojo.po.CartPO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


/**
 * @Author: DEll
 * @Date: 2021/6/14 19:46
 */

@Repository
public interface CartExportDao extends Mapper<CartPO> {
}