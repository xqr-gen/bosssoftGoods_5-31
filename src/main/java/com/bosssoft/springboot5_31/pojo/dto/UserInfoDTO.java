package com.bosssoft.springboot5_31.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfoDTO implements java.io.Serializable{

    private List<String> roles;
    private String introducation;
    private String avatar;
    private String name;
}
