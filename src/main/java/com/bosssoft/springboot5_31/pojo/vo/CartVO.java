package com.bosssoft.springboot5_31.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartVO {
    @NotNull(message = "空的")
    private Integer cid;
    @NotNull(message = "空的")
    private Integer uid;
}
