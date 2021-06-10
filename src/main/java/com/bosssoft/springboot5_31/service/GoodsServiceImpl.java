package com.bosssoft.springboot5_31.service;



import cn.hutool.core.bean.BeanUtil;
import com.bosssoft.springboot5_31.dao.GoodsDao;
import com.bosssoft.springboot5_31.pojo.dto.GoodsDTO;
import com.bosssoft.springboot5_31.pojo.dto.PageDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements  GoodsService{
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public List<GoodsDTO> searchGoods(PageDTO pageDTO) {
        List<GoodsDTO> listGoods=new ArrayList<>();
        try {
            for (int i = 0; i < pageDTO.getLimit(); i++) {
                BeanUtil.copyProperties(goodsDao.listGoods(pageDTO).get(i), listGoods.get(i));
            }
            return listGoods;
        }catch (Exception e){
            return null;
        }
    }
}
