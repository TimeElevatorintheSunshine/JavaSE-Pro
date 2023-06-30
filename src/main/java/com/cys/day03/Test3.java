package com.cys.day03;

/**
 * 题目3:编写程序，计算1+3+...+99的值，
 */
public class Test3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 99; i+=2) {
            sum +=i;
        }
        System.out.println("和是" + sum);
    }
}
