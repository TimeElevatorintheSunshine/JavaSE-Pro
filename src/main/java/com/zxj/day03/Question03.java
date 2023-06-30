package com.zxj.day03;

import java.util.Scanner;

/**
 * 需求: 键盘录入用户密码, 如果密码为 111111, 程序输出密码正确，否则输出密码有误
 */
public class Question03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("狗剩请输入密码!");
        while (true) {
            int data = in.nextInt();
            if (data == 11111){
                System.out.println("密码正确，你是天才!");
                break;
            }else {
                System.out.println("密码有误,回去好好想想！");
            }
        }
    }
}
