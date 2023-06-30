package com.learn.advenced4.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        Integer[] arr= {11,66,22,44,33,55,88};
        Arrays.sort(arr,(o1,o2)-> o1-o2);
        System.out.println(Arrays.toString(arr));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        JFrame win =new JFrame("登录界面");
        JButton jButton = new JButton("我是按钮");
        jButton.addActionListener((e) -> System.out.println("我是一个按钮") );
        win.add(jButton);
        win.setSize(400,300);
        win.setVisible(true);

    }
}
