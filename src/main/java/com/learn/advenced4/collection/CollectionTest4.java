package com.learn.advenced4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionTest4 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("呵呵");
        c.add("哈哈");
        c.add("哼哼");
        c.add("拉拉");
        System.out.println(c);

       /* c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        c.forEach(s ->System.out.println(s));*/

        c.forEach(System.out::println);


    }
}
