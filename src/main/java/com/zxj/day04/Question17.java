package com.zxj.day04;

/**
 * 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
 * 再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，
 * 并且数组的元素依旧是从小到大排列的。执行效果如下：
 * 请输入一个整数数字：
 * 50
 * 生成的新数组是：12 14 23 45 50 66 68 70 77 90
 */
public class Question17 {
    public static void main(String[] args) {
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] arr1 = new int[arr.length+1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (50>arr[i]){
                index++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (i<index){
                arr1[i] =arr[i];
            }if (i >index){
                arr1[i] = arr[i -1];
            }else {
                arr1[index] = 50;
            }
            System.out.print(arr1[i]+ "\t");
        }

    }
}
