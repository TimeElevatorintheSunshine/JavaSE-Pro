package com.cys.day03;

import java.util.Random;
import java.util.Scanner;

/**
 * 题目2：程序自动生成一个1-100之间的随机数字，实用程序实现猜出这个数字是多少？
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random r =new Random();
        System.out.println("请输入猜的数字");
        int number = r.nextInt(100)+ 1;
        while (true){
            int data = sc.nextInt();
            if (data > number){
                System.out.println("过大");
            } else if (data < number) {
                System.out.println("过小");
            }else {
                System.out.println("猜对了");
                break;
            }

        }
    }
}
