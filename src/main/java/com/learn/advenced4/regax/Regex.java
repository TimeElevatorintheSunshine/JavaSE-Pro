package com.learn.advenced4.regax;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        checkPhone();
    }
    public static void checkPhone (){
        System.out.println("请输入您的电话号码");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        while (true) {
            if (number.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")){
                System.out.println("您输入的成功");
                break;
            }else {
                System.out.println("错误");
            }
        }
    }
    public static void checkEmail (){
        System.out.println("请输入您的邮箱");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        while (true) {
            if (number.matches("")){
                System.out.println("您输入的成功");
                break;
            }else {
                System.out.println("错误");
            }
        }
    }
}
