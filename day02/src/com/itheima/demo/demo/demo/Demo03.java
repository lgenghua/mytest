package com.itheima.demo.demo.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args){
        Collection<Integer> col = new ArrayList<>();
        col.add(30);
        col.add(11);
        col.add(1);
        col.add(24);
        col.add(23);
        Iterator it = col.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for (int num : col){
            System.out.print(num + " ");
        }
    }
}
