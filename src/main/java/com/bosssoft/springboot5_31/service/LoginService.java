package com.bosssoft.springboot5_31.service;

import com.bosssoft.springboot5_31.pojo.dto.UserDTO;

import com.bosssoft.springboot5_31.pojo.vo.UserVO;

/**
 * 登录验证
 * @author xqr
 */
public interface LoginService {
    /**
     *调取密码
     * @Param: [userDTO]
     * @Return: java.lang.String
     */
    public String pwdByName(UserDTO userDTO);
    /**
     *密码验证
     * @Param: [userVO]
     * @Return: java.lang.String
     */
    public String verify(UserVO userVO);
}
