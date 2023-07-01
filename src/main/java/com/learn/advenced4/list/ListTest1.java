package com.learn.advenced4.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("熊大");
        list.add("熊二");
        list.add("光头强");

        //for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //增强for循环
        for (String s:
             list) {
            System.out.println(s);
        }
        //lambda表达式
        list.forEach(System.out::println);

    }
}
