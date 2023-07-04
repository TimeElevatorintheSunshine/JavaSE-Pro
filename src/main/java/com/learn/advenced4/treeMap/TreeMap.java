package com.learn.advenced4.treeMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeMap {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("张无忌");
    list.add("周芷若");
    list.add("赵敏");
    list.add("张强");
    list.add("张三丰");
    List<String> list1 = new ArrayList<>();
    for (String s : list) {
      if (s.length() == 3 && s.startsWith("张")) {
        list1.add(s);
      }
    }
    System.out.println(
        list.stream()
            .filter(s -> s.startsWith("张"))
            .filter(a -> a.length() == 3)
            .collect(Collectors.toList()));
  }
}
