package com.zxj.day08;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. 键盘录入(也可以使用随机数)10个1-100之间的整数并存入数组中，随后遍历打印数组（元素都在一行打印）
 * 2. 找出数组中偶数元素并打印在控制台，要求每行打印两个元素
 */
public class Question03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        System.out.print("数组中的元素为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }

            if (count % 2 == 0) {
                System.out.println();
            }
        }
    }
}
