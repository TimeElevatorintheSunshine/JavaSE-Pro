package com.cys.day05;

/**
 * 8.写一个方法，对数组中的任意两个元素，交换位置
 */
public class Test8 {
    public static void main(String[] args) {
        int[] arr = {11, 55, 66, 44, 33, 44};
        exchange(arr,55,66);

    }
    public static void exchange(int[] arr ,int a,int b){
        int temp = a;
        for (int i = 0; i < arr.length; i++) {
                //55   55
            if (a == arr[i]){
                arr[i] =b;
            }else if (b == arr[i]){
                arr[i] = temp;
            }
        }
    }


}
