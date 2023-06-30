package com.cys.day04;

import java.util.Scanner;

/**
 * 从随机生成10个1-100之间的整数存入数组。（包含1，包含100）。
 * 将生成的10个数，按照奇数在左边，偶数在右边进行打印输出元素。
 * 输出示例： 1,57,25,47,7,2,84,36,58,24
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("请录入数组长度");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0,z = 0,j= arr.length-1; i < arr.length; i++) {
            System.out.println("请录入第" + (i + 1) + "个数字");
            int data = sc.nextInt();
            if (data % 2  ==1){
                arr[z] = data;
                z++;
            }else {
                arr[j] = data;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }
    }
}
