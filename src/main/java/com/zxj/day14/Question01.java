package com.zxj.day14;

import java.util.Arrays;

/**
 * 冒泡排序：每次找到最大值放到数组后面
 * 1、确定一共需要比较多少轮：数组长度-1
 * 2、确定每轮比较多少次：数组长度-1-轮数
 * 3、确定每次比较的两个数的下标：i和i+1
 * 4、比较两个数的大小，如果前面的数大于后面的数，交换位置
 */
public class Question01 {
    public static void main(String[] args) {

        int[] arr = {1,6,8,2,4,3,7,4};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j] > arr[j+1]){
                    arr[j] =arr[j] ^arr[j+1];
                    arr[j+1] =arr[j] ^arr[j+1];
                    arr[j] =arr[j] ^arr[j+1];

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
