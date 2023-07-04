package com.zxj.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Question02 {
  public static void main(String[] args) {
    Map<Student, String> map = new HashMap<>();
    Student student = new Student("喜羊羊", "羊村");
    Student student1 = new Student("蜡笔小新", "埼玉县");
    Student student2 = new Student("蜘蛛侠", "美利坚");
    map.put(student, student.getOrigin());
    map.put(student1, student1.getOrigin());
    map.put(student2, student2.getOrigin());

    Set<Map.Entry<Student, String>> entries = map.entrySet();
    for (Map.Entry<Student, String> entry : entries) {
      System.out.println(entry.getKey() + entry.getValue());
    }
  }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
  private String name;
  private String origin;
}
