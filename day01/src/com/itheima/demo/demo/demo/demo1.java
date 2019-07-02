package com.itheima.demo.demo.demo;
//请使用日期时间相关的API，计算出一个人已经出生了多少天。
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class demo1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日,格式为yyyy-MM-dd:");
        String birthday = sc.next();
        DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = date1.parse(birthday);
        Date date3 = new Date();
        System.out.println((date3.getTime()-date2.getTime())/1000/60/60/24/365);
    }
}
