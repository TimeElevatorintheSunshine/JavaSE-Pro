package com.zxj.day14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二分查找
 * 定义变量记录左边和右边位置。
 * 使用while循环控制二分查询（条件是左边位置<=右边位置）
 * 循环内部获取中间元素索引
 * 判断当前要找的元素如果大于中间元素，左边位置=中间索引+1
 * 判断当前要找的元素如果小于中间元素，右边位置=中间索引-1
 * 判断当前要找的元素如果等于中间元素，返回当前中间元素索引
 */
public class Question03 {
    public static void main(String[] args) {
        int[] arr = {11,2,233,44,566,778,332,253,2342};
        Arrays.sort(arr);
        System.out.println(index(arr, 999));
        System.out.println(Arrays.binarySearch(arr, 2));

    }
    public static int index (int[]arr , int a){

        int left = 0;
        int right = arr.length-1;

           while (left <= right){
                int midIndex = (left + right)/2;
                if (arr[midIndex] > a){
                    right = midIndex -1;
                }
                else if (arr[midIndex] < a){
                    left = midIndex +1;
                }else {
                    return midIndex;

                }
            }return -1;


    }
}
