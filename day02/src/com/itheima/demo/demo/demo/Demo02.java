package com.itheima.demo.demo.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("麦迪");
        col.add("科比");
        col.add("奥尼尔");
        col.add("乔丹");
        col.add("詹姆斯");
        Iterator it = col.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
            System.out.println();
        }
        System.out.println();
        for (String str : col){
            System.out.print(str + " ");
            System.out.println(str.length());
        }
    }
}
