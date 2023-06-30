package com.zxj.day05;

import java.util.Scanner;

/**
 * 求 1-n的和。
 */
public class Question01 {
    public static void main(String[] args) {
        System.out.print("请输入一个整数以求和：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }return sum;
    }
}
