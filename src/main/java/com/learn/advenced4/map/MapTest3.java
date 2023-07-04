package com.learn.advenced4.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTest3 {
  public static void main(String[] args) {
    Map<String, Double> map = new HashMap<>();
    map.put("GG棒", 55.5);
    map.put("小菲菲", 45.5);
    map.put("超人强", 155.5);
    map.put("小呆呆", 68.5);
    System.out.println(map);

    // 键找值
    Set<String> keys = map.keySet();
    System.out.println(keys);
    for (String key : keys) {
      double value = map.get(key);
      System.out.println(key + value);
    }

    // 键值对,获得键值对集合
    Set<Map.Entry<String, Double>> entries = map.entrySet();
    for (Map.Entry<String, Double> entry : entries) {
      System.out.println(entry.getKey() + entry.getValue());
    }

    // Lambda表达式
    map.forEach(
        (k, v) -> {
          System.out.println(k + v);
        });
    map.forEach(
        new BiConsumer<String, Double>() {
          @Override
          public void accept(String K, Double V) {
            System.out.println(K + V);
          }
        });
  }
}
