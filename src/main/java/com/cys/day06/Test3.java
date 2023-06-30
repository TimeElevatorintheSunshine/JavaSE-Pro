package com.cys.day06;

import java.util.Random;

/**
 * 题目三:随机生成5个随机数,随机数的范围在1-100之间(包含1,包含100)
 * 需求:
 * 求5个数的最大值.
 * 求5个数的最小值.
 * 求5个数的和.
 * 求5个数的平均数.
 */

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
       int max= arr[0];
       int min = 100;
       int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            if (max < arr[i]){
                max = arr[i];
            }if (min > arr[i]){
                min = arr[i];
            }
            sum += arr[i];
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        System.out.println("5个数的最大值" + max +",5个数的最小值" +min + ",5个数的和" + sum + ",5个数的平均值" + (sum/ arr.length));
    }
}
