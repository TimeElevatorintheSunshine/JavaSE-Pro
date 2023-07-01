package com.learn.advenced4.list;

import java.util.LinkedList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        //ArrayList和LinkedList数据结构不同，存储、组织数据的方式
        //ArrayList，查询快，增删慢
        //链表中的结点是对独立的对象，在内存中是不连续的，每个结点包含数据值和笑一个结点的地址
        //链表查询慢，增删快
        //LinkedList集合的底层原理，基于双链表实现的，查询慢，增删快，首尾进行增删改查极快
        LinkedList<String> list = new LinkedList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        System.out.println(list);
        //在开头插入指定元素
        list.addFirst("666");
        System.out.println(list);
        //将指定元素追加到末尾
        list.addLast("777");
        System.out.println(list);
        //返回列表第一个元素
        System.out.println(list.getFirst());
        //返回列表最后一个元素
        System.out.println(list.getLast());
        //从此列表删除并返回第一个元素
        System.out.println(list.removeFirst());
        //从列表删除并返回最后一个元素
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
