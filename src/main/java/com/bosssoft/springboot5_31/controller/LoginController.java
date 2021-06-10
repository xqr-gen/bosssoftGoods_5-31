package com.bosssoft.springboot5_31.controller;


import com.bosssoft.springboot5_31.pojo.dto.UserInfoDTO;
import com.bosssoft.springboot5_31.pojo.vo.TokenVO;

import com.bosssoft.springboot5_31.pojo.vo.UserVO;
import com.bosssoft.springboot5_31.res.ResultResponse;
import com.bosssoft.springboot5_31.service.LoginServiceImpl;
import com.bosssoft.springboot5_31.utils.Constants;
import com.bosssoft.springboot5_31.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 登录
 * @author xqr
 */
@RestController
@Slf4j
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;

    @GetMapping
    public ResultResponse info(@RequestParam("token") TokenVO tokenVO) {
        ResultResponse res = new ResultResponse();
        //验证token是否有效

        String token=tokenVO.getToken();
        String tokenValue = JwtUtil.verity(token);

        //若ok返回对应的用户信息 否则返回500；

        if (tokenValue != null && tokenValue.startsWith(JwtUtil.TOKEN_SUCCESS)) {
            String username = tokenValue.replaceFirst(JwtUtil.TOKEN_SUCCESS, "");


            System.out.println("有效");

            UserInfoDTO info = new UserInfoDTO();

            info.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
            info.setIntroducation("测试用户");
            info.setName(username);
            List<String> roles = Arrays.asList("admin");
            info.setRoles(roles);
            //响应
            res.setData(info);
            res.setMessage(Constants.MESSAGE_OK);
            res.setCode(Constants.STATUS_OK);
        } else {
            res.setMessage(Constants.MESSAGE_FAIL);
            res.setCode(Constants.STATUS_FAIL);
            System.out.println("失败");
        }
        System.out.println("返回前端成功");

        return res;
    }

    @PostMapping
    public ResultResponse login(@Validated @RequestBody UserVO userVO) {
        ResultResponse res = new ResultResponse();

        try {
            // System.out.println(userVO);

            String u = this.loginService.verify(userVO);
            if (u != null) {
                //创建一个taken数据，封装到res对象中
                String token = JwtUtil.sign(u, "-1");
                res.setCode(Constants.STATUS_OK);
                res.setMessage(Constants.MESSAGE_OK);
                res.setData(new TokenVO(token));
            } else {
                res.setCode(Constants.STATUS_FAIL);
                res.setMessage(Constants.MESSAGE_FAIL + "用户名密码不匹配");
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
