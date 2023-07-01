package com.learn.advenced4.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(3);
        s.add(5);
        s.add(1);
        s.add(1);
        System.out.println(s);

        Set<Teacher> s1 = new TreeSet<>(/*new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        }*/
                (Teacher o1, Teacher o2)->Double.compare(o1.getHeight(),o2.getHeight())
        );
        s1.add(new Teacher("灰太狼",99,66.6));
        s1.add(new Teacher("红太狼",199,166.6));
        s1.add(new Teacher("蕉太狼",59,636.6));
        s1.add(new Teacher("小灰灰",29,6.6));
        System.out.println(s1);

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static
    class Teacher implements Comparable<Teacher> {
        private String name;
        private int age;
        private double height;

        @Override
        public int compareTo(Teacher o) {
            return this.age - o.age;
        }
    }}

