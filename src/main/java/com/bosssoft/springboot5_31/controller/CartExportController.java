package com.bosssoft.springboot5_31.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.bosssoft.springboot5_31.pojo.po.CartPO;

import com.bosssoft.springboot5_31.service.impl.CartExportServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: DEll
 * @Date: 2021/6/14 19:54
 */
@RestController
@Slf4j
public class CartExportController {
    @Autowired
    CartExportServiceImpl cartExportService;
    public void tool3Dao(){
        //导入到这里
        String path ="C:\\Users\\DELL\\Desktop\\1.xlsx";

        Integer count=cartExportService.getCount();
        Integer sheetNumber=count % 1000000 ==0? count/1000000: count/1000000 +1;

        ExcelWriter excelWriter= EasyExcel.write(path, CartPO.class).build();
        for (int i=1;i<sheetNumber;i++){
            List<CartPO> listByPAge=cartExportService.getListByPage(i);
            int j=i-1;
            WriteSheet sheet=EasyExcel.writerSheet("testNO"+j).build();
            excelWriter.write(listByPAge,sheet);
        }

        excelWriter.finish();
        System.out.println("导出成功");
    }


}
