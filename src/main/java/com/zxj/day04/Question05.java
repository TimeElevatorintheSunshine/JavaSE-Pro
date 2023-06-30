package com.zxj.day04;

/**
 * 某个数组有5个数据：10,20,30,40,50，请将这个数组中的数据进行反转
 */
public class Question05 {
    public static void main(String[] args) {
       int[] arr = {10,20,30,40,50};
       reverse(arr);
        print(arr);
    }
    public static void reverse(int[] arr){
        for (int i = 0,j= arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void print (int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1?arr[i]:arr[i] + ",");
        }
        System.out.println("]");
    }
}
