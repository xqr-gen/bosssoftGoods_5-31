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
    private Integer uid;
    @NotNull(message = "空的")
    private String uname;
    @NotNull(message = "空的")
    private String pwd;


}
