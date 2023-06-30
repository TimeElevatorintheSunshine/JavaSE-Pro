package com.zxj.day04;

/**
 * 需求:
 * 	现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的和并打印。
 */
public class Question08 {
    public static void main(String[] args) {
        int[] arr = {100,50,90,60,80,70};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
