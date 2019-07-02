package com.itheima.demo.demo.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("路飞");
        col.add("索隆");
        col.add("香吉士");
        col.add("薇薇");
        col.add("甚平");
        System.out.println(col);
        System.out.println(col.contains("薇薇"));
        col.remove("薇薇");
        System.out.println(col);
        System.out.println(col.size());
        Object[] arr = col.toArray();
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();
        System.out.println(col.isEmpty());
        col.clear();
        System.out.println(col.isEmpty());
    }
}
