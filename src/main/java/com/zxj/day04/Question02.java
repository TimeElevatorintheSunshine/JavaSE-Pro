package com.zxj.day04;

import java.util.Scanner;

/**
 * 某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分做为选手得分。
 */
public class Question02 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int[] arr =new int[6];
        for (int i = 0 ; i < 6; i++) {
            System.out.println("请第" + (i +1) +"位评委打分");
            arr[i] = sc.nextInt();
        }
        System.out.println(average(arr));

    }
    public static double average (int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
