package com.cys.day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 题目四: 定义一个方法实现获取一个int数组：键盘录入数组的长度和随机数的范围（范围区间要大于数组长度），在数组中存储指定范围的随机数，并且随机数不能重复
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr()));

    }
    public static int[] arr(){
        System.out.println("请录入数组长度");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("请输入随机数范围（范围区间要大于数组长度）");
        Random r = new Random();
        int length = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(length);
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i !=j){
                    i--;
                    break;
                }
            }
        }return arr;
    }
}
