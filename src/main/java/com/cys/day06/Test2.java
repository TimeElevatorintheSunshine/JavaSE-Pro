package com.cys.day06;

/**
 题目二: 打印1~1000以内能同时被2和3整除的数，两个一行、三个一行打印。例如：
 6 12
 18 24 30
 36 42
 48 54 60
 */
public class Test2 {
    public static void main(String[] args) {
        int count =0;
        int count1 = 2;
        for (int i = 1; i < 1000; i++) {
            if (i % 2 ==0 && i%3 ==0){
                count++;
                System.out.print(i +"\t");
                if (count1  == count){
                    System.out.println("");
                    count1 +=5;
                }
                if (count % 5 ==0){
                    System.out.println("");
                }
            }
        }
    }
}
