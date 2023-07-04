package com.learn.advenced4.HashMap;

import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class HashMapTest1 {
  public static void main(String[] args) {
    Map<Teacher, String> map = new HashMap<>();
    map.put(new Teacher("小灰灰", 12), "狼堡");
    map.put(new Teacher("小灰灰", 12), "羊村");
    map.put(new Teacher("灰太狼", 12), "狼堡");
    map.put(new Teacher("红太狼", 12), "狼堡");
    System.out.println(map);
  }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Teacher {
  private String name;
  private int age;
}
