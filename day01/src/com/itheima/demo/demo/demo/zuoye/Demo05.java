package com.itheima.demo.demo.demo.zuoye;
/*
分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，
计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印
*/
public class Demo05 {
    public static void main(String[] args) {
        long num1 = System.currentTimeMillis();
        String a = "abc";
        StringBuilder b = new StringBuilder("def");
        for (int i=1;i<=100000;i++){
            a+="abc";
        }
        for (int j=1;j<=100000;j++){
            b.append("def");
        }
        String c = b.toString();
        long num2 = System.currentTimeMillis();
        System.out.println("拼接100000次花费时间与StringBuilder拼接100000次所花费时间为:" + (num2-num1)+ "毫秒");
    }
}
