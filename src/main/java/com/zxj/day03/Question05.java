package com.zxj.day03;

import java.util.Scanner;

/**
 * 需求：求1-10之间的奇数和，并把求和结果在控制台输出。
 */
public class Question05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入开始的数字：");
        int start = in.nextInt();
        System.out.println("请输入结尾的数字：");
        int end = in.nextInt();
        System.out.println("区间内的奇数和结果为：" + sum(start, end));
    }

    public static int sum(int a, int b) {
       int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 ==1){
                sum += i;
            }
        }return sum;
    }
}
