package com.cys.day06;

import java.util.Random;

//题目一:定义返回值类型为int类型，名为 getScore(int[] arr)的方法，方法内完成：获取指定数组arr中大于平均值的元素的个数，并返回
//定义main方法，方法内完成：
//1）.定义一个长度为5的int数组arr
//2）.使用随机数生成5个范围为1-99的数字存入arr中（包含1和99），之后打印数组
//3）.传递arr调用getScore(int[] arr)方法，获取方法返回值并在控制台打印输出该返回值
public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99) + 1;
            System.out.print(arr[i] +"\t");
        }
        System.out.println("");
        System.out.println(getScore(arr));


    }
    public static int getScore(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum / arr.length;
    }
}

