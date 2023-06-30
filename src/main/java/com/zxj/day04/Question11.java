package com.zxj.day04;


/**
 * 需求:
 * 现有一个整数数组{100,50,90,60,80,70}。
 * 请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
 */
public class Question11 {
    public static void main(String[] args) {
        int[] arr ={100,50,90,60,80,70};
        int min = arr[0];
        int max = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println((sum - max -min)/(arr.length-2));

    }
}
