package com.learn.advenced4.collection;

import java.util.*;

public class PeasantsVsLandlord {
  public static void main(String[] args) {
    /*
    1.总共有54张牌
    2.点数：3，4，5，6，7，8，9，10，J,Q,K,A,2
    3.花色：♠，♥，♣，♦
    4.大小王：🤡 🃏
    5.斗地主：发出51张牌，剩下三张坐底牌
     */
    String[] s = new String[] {"♠", "♥", "♣", "♦"};
    /*String s = "♠";
    String s1 = "♥";
    String s2 = "♣";
    String s3 = "♦";*/
    List<String> list = new ArrayList<>();

    list.add("🤡");
    list.add("🃏");
    for (int i = 0; i < 4; i++) {
      for (int j = 2; j <= 10; j++) {
        list.add(s[i] + j);
      }
      list.add(s[i] + "J");
      list.add(s[i] + "Q");
      list.add(s[i] + "K");
      list.add(s[i] + "A");
    }
    System.out.println(list);
    Collections.shuffle(list); // 打乱集合顺序
    System.out.println(list);
    List<String> s1 = new ArrayList<>();
    List<String> s2 = new ArrayList<>();
    List<String> s3 = new ArrayList<>();
    List<String> s4 = new ArrayList<>();

    int j = 0;
    for (int i = 0; i < 17; i++) {
      s1.add(list.get(j++));
      s2.add(list.get(j++));
      s3.add(list.get(j++));
    }
    for (int i = 0; i < 3; i++) {
      s4.add(list.get(j++));
    }
    /*for (int i = 0; i < s1.size(); i++) {
                if (s1.get(i) == "🤡") {
                    String temp = s1.get(i);
                    s1.set(i, s1.get(0));
                    s1.set(0, temp);
                }
                if (s1.get(i) == "🃏") {
                    if (s1.get(0) == "🤡") {
                        String temp = s1.get(i);
                        s1.set(i, s1.get(1));
                        s1.set(1, temp);
                    }else {
                        String temp = s1.get(i);
                        s1.set(i, s1.get(0));
                        s1.set(0, temp);
                    }

                }

            }
            for (int i = 0; i < s1.size(); i++) {
                if (s3.get(i) == "🤡") {
                    String temp = s3.get(i);
                    s3.set(i, s3.get(0));
                    s3.set(0, temp);
                }
                if (s3.get(i) == "🃏") {
                    if (s3.get(0) == "🤡") {
                        String temp = s3.get(i);
                        s3.set(i, s3.get(1));
                        s3.set(1, temp);
                    }else {
                        String temp = s3.get(i);
                        s3.set(i, s3.get(0));
                        s3.set(0, temp);
                    }
                }
            }
            for (int i = 0; i < s1.size(); i++) {
                if (s2.get(i) == "🤡") {
                    String temp = s2.get(i);
                    s2.set(i, s2.get(0));
                    s2.set(0, temp);
                }
                if (s2.get(i) == "🃏") {
                    if (s2.get(0) == "🤡") {
                        String temp = s2.get(i);
                        s2.set(i, s2.get(1));
                        s2.set(1, temp);
                    }else {
                        String temp = s2.get(i);
                        s2.set(i, s2.get(0));
                        s2.set(0, temp);
                    }
                }
            }

    */
    // 3，4，5，6，7，8，9，10，J,Q,K,A,2
    LinkedList<String> l = new LinkedList<>();
    LinkedList<String> l1 = new LinkedList<>();
    LinkedList<String> l2 = new LinkedList<>();
    String[] values = {
      "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "🃏", "🤡"
    };

    int a = 0;
    int c = 0;
    int count = 0;

    while (true) {
      if (s1.get(a).contains(values[c])) {
        l.addLast(s1.get(a));
        s1.remove(a);
        count++;
        a = 0;
        if (c == 15) {
          c = 0;
        }
        if (s1.size() == 0) {
          break;
        }
      } else {
        a++;
        if (a == (17 - count)) {
          a = 0;
          c++;
        }
      }
    }
    a = 0;
    c = 0;
    count = 0;

    while (true) {
      if (s2.get(a).contains(values[c])) {
        l1.addLast(s2.get(a));
        s2.remove(a);
        count++;
        a = 0;
        if (c == 15) {
          c = 0;
        }
        if (s2.size() == 0) {
          break;
        }
      } else {
        a++;
        if (a == (17 - count)) {
          a = 0;
          c++;
        }
      }
    }
    a = 0;
    c = 0;
    count = 0;
    while (true) {
      if (s3.get(a).contains(values[c])) {
        l2.addLast(s3.get(a));
        s3.remove(a);
        count++;
        a = 0;
        if (c == 15) {
          c = 0;
        }
        if (s3.size() == 0) {
          break;
        }
      } else {
        a++;
        if (a == (17 - count)) {
          a = 0;
          c++;
        }
      }
    }

    /* if (s1.contains("3")){
        l.addLast(s1.get(i));
    }
    if (s1.get(i).contains("4")){
        l.addLast(s1.get(i));
    }if (s1.get(i).contains("5")){
        l.addLast(s1.get(i));
    }
    if (s1.get(i).contains("6")){
        l.addLast(s1.get(i));
    }if (s1.get(i).contains("7")){
        l.addLast(s1.get(i));
    }
    if (s1.get(i).contains("8")){
        l.addLast(s1.get(i));
    }if (s1.get(i).contains("9")){
        l.addLast(s1.get(i));
    }
    if (s1.get(i).contains("10")){
        l.addLast(s1.get(i));
    }if (s1.get(i).contains("J")){
        l.addLast(s1.get(i));
    }
    if (s1.get(i).contains("Q")){
        l.addLast(s1.get(i));
    }if (s1.get(i).contains("K")){
        l.addLast(s1.get(i));
    }
    if (s1.get(i).contains("A")){
        l.addLast(s1.get(i));
    }if (s1.get(i).contains("2")){
        l.addLast(s1.get(i));
    }
    if (s1.get(i).contains("🃏")){
        l.addLast(s1.get(i));
    }if (s1.get(i).contains("🤡")){
        l.addLast(s1.get(i));
    }*/

    System.out.println(l);
    System.out.println(l1);
    System.out.println(l2);
    System.out.println(s4);
  }
}
