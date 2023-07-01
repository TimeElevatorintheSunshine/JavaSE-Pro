package com.learn.advenced4.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //创建一个Arraylist集合对象（有序，可重复，有索引）
        List<String> list = new ArrayList<>();
        list.add("熊大");
        list.add("熊二");
        list.add("光头强");
        list.add("小红帽");
        System.out.println(list);
        //在某个索引位置插入元素
        list.add(2,"喜羊羊");
        System.out.println(list);
        //根据索引删除元素，返回被删除的元素
        System.out.println(list.remove(2));
        //返回集合中指定位置的元素
        System.out.println(list.get(2));
        //修改索引位置处的元素，修改成功后，会返回原来的数据
        System.out.println(list.set(2, "懒洋洋"));

    }
}
