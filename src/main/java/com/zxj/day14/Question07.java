package com.zxj.day14;

import static java.lang.Math.*;

import java.util.ArrayList;

/**
 * 请使用Math 相关的API，计算在 -10.8  到5.9  之间，绝对值大于6  或者小于2.1 的整数有多少个？
 */
public class Question07 {
    // 10 9 8 7 2 1 0 1 2
    public static void main(String[] args) {
        int count = 0;
        for (double i = -10.8+1; i < 5.9 ; i++) {
            if (Math.abs(Math.floor(i)) > 6 || Math.abs(Math.floor(i)) <2.1){
                System.out.println(Math.floor(i));
                count++;
            }
        }
        System.out.println(count);

    }
}
