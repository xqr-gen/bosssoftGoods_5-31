package com.bosssoft.springboot5_31.service;


import cn.hutool.core.bean.BeanUtil;
import com.bosssoft.springboot5_31.dao.UserDao;
import com.bosssoft.springboot5_31.pojo.dto.UserDTO;
import com.bosssoft.springboot5_31.pojo.po.UserPO;
import com.bosssoft.springboot5_31.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xqr
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserDao userDao;


    @Override
    public String pwdByName(UserDTO userDTO){
        UserPO userPO=new UserPO();
        BeanUtil.copyProperties(userPO, userDTO);
        return userDao.pwdByName(userPO);
    }


    @Override
    public String verify(UserVO userVO) {

        String n=null;
        n=userVO.getPwd();
        UserDTO userDTO =new UserDTO();
        BeanUtil.copyProperties(userVO, userDTO);
        if (n != null) {
            if (!n.equals(pwdByName(userDTO))) {
                n = null;
            } else {
                System.out.println("密码正确");
            }
        }
        return n;
    }


}
