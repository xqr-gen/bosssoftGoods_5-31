package com.bosssoft.springboot5_31.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListGoodsDTO {
    private List<GoodsDTO> list;
}
