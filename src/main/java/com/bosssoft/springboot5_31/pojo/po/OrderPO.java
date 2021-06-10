package com.bosssoft.springboot5_31.pojo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;

/**
 * @author xqr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPO {
    private int cid;
    private int uid;

    @Digits(integer=15,fraction=2)
    private double tPrice;
    private int payStatus;
}
