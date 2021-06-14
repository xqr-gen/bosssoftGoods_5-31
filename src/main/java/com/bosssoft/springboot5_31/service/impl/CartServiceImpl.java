package com.bosssoft.springboot5_31.service.impl;


import com.bosssoft.springboot5_31.dao.CartDao;
import com.bosssoft.springboot5_31.pojo.dto.CartDTO;
import com.bosssoft.springboot5_31.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartDao cartDao;
    @Override
    public List<CartDTO> searchCart(CartDTO cartDTO) {
        List<CartDTO> listCert=new ArrayList<>();
        return cartDao.listCart(cartDTO);
    }

    @Override
    public boolean addCart(CartDTO cartDTO) {
        return cartDao.addCart(cartDTO)>0 ? true:false;
    }

    @Override
    public boolean updateCart(CartDTO cartDTO) {
        return cartDao.updateCart(cartDTO)>0 ? true:false;
    }

    @Override
    public boolean deleteCartGoods(CartDTO cartDTO) {
        return cartDao.deleteCartGoods(cartDTO)>0 ? true:false;

    }
}
