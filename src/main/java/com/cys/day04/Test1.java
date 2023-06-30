package com.cys.day04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目一: 小柠檬去参加青年歌手大奖赛,有10个评委打分,去掉一个最高分一个最低分求平均分。
 * （提示：打分成绩控制台录入。）
 */
public class Test1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[]arr = new  int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i+1) + "评委打分");
            arr[i]  = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        int average = (sum - arr[0] -arr[arr.length-1])/(arr.length-2);
        System.out.println("平均分是" + average);

    }
}
