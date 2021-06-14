package com.bosssoft.springboot5_31.service;

import com.bosssoft.springboot5_31.pojo.dto.GoodsDTO;
import com.bosssoft.springboot5_31.pojo.dto.PageDTO;

import java.util.List;

/**
 * 商品接口
 * @author xqr
 */
public interface GoodsService {
    /**
     *展示商品
     * @Param: [pageDTO]
     * @Return: java.util.List<com.bosssoft.springboot5_31.pojo.dto.GoodsDTO>
     */
    public List<GoodsDTO> searchGoods(PageDTO pageDTO);
}
