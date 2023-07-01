package com.learn.advenced4.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest3 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("呵呵");
        c.add("哈哈");
        c.add("哼哼");
        c.add("拉拉");
        System.out.println(c);
        //用增强for便利集合或者数组
        for (String ele:
             c) {
            System.out.println(ele);
        }
    }
}
