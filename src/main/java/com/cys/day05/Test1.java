package com.cys.day05;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Random;
import java.util.Scanner;

/**
 * 1.写一个方法，能够随机产生若干个[1,100]范围内的随机数，存储到数组中，并把数组返回
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("输入数组长度");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = arr(number);
    }

    public static int[] arr(int n) {
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        return arr;
    }

}
