package com.cys.day05;

/**
 * 5.写一个方法，求int数组中元素的和
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr = {11, 55, 66, 44, 33, 44};

        System.out.println("和是：" +   sum(arr));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }return sum;
    }
}
