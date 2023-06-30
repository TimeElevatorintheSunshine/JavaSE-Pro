package com.zxj.day03;

import java.util.Scanner;

/**
 * 需求：键盘录入考试成绩，根据成绩所在的区间，程序打印出不同的奖励机制
 * 90 ~ 94  游乐园
 * 95 ~ 100 自行车
 * 80 ~ 89  玩具
 * 0  ~ 80  挨打
 */
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("狗剩你的成绩是多少？");
        int score = sc.nextInt();
        if (score >= 90 && score <= 94) {
            System.out.println("游乐园");
        } else if (score >= 95 && score <= 100) {
            System.out.println("自行车");
        } else if (score >= 80 && score <= 89) {
            System.out.println("玩具");
        } else {
            System.out.println("挨打");
        }

    }
}
