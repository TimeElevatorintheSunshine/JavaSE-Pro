package com.zxj.day03;

import java.util.Scanner;

/**
 * 系统密码是520，请用户不断地输入密码验证，
 * 验证不对输出：密码错误，
 * 验证成功输出：欢迎进入系统，并停止程序。
 */
public class Question09 {
    public static void main(String[] args) {
        int passNumber = 520;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码");

        while (true){
            if (sc.nextInt() == passNumber){
                System.out.println("欢迎进入系统");
                break;
            }else {
                System.out.println("密码错误，请重新输入：");
            }
        }
    }
}
