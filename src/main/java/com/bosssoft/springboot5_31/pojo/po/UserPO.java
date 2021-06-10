package com.bosssoft.springboot5_31.pojo.po;

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
public class UserPO {
    @NotNull
    private long uid;
    private String uname;
    private String pwd;

}
