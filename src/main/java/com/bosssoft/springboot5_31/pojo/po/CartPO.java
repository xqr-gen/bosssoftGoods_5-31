package com.bosssoft.springboot5_31.pojo.po;

import com.alibaba.excel.annotation.ExcelProperty;
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
    @ExcelProperty(index = 1,value = "cid")
    private int cid;
    @ExcelProperty(index = 2,value = "uid")
    private int uid;
    @ExcelProperty(index = 3,value = "gid")
    private int gid;
    @ExcelProperty(index = 4,value = "quantity")
    private int quantity;
}
