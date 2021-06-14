package com.bosssoft.springboot5_31.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author xqr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private long uid;
    private String uname;
    private String pwd;
}
