package com.cys.day03;
/**
 * 题目5: 求1-100之间所以的偶数和
 */

public class Test5 {
    public static void main(String[] args) {
        int count= 0;
        for (int i = 0; i <= 100; i+=2) {
            if (i != 0){
                count++;
            }
        }
        System.out.println(count);
    }

}
