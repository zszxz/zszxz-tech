package com.zszxz.hutool.excel;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.util.List;

/**
 * @Author lsc
 * <p> </p>
 */
public class Reader {

    // 读取excel
    public static void main(String[] args) {
        ExcelReader reader = ExcelUtil.getReader("C:/mydata/generator/writeMapTest.xlsx");
        // [[一班成绩单, 一班成绩单, 一班成绩单, 一班成绩单, 一班成绩单], [姓名, 年龄, 成绩, 是否合格, 考试日期], [张三, 18, 88.32, true, 2020-11-10 20:45:22], [张三, 18, 59.5, false, 2020-11-10 20:45:22]]
        List<List<Object>> readAll = reader.read();
        System.out.println(readAll);
    }
}
