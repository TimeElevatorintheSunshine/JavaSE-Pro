package com.zxj.day05;

import java.util.Scanner;

/**
 * 输出一个int类型的数组内容，要求输出格式为：[11, 22, 33, 44, 55]
 */
public class Question03 {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] array;

    public static void main(String[] args) {
        System.out.println("请输入数组长度");
        int n = scanner.nextInt();
     int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入第" + (i+1) + "个数字");
            arr[i] = scanner.nextInt();
        }
     print(arr);
    }

    public static void print(int []num) {
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i == num.length-1?num[i]:num[i] +"," );
        }
        System.out.println("]");
    }
}
