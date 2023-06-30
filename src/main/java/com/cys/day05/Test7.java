package com.cys.day05;

/**
 * 7.写一个方法，求int数组中指定元素的索引，找到了返回索引，找不到返回-1
 */
public class Test7 {
    public static void main(String[] args) {
        int[] arr = {11, 55, 66, 44, 33, 44};
        System.out.println(index(arr, 33));

    }

    public static int index(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return i;
            }

        }
        return -1;
    }
}
