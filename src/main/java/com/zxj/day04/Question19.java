package com.zxj.day04;

import java.util.Scanner;

/**
 * 定义一个数组其中包含多个数字。用自己的方式最终实现，
 * 奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
 */
public class Question19 {
    public static void main(String[] args) {
        System.out.println("请录入数组从长度");
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
