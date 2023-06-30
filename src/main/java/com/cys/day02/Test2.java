package com.cys.day02;

import java.util.Scanner;

/**
 * 题目3: 键盘录入一个整数,判断这个数是奇数还是偶数
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int number = sc.nextInt();
        System.out.println(judge(number));
    }

    public static String judge(int a) {
        if (a == 0) {
            return "0";
        }
        if (a % 2 == 0) {
            return a + "是偶数";
        }
        return a + "是奇数";

    }
}
