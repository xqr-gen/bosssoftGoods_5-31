package com.bosssoft.springboot5_31.pojo.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DEll
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageVO {
    private Integer limit;
    private Integer pageNO;


}
