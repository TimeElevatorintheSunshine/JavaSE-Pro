package com.cys.day05;

/**
 * 6.写一个方法，求int数组中元素的平均值
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr = {11, 55, 66, 44, 33, 44};

        System.out.println("平均值是：" + average(arr));

    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum * 1.0 / arr.length;
    }
}
