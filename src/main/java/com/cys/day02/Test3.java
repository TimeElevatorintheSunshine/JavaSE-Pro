package com.cys.day02;

import java.util.Scanner;

/**
 * 题目2：有两只老虎，键盘录入两只老虎的体重，请用程序判断两只老虎的体重是否相同
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一只老虎体重");
        double tiger = sc.nextDouble();
        System.out.println("请录入第二只老虎体重");
        double tiger1 = sc.nextDouble();
        System.out.println(compare(tiger, tiger1));
    }
    public static boolean compare(double a ,double b){
        if (a == b){
            return true;
        }
        return false;
    }
}
