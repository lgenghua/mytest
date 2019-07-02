package com.itheima.demo.demo.demo.zuoye;
/*
分析以下需求，并用代码实现：
(1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
(2)判断该数字字符串数组中的数字字符串是否是对称
(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
(3)如：010 是对称的，3223 是对称的，123123 不是对称的；
(4)最终打印该数组中对称字符串的个数。

*/
public class Demo06 {
    public static void main(String[] args) {
        String[] str = {"010","3223","666","7890987","123123"};
        str(str);
    }
    public static void str(String[] arr){
        int sum = 0;
        for (String num:arr){
            StringBuilder str = new StringBuilder(num);
            if (num.equals(str.reverse().toString())){
                System.out.println(num + "是对称的");
                sum++;
            } else {
                System.out.println(num + "不是对称的");
            }
        }
        System.out.println("对称的总数为:" + sum);
    }
}
