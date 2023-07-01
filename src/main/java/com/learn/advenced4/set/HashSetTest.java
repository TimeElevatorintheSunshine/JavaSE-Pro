package com.learn.advenced4.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        //哈希值，就是一个int类型的数值，Java中每个对象都有一个哈希值
        //java中所有对象，都可以调用Object类提供的hashCode方法，返回该对象自己的哈希值
        //public int hashCode():返回对象哈希值
        //同一个对象多次调用hashCode()方法哈希值是相同的
        //不同对象，他们的哈希值一百不相同，但也有可能相同(哈希碰撞)
        Student s1 = new Student("吴京", 45);
        Student s2 = new Student("冷锋", 45);
        Student s3 = new Student("冷锋", 45);
        Student s4 = new Student("冷锋", 45);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String str = new String("abc");
        String str1 = new String("acD");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private String name;
    private int age;
}