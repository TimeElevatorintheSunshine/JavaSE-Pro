package com.zxj.day04;

/**
 * 数组元素求最大值 15 9000 10000 20000 9500 -5
 */
public class Question04 {
    public static void main(String[] args) {
        int[] arr = {15,9000,10000,20000,9500,-5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max <arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值是" + max);
    }
}
