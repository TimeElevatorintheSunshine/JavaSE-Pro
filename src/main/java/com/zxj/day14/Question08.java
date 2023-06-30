package com.zxj.day14;

import java.util.Arrays;

/**
 * 某程序员编写了一个方法，该方法实现的逻辑是从传入的数组中找出最大值，
 * 但考虑到调用者可能会传入一个长度为0的数组，所以要给调用者进行相应的提示，
 * 但是Java中并没有合适的异常类名可以直观的让调用者明白出现的问题，
 * 该程序员想自己设计一个运行时异常ArrayLengthNotZeroException，为自己的方法提供服务，请帮其实现功能.
 */
public class Question08 {
    public static void main(String[] args) {
            int[] arr = {};
        System.out.println(max(arr));
    }
    public static int max(int []arr){
        if (arr == null){
            try {
                System.out.println("数组为空");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] <arr[i]){
                max = arr[i];
            }
        }return max;
    }
}
class ArraysLengthException extends RuntimeException{
    public ArraysLengthException() {
    }

    public ArraysLengthException(String message) {
        super(message);
    }
}