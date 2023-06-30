package com.zxj.day03;

import java.time.Instant;
import java.util.Scanner;

/**
 * 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
 */
public class Question11 {
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
}
