package com.cys.day08;

import java.util.Scanner;

/**
 * 题目四: 我国手机号码都是11位的，现在需要定义一个方法，方法名称为checkPhone，方法内需要实现判断手机号码是否合法。 规定： 1) 手机号码长度必须为11位数字; 2)
 * 手机号码第一位必须要是1; 键盘录入一个手机号码，在main方法中调用checkPhone方法，如果手机号符合要求，则输出手机号码的后四位。如果不符合要求，则提示手机号码错误。
 */
public class Test4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请录入手机号");
    String phoneNumber = sc.next();
    if (checkPhone(phoneNumber)) {
      System.out.println("手机号合法" + phoneNumber.substring(7, 11));
    } else {
      System.out.println("手机号错误");
    }
  }

  public static boolean checkPhone(String a) {
    if (a == null || a.length() != 11 || a.charAt(0) != '1') {
      return false;
    }
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) < '0' || a.charAt(i) > '9') {
        return false;
      }
    }
    return true;
  }
}
