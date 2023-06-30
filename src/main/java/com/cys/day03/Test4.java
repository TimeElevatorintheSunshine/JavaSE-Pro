package com.cys.day03;

/**
 * 题目4:统计1-100之间奇数的个数
 */
public class Test4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100; i+=2) {
            count++;
        }
        System.out.println(count);
    }
}
