package com.learn.advenced4.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest2 {
  public static void main(String[] args) {
    // 终结方法
    Student s1 = new Student("吴京", 45, 199);
    Student s2 = new Student("战狼", 23, 187);
    Student s3 = new Student("冷锋", 29, 213);
    Student s4 = new Student("冷锋", 29, 213);
    Student s5 = new Student("雪", 21, 178.3);
    Student s6 = new Student("飘", 25, 162.3);

    List<Student> students = new ArrayList<>();
    Collections.addAll(students, s1, s2, s3, s4, s5, s6);
    // count统计数量
    System.out.println(students.stream().filter(s -> s.getHeight() > 168).count());
    // max求最大值
    System.out.println(students.stream().max((o1, o2) -> o1.getAge() - o2.getAge()).get());
    // min求最小值
    System.out.println(students.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get());
    // 收集放入一个集合中,流只能收集一次
    List<Student> collect =
        students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toList());
    System.out.println(collect);

    Set<Student> collect2 =
        students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toSet());
    System.out.println(collect2);

    Map<String, Double> collect1 =
        students.stream()
            .filter(a -> a.getHeight() > 170)
            .distinct()
            .collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
    System.out.println(collect1);

    System.out.println(
        Arrays.toString(
            students.stream().filter(a -> a.getHeight() > 170).toArray(b -> new Student[b])));

    // System.out.println(students.stream().filter(a -> a.getHeight() > 170).toArray());
  }
}
