package com.zxj.day05;

import java.util.Scanner;

/**
 * 判断一个整数是奇数还是偶数，并把判断的结果输出出来。
 */
public class Question02 {
    public static void main(String[] args) {
        System.out.print("请输入一个整数以判断奇偶：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isOddOrEven(n);
    }

    public static void isOddOrEven(int num) {
        if (num == 0){
            System.out.println(0);
        }
      if (num % 2 == 0){
          System.out.println("该数是偶数");
      }else {
          System.out.println("该数是奇数");
      }
    }
}
