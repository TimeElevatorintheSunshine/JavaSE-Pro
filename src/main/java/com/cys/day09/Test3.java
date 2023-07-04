package com.cys.day09;

import java.util.ArrayList;
import java.util.Collections;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 第三题: 一: 定义一个学生类, 包含 姓名 学科 成绩 三个属性 创建三个学生对象 把三个学生对象添加到list集合中 1.打印出 语文成绩最高的分数 2.
 * 求三名学生语文成绩的平均值(不考虑小数)
 */
public class Test3 {
  public static void main(String[] args) {
    Student s1 = new Student("张三", "语文", 78);
    Student s2 = new Student("李四", "语文", 68);
    Student s3 = new Student("王五", "语文", 98);
    ArrayList<Student> s = new ArrayList<>();
    Collections.addAll(s, s1, s2, s3);
    int max = 0;
    int sum = 0;
    for (int i = 0; i < s.size(); i++) {
      if (max < s.get(i).getScore()) {
        max = s.get(i).getScore();
      }
      sum += s.get(i).getScore();
    }
    System.out.println("语文最高" + max + "平均分是" + (sum / 3));
  }
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Student {
  private String name;
  private String subject;
  private int score;
}
