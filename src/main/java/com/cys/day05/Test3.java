package com.cys.day05;

/**
 * 3.写一个方法，求int数组中元素的最大值
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {11, 55, 66, 44, 33, 44};

        System.out.println("最大值是：" +   max(arr));
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
}
