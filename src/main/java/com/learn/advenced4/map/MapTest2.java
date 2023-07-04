package com.learn.advenced4.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "狗子");
    map.put(5, "狗子"); // 后面重复的数据会覆盖前面的数据（键）
    map.put(3, "猫子");
    map.put(6, "二愣子");
    map.put(4, "街溜子");
    System.out.println(map);
    // 获取集合大小
    System.out.println(map.size());
    // 清空集合
    // map.clear();
    System.out.println(map);
    // 判断集合是否为空，为空返回true，反之
    System.out.println(map.isEmpty());
    // 根据键获取对应值
    System.out.println(map.get(3));
    // 根据键删除整个元素,返回燕来的值
    System.out.println(map.remove(3));
    // 判断是否包含某个键，包含返回true，反之
    System.out.println(map.containsKey(3));
    // 判断是否包含某个值
    System.out.println(map.containsValue("二流子"));
    // 获取Map集合的全部键
    System.out.println(map.keySet());
    // 获取Map集合的全部值
    System.out.println(map.values());
    // 把其他Map集合的数据导入自己集合中来
    Map<Integer, String> map1 = new HashMap<>();
    map1.put(2, "java");
    map1.put(4, "黑马");
    map1.putAll(map);
    System.out.println(map);
    System.out.println(map1);
  }
}
