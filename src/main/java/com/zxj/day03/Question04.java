package com.zxj.day03;

import java.util.Scanner;

/**
 * 需求：求1-5之间的数据和，并把求和结果在控制台输出。
 */
public class Question04 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始的数字：");
        int start = sc.nextInt();
        System.out.println("请输入结尾的数字：");
        int end = sc.nextInt();

        System.out.println(start + "~" + end + "之间的和是：" + sum(start, end));
    }

    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum += i;
        }return sum;
    }

}
