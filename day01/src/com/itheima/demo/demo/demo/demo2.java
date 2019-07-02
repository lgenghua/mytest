package com.itheima.demo.demo.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo2{
    public static void main(String[] args) throws Exception{
        /*Date date = new Date();
        DateFormat date1 = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
        String day = date1.format(date);
        System.out.println(day);*/

        /*Date date = new Date();
        DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(date1.format(date));*/

        String date = "1995-06-18 16:24:14";
        DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = date1.parse(date);
        System.out.println(date2);
    }
}
