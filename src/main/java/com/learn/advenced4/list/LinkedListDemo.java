package com.learn.advenced4.list;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        //创建一个队列
        LinkedList<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("入队请输入名字");
            queue.addLast(sc.next());
        }
        for (int i = 0; i < 10; i++) {
            queue.removeFirst();
        }
        System.out.println(queue);

        //可以设计栈，后进先出，先进后出
        //数据进入栈模型过程称为：压/进栈（push）
        //数据离开栈模型过程称为：弹/出栈（pop）
        LinkedList<String>  stank = new LinkedList<>();
        //压栈
        stank.push("第一颗");
        stank.push("第二颗");
        stank.push("第三颗");
        stank.push("第四颗");
        System.out.println(stank);
        //出栈
        System.out.println(stank.pop());
        System.out.println(stank.pop());
        System.out.println(stank);
    }
}
