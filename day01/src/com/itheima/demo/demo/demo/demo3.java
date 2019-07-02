package com.itheima.demo.demo.demo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class demo3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        /*System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1);
        cal.set(Calendar.YEAR,2010);
        System.out.println(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH)+1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
        cal.add(Calendar.YEAR,3);
        System.out.println(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH)+1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");*/
        /*System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());*/
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        System.arraycopy(a,2,b,3,2);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
