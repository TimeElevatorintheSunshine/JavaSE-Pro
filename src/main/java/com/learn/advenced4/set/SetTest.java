package com.learn.advenced4.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        //创建一个Set集合对象
        Set<Integer> s = new HashSet<>();//无序不重复无索引
        s.add(121);
        s.add(12123);
        s.add(523);
        s.add(155);
        s.add(155);
        s.add(155);
        System.out.println(s);

        Set<Integer> s1 = new LinkedHashSet<>();//有序不重复无索引
        s1.add(121);
        s1.add(12123);
        s1.add(523);
        s1.add(155);
        s1.add(155);
        s1.add(155);
        System.out.println(s1);
        Set<Integer> s2 = new TreeSet<>();//可排序（升序）不重复无索引
        s2.add(121);
        s2.add(12123);
        s2.add(523);
        s2.add(155);
        s2.add(155);
        s2.add(155);
        System.out.println(s2);
        //Set用到的Api基本上都是Collection提供的，自己几乎没有额外新增一些功能

    }
}
