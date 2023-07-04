package com.zxj.day16.Question01;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生属性姓名和年龄，按照年龄进行排序并遍历。 定义学生类 创建TreeMap集合对象 创建学生对象 把学生添加到集合 遍历集合 TreeMap
 * 自定义比较器只是实现了自定义的键的排序，而不是值的排序
 */
public class Question01 {
  public static void main(String[] args) {
    Map<Student1, Integer> map =
        new TreeMap<Student1, Integer>(
            new Comparator<Student1>() {
              @Override
              public int compare(Student1 o1, Student1 o2) {
                return o2.getAge() - o1.getAge();
              }
            });
    Student1 student1 = new Student1("二狗", 33);
    Student1 student2 = new Student1("三郎", 28);
    Student1 student3 = new Student1("四纪", 45);
    map.put(student1, student1.getAge());
    map.put(student2, student2.getAge());
    map.put(student3, student3.getAge());
    System.out.println(map);
  }
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Student1 implements Comparable {
  private String name;
  private int age;

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
