package com.bosssoft.springboot5_31.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
    private Integer cid;
    private Integer uid;
    private Integer gid;
    private Integer quantity;
}
