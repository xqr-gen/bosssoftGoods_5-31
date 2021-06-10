package com.bosssoft.springboot5_31.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCartVO {
    private Integer cid;
    private Integer uid;
    private Integer gid;
    private Integer quantity;
}