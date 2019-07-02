package com.itheima.demo.demo.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
按照斗地主的规则，完成洗牌发牌的动作。
具体规则：
使用54张牌打乱顺序,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
- 准备牌：
  牌可以设计为一个ArrayList<String>,每个字符串为一张牌。
  每张牌由花色数字两部分组成，我们可以使用花色集合与数字集合嵌套迭代完成每张牌的组装。
  牌由Collections类的shuffle方法进行随机排序。
- 发牌
  将每个人以及底牌设计为ArrayList<String>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
- 看牌
  直接打印每个集合。

*/
public class Demo04 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> num = new ArrayList<>();
        ArrayList<String> pokers = new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♦");
        color.add("♣");
        for (int i = 2; i <= 10; i++) {
            num.add(i + "");
        }
        num.add("J");
        num.add("Q");
        num.add("K");
        num.add("A");
        for (String a : color) {
            for (String b : num) {
                String c = a + b;
                pokers.add(c);
            }
        }
        pokers.add("小王");
        pokers.add("大王");
        System.out.println(pokers);
        System.out.println(pokers.size());
        Collections.shuffle(pokers);
        System.out.println(pokers);
        System.out.println();
        Collection<String> player1 = new ArrayList<>();
        Collection<String> player2 = new ArrayList<>();
        Collection<String> player3 = new ArrayList<>();
        Collection<String> diPai = new ArrayList<>();
        for (int j = 0; j < pokers.size(); j++) {
            String d = (String) (pokers).get(j);
            if (j >= pokers.size() - 3) {
                diPai.add(pokers.get(j));
            } else if (j % 3 == 0) {
                player1.add(pokers.get(j));
            } else if (j % 3 == 1) {
                player2.add(pokers.get(j));
            } else {
                player3.add(pokers.get(j));
            }
        }
        System.out.println(player1);
        System.out.println(player1.size());
        System.out.println(player2);
        System.out.println(player2.size());
        System.out.println(player3);
        System.out.println(player3.size());
        System.out.println(diPai);
        System.out.println(diPai.size());
    }
}
