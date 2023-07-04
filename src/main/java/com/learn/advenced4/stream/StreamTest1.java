package com.learn.advenced4.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class StreamTest1 {
  public static void main(String[] args) {
    // Stream流的常用方法
    List<Double> scores = new ArrayList<>();
    Collections.addAll(scores, 88.3, 66.3, 12.4, 23.6, 18.3, 87.2, 99.0, 78.5);
    // 成绩大于等于60，升序后，再输出
    scores.stream().filter(s -> s >= 60).sorted().forEach(s -> System.out.println(s));

    Student s1 = new Student("吴京", 45, 199);
    Student s2 = new Student("冷锋", 23, 187);
    Student s3 = new Student("冷锋", 29, 213);
    Student s4 = new Student("冷锋", 29, 213);
    Student s5 = new Student("冷锋", 21, 178.3);
    Student s6 = new Student("冷锋", 25, 162.3);

    List<Student> students = new ArrayList<>();
    Collections.addAll(students, s1, s2, s3, s4, s5, s6);
    // 年龄大于等于23，小于30，并降序输出
    students.stream()
        .filter(s -> s.getAge() >= 23)
        .filter(s -> s.getAge() <= 30)
        .sorted((o1, o2) -> o2.getAge() - o1.getAge())
        .forEach(System.out::println);
    // 身高最高的三名学生并输出
    students.stream()
        .sorted(((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())))
        .limit(3)
        .forEach(System.out::println);
    // 取出身高倒数的2名，并输出
    students.stream()
        .sorted(((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())))
        .skip(students.size() - 2)
        .forEach(System.out::println);
    // 找出身高168的学生叫什么名字，要去去除重复的名字，在输出
    students.stream()
        .filter(s -> s.getHeight() > 168)
        .map(Student::getName)
        .distinct()
        .forEach(System.out::println);
    // distinct,去重复，自定义类型的对象
    students.stream().filter(s -> s.getHeight() > 168).distinct().forEach(System.out::println);
    // 合并两个流
    Stream<String> st1 = Stream.of("张三", "李四");
    Stream<String> st2 = Stream.of("张二", "李五");
    Stream<String> concat = Stream.concat(st1, st2);
    concat.forEach(System.out::println);
  }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
  private String name;
  private int age;
  private double height;
}
