package com.bosssoft.springboot5_31.service;

import com.bosssoft.springboot5_31.pojo.dto.CartDTO;

import java.util.List;

/**
 * 购物车操作接口
 * @author xqr
 */
public interface CartService {
    /**
     *展示购物车
     * @Param: [cartDTO]
     * @Return: java.util.List<com.bosssoft.springboot5_31.pojo.dto.CartDTO>
     */
    public List<CartDTO> searchCart(CartDTO cartDTO);


    /**
     *对某一用户增加购物车
     * @Param: [cartDTO]
     * @Return: boolean
     */
    public boolean addCart(CartDTO cartDTO);
    /**
     *修改购物车
     * @Param: [cartDTO]
     * @Return: boolean
     */
    public boolean updateCart(CartDTO cartDTO);
    /**
     *删除购物车
     * @Param: [cartDTO]
     * @Return: boolean
     */
    public boolean deleteCartGoods(CartDTO cartDTO);
}
