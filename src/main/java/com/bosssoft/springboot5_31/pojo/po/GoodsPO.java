package com.bosssoft.springboot5_31.pojo.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * @author xqr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsPO {
    @NotNull
    private int gid;
    private String goodsName;
    @Digits(integer=15,fraction=2)
    private double price;
}
