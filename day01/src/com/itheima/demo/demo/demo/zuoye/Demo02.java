package com.itheima.demo.demo.demo.zuoye;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
public class Demo02 {
    public static void main(String[] args) throws Exception{
        String day = "2018-03-04";
        DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        date = date1.parse(day);
        DateFormat date2 = new SimpleDateFormat("yyyy年MM月dd日");
        String day1 = date2.format(date);
        System.out.println(day1);
    }
}
