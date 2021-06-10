package com.bosssoft.springboot5_31.controller;


import cn.hutool.core.bean.BeanUtil;
import com.bosssoft.springboot5_31.pojo.dto.GoodsDTO;
import com.bosssoft.springboot5_31.pojo.dto.ListGoodsDTO;
import com.bosssoft.springboot5_31.pojo.dto.PageDTO;
import com.bosssoft.springboot5_31.pojo.vo.PageVO;
import com.bosssoft.springboot5_31.res.ResultResponse;
import com.bosssoft.springboot5_31.service.GoodsServiceImpl;
import com.bosssoft.springboot5_31.utils.Constants;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品界面
 * @author xqr
 */
@RestController
@Slf4j
public class GoodsController {
    @Autowired
    private GoodsServiceImpl goodsService;

    @PostMapping
    public ResultResponse listGoods(@RequestBody PageVO pageVO){
        ResultResponse res=new ResultResponse();
        PageDTO pageDTO=new PageDTO();
        BeanUtil.copyProperties(pageVO, pageDTO);
        try {
            List<GoodsDTO> listGoods =this.goodsService.searchGoods(pageDTO);
            if (listGoods != null) {
                //创建一个taken数据，封装到res对象中
                res.setCode(Constants.STATUS_OK);
                res.setMessage(Constants.MESSAGE_OK);
                res.setData(new ListGoodsDTO(listGoods));
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

}
