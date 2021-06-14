package com.bosssoft.springboot5_31.dao;


import com.bosssoft.springboot5_31.pojo.dto.CartDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 购物车连接数据库接口
 * @author xqr
 */
@Mapper
@Repository
public interface CartDao {
    /**
     *查看购物车
     * @Param: [cartDTO]
     * @Return: java.util.List<com.bosssoft.springboot5_31.pojo.dto.CartDTO>
     */
    public List<CartDTO> listCart(CartDTO cartDTO);
    /**
     *删除购物车中的商品
     * @Param: [cartDTO]
     * @Return: int
     */
    public int deleteCartGoods(CartDTO cartDTO);
    /**
     *
     * @Param: [cartDTO]
     * @Return: int
     */
    public int updateCart(CartDTO cartDTO);
    /**
     *在购物车中增加商品
     * @Param: [cartDTO]
     * @Return: int
     */
    public int addCart(CartDTO cartDTO);
}
