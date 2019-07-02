package com.itheima.demo.demo.demo;

public class demo4 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = builder.append("hello");
        System.out.println(builder);
        System.out.println(builder2);
        System.out.println(builder == builder2);
        System.out.println(builder.append(1).append(2).append("abx"));
        System.out.println(builder2);
    }
}
