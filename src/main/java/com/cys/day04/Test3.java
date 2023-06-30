package com.cys.day04;

import java.util.Arrays;
import java.util.Random;

/**
 * 题目三:生成10个随机数添加到数组当中，要求保证数据是唯一，不重复的。
 * 注意点：
 *  1，存储元素的时候只能用数组，不能用集合
 *  2，随机数的范围：11 ~ 73，包含11，也包含73
 */
public class Test3 {
    private static Random r =new Random();
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =r.nextInt(63);//r.nextInt(63) + 11;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
