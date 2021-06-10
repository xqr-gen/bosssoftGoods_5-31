package com.bosssoft.springboot5_31.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotNull;

/**
 * @author xqr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class UserVO {
    @NotNull
    private String uname;
    @NotNull
    private String pwd;


}
