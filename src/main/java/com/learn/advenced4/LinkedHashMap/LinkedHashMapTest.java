package com.learn.advenced4.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
  public static void main(String[] args) {
    Map<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "狗子");
    map.put(5, "狗子");
    map.put(3, "猫子");
    map.put(6, "二愣子");
    map.put(4, "街溜子");
    System.out.println(map);
  }
}
