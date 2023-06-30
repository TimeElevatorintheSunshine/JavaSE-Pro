package com.cys.day02;

import java.util.Scanner;

/**
 * 题目4: 键盘录入三个整数, 求三个整数最小值
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入第" + (i + 1) + "位整数");
            arr[i] = sc.nextInt();
        }
        //min(arr);
        System.out.println("最小值是：" + Math.min(arr[2], Math.min(arr[0], arr[1])));
    }
   /* public static void min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值是：" + min);
    }*/
}
