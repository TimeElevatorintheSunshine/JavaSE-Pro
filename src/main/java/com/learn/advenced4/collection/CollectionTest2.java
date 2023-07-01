package com.learn.advenced4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("呵呵");
        c.add("哈哈");
        c.add("哼哼");
        c.add("拉拉");
        System.out.println(c);

        //1.从集合对象中获取迭代器对象
        Iterator<String> it = c.iterator();
        System.out.println(it.next());
        //2.使用循环结合迭代器遍历集合
                //当前位置有无数据
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
