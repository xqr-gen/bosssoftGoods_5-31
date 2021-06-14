package com.bosssoft.springboot5_31.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * 登录期限 以及 密码加密token
 * @author xqr
 */
public class JwtUtil {
    public static final String TOKEN_LOGIN_NAME = "loginName";
    public static final String TOKEN_LOGIN_ID = "userId";
    public static final String TOKEN_SUCCESS = "success";
    public static final String TOKEN_FAIL = "fail";

    public static String creatToken(int uid,String uname) {
        HashMap<String, Object> map1 = new HashMap<>(2);
        int a=60*60*60*3;
        map1.put("typ", "JWT");
        map1.put("alg", "HS256");
        Calendar instance =Calendar.getInstance();
        instance.add(Calendar.SECOND,a);
        String token =JWT.create().withHeader(map1)
                .withClaim("id",uid)
                .withClaim("name",uname)
                .withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256("!@adhkajshd"));
        return token;
    }
    public static String verity(String token){
        //创建验证对象
        String result=TOKEN_SUCCESS;
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("!@adhkajshd")).build();
        DecodedJWT jwt= jwtVerifier.verify(token);
        result += jwt.getClaims().get("name").asString();
        return result;
    }
}















