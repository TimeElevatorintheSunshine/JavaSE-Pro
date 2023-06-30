package com.cys.day05;
//4.写一个方法，求int数组中元素的最小值

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {11, 55, 66, 44, 33, 44};

        System.out.println("最小值是：" +   min(arr));
    }
    public static int min (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        return min;
    }
}
