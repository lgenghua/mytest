package com.itheima.demo.demo.demo.zuoye;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
public class Demo01 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        String day = date1.format(date);
        System.out.println(day);
    }
}
