package com.cys.day05;

/**
 * 2.写一个方法，打印数组中的元素, 格式是：[元素1,元素2,元素3]
 */

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44};
        print(arr);
    }
    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1? arr[i]: arr[i] + ",");
        }
        System.out.println("]");
    }
}

