package com.bosssoft.springboot5_31.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDTO {
    @NotNull
    private int gid;
    private String goodsName;
    @Digits(integer=15,fraction=2)
    private double price;
}