package com.itheima.demo.demo.demo.zuoye;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//用程序判断2018年2月14日是星期几。
public class demo3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个日期,格式为:yyyy年MM月dd日:");
        String day = sc.next();
        DateFormat date = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = date.parse(day);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK,date1.getDay());
        cal.setTime(date1);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
    }
}
