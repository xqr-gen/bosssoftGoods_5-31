package com.bosssoft.springboot5_31.pojo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xqr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartPO {
    private int cid;
    private int uid;
    private int gid;
    private int quantity;
}
