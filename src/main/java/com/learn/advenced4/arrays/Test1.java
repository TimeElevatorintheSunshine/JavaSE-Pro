package com.learn.advenced4.arrays;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {5, 1, 2, 3, 6, 7, 8, 0, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 8));


    }

    /**
     *二分查找
     * @param arr 排序的数组
     * @param data 查找的索引
     * @return 元素不存在返回-1
     */
    public static int binarySearch(int[] arr ,int data){
        //定义左边位置，右边位置
        int left=0;
        int right = arr.length-1;
        while (left <=right){
            int midIndex = (left + right)/2;
            if (data > arr[midIndex]){
                left = midIndex +1;
            } else if (data <arr[midIndex]) {
                right = midIndex -1;
                
            }else {
                return midIndex;
            }
        }return -1;

    }
    }
