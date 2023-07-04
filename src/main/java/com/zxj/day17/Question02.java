package com.zxj.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 某学校Java学科分为基础班和就业班: Java基础班: 001 李晨 002 范冰冰 Java就业班: 001 马云 002 马化腾
 * 使用HashMap嵌套HashMap方式完成存储数据,并遍历出所有的学生
 */
public class Question02 {
  public static void main(String[] args) {
    HashMap<String, HashMap<String, String>> map = new HashMap<>();
    HashMap<String, String> map1 = new HashMap<>();
    HashMap<String, String> map2 = new HashMap<>();
    map1.put("001", "李晨");
    map1.put("002", "范冰冰");
    map2.put("001", "马云");
    map2.put("002", "马化腾");
    map.put("Java基础班", map1);
    map.put("Java就业班", map2);
    // System.out.println(map);
    Set<Map.Entry<String, HashMap<String, String>>> entries = map.entrySet();
    for (Map.Entry<String, HashMap<String, String>> entry : entries) {
      System.out.println(entry.getKey() + entry.getValue());
    }
  }
}
