package com.zxj.day16;

import java.util.ArrayList;
import java.util.List;

/**
 * List<String> list = new ArrayList<>(); list.add("张无忌"); list.add("周芷若"; list.add("赵敏";
 * list.add("张强"; list.add("张三丰"); 把集合中所有以“张”开头，且是3个字的元素存储到一个新的集合。
 */
public class Question04 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("张无忌");
    list.add("周芷若");
    list.add("赵敏");
    list.add("张强");
    list.add("张三丰");
    List<String> list1 = new ArrayList<>();
    /*for (int i = 0; i < list.size(); i++) {
      if (list.get(i).length() == 3 && list.get(i).startsWith("张")) {
        list1.add(list.get(i));
      }
    }*/
    for (String s : list) {
      if (s.length() == 3 && s.startsWith("张")) {
        list1.add(s);
      }
    }

    System.out.println(list1);
  }
}
