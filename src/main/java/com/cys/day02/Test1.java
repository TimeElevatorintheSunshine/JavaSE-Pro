package com.cys.day02;

import java.util.Scanner;

/**
 * 题目1：键盘录入三位同学的年龄，用程序实现获取这三个同学的最大年龄。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入第" + (i + 1) + "位同学年龄");
            arr[i] = sc.nextInt();
        }
      //  max(arr);
        System.out.println("最大年龄是：" + Math.max(arr[2], Math.max(arr[0], arr[1])));
    }
/*
    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大年龄是：" + max);
    }*/
}
