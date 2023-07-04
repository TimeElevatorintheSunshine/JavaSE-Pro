package com.cys.day08;

import java.util.Scanner;

/**
 * 题目3: 定义一个String类型的数组,长度为3,利用键盘录入为其赋值 定义一个方法,功能如下,外界传入一个字符串数组,该方法能够将该数组中所有长度小于3的元素打印出来
 * 在主方法中调用该方法,传入我们准备好的数组,将满足条件的元素打印出来
 */
public class Test3 {
  public static void main(String[] args) {
    String[] arr = new String[3];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      System.out.println("请录入第" + (i + 1) + "字符串");
      arr[i] = sc.next();
    }
    print(arr);
  }

  public static void print(String[] arr) {
    if (arr.length == 0) {
      System.out.println(0);
    }
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i < 3) {
        System.out.print(i == 2 ? arr[i] : arr[i] + ",");
      }
    }
    System.out.println("]");
  }
}
