package com.bosssoft.springboot5_31.dao;



import com.bosssoft.springboot5_31.pojo.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * @author DEll
 */
@Mapper
@Repository
public interface UserDao {
    /**
     *调用密码
     * @Param: [userPO]
     * @Return: java.lang.String
     */
    public String pwdByName(UserPO userPO);

}
