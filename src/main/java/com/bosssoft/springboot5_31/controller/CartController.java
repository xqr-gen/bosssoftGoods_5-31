package com.bosssoft.springboot5_31.controller;


import cn.hutool.core.bean.BeanUtil;
import com.bosssoft.springboot5_31.pojo.dto.CartDTO;
import com.bosssoft.springboot5_31.pojo.dto.ListCartDTO;

import com.bosssoft.springboot5_31.pojo.vo.AddCartVO;
import com.bosssoft.springboot5_31.pojo.vo.CartVO;
import com.bosssoft.springboot5_31.res.ResultResponse;
import com.bosssoft.springboot5_31.service.CartServiceImpl;
import com.bosssoft.springboot5_31.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 增加删除修改购物车
 * @author DEll
 */
@RestController
@Slf4j
public class CartController {
    @Autowired
    CartServiceImpl cartService;

    @PostMapping
    public ResultResponse listCart(@RequestBody CartVO cartVO){
        ResultResponse res=new ResultResponse();
        CartDTO cartDTO =new CartDTO();
        BeanUtil.copyProperties(cartVO, cartDTO);
        try {
            List<CartDTO> listCert =this.cartService.searchCart(cartDTO);
            if (listCert != null) {
                //创建一个taken数据，封装到res对象中
                res.setCode(Constants.STATUS_OK);
                res.setMessage(Constants.MESSAGE_OK);
                res.setData(new ListCartDTO(listCert));
            } else {
                res.setCode(Constants.STATUS_FAIL);
                res.setMessage(Constants.MESSAGE_FAIL);
                res.setData("fail");
            }
        } catch (Exception e) {
            res.setCode(Constants.STATUS_FAIL);
            res.setMessage(Constants.MESSAGE_FAIL);
            res.setData("fail");
            e.printStackTrace();
        }
        return res;
    }
    @PostMapping
    public ResultResponse addCart(@RequestBody AddCartVO addCartVO){
        ResultResponse res =new ResultResponse();
        CartDTO cartDTO=new CartDTO();
        BeanUtil.copyProperties(addCartVO,cartDTO);
        try {
            if(this.cartService.addCart(cartDTO)){
                res.setCode(Constants.STATUS_FAIL);
                res.setMessage(Constants.MESSAGE_FAIL);
            }else {
                res.setCode(Constants.STATUS_OK);
                res.setMessage(Constants.MESSAGE_OK);
            }
        } catch (Exception e) {
            res.setCode(Constants.STATUS_FAIL);
            res.setMessage(Constants.MESSAGE_FAIL);
            e.printStackTrace();
        }
        return res;
    }
    @PostMapping
    public ResultResponse updateCart(@RequestBody AddCartVO addCartVO){
        ResultResponse res =new ResultResponse();
        CartDTO cartDTO=new CartDTO();
        BeanUtil.copyProperties(addCartVO,cartDTO);
        try {
            if(this.cartService.updateCart(cartDTO)){
                res.setCode(Constants.STATUS_FAIL);
                res.setMessage(Constants.MESSAGE_FAIL);
            }else {
                res.setCode(Constants.STATUS_OK);
                res.setMessage(Constants.MESSAGE_OK);
            }
        } catch (Exception e) {
            res.setCode(Constants.STATUS_FAIL);
            res.setMessage(Constants.MESSAGE_FAIL);
            e.printStackTrace();
        }
        return res;
    }
    @PostMapping
    public ResultResponse deleteCart(@RequestBody CartVO cartVO){
        ResultResponse res =new ResultResponse();
        CartDTO cartDTO=new CartDTO();
        BeanUtil.copyProperties(cartVO,cartDTO);
        try {
            if(this.cartService.deleteCartGoods(cartDTO)){
                res.setCode(Constants.STATUS_FAIL);
                res.setMessage(Constants.MESSAGE_FAIL);
            }else {
                res.setCode(Constants.STATUS_OK);
                res.setMessage(Constants.MESSAGE_OK);
            }
        } catch (Exception e) {
            res.setCode(Constants.STATUS_FAIL);
            res.setMessage(Constants.MESSAGE_FAIL);
            e.printStackTrace();
        }

        return res;
    }

}
