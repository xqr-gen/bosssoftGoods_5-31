package com.bosssoft.springboot5_31.service.impl;

import com.bosssoft.springboot5_31.dao.CartExportDao;
import com.bosssoft.springboot5_31.pojo.po.CartPO;
import com.bosssoft.springboot5_31.service.CartExportService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: DEll
 * @Date: 2021/6/14 19:49
 */
@Service
public class CartExportServiceImpl implements CartExportService {
    @Autowired
    private CartExportDao cartExportDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Integer getCount() {
        return this.cartExportDao.selectCount(new CartPO());
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<CartPO> getListByPage(Integer pageon) {
        Integer begin =(pageon-1)*10000000+1;
        return cartExportDao.selectByRowBounds(new CartPO(),new RowBounds(begin,10000000));

    }
}
