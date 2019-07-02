package com.itheima.demo.demo.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo{
    public static void main(String[] args){
        //使用多态形式创建集合对象
        Collection col = new ArrayList();
        //向集合中添加元素
        col.add("库里");
        col.add("汤普森");
        col.add("杜兰特");
        col.add("格林");
        col.add("考辛斯");
        //打印输出集合
        System.out.println(col);
        //判断格林是否在这个集合中
        System.out.println(col.contains("格林"));
        //删除格林这个球员
        col.remove("格林");
        //输出删除格林后的集合
        System.out.println(col);
        //计算这个集合现在的长度并输出
        int num = col.size();
        System.out.println(num);
        //把集合中的元素存到数组中
        Object[] arr = col.toArray();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        //判断集合是否为空的
        System.out.println(col.isEmpty());
        //清空集合
        col.clear();
        System.out.println(col);
        //判断现在集合是否为空的
        System.out.println(col.isEmpty());
    }
}
