package com.bosssoft.springboot5_31.dao;


import cn.hutool.db.Page;

import com.bosssoft.springboot5_31.pojo.dto.PageDTO;
import com.bosssoft.springboot5_31.pojo.po.GoodsPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品连接数据库接口
 * @author DEll
 */
@Mapper
@Repository
public interface GoodsDao {
    /**
     *展示商品
     * @Param: [pageDTO]
     * @Return: java.util.List<com.bosssoft.springboot5_31.pojo.po.GoodsPO>
     */
    public List<GoodsPO> listGoods(PageDTO pageDTO);

}
