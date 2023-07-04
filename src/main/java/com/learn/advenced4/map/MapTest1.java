package com.learn.advenced4.map;

import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {
  public static void main(String[] args) {
    // Map<String, Integer> map = new HashMap<>();  // 按照键 无序，不重复，无索引
    Map<Integer, String> map = new TreeMap<>(); // 可排序，不重复，无索引
    // Map<String, Integer> map = new LinkedHashMap<>(); // 有序，不重复，无索引
    map.put(1, "狗子");
    map.put(5, "狗子"); // 后面重复的数据会覆盖前面的数据（键）
    map.put(3, "猫子");
    map.put(6, "二愣子");
    map.put(4, "街溜子");
    System.out.println(map);
  }
}
