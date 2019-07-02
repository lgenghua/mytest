package com.itheima.demo.demo.demo.zuoye;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//用程序判断2018年2月14日是星期几。
public class Demo03 {
    public static void main(String[] args) throws Exception{
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        String day = "2018年2月14日";
        DateFormat date1 = new SimpleDateFormat("yyyy年MM月dd日");
        date = date1.parse(day);
        cal.setTime(date);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
    }
}
