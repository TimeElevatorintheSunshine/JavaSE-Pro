package com.cys.day05;

import java.util.Arrays;
import java.util.Random;

/**
 * 9.写一个方法，对数组中的元素打乱顺序
 */
public class Test9 {
    public static void main(String[] args) {
        int[] arr = {11, 55, 66, 44, 33, 44};
        confusion(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void confusion(int[] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int data = r.nextInt(arr.length);
            if (data != i) {
                arr[i] = arr[i] ^ arr[data];
                arr[data] = arr[i] ^ arr[data];
                arr[i] = arr[i] ^ arr[data];
            }else {
                i--;
            }
        }
    }
}
