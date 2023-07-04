package com.cys.day08;

import java.util.Scanner;

/** 题目1.键盘录入一个字符串,统计录入的字符串中的大写字母,小写字母,数字分别有多少个? */
public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请录入字符串");
    String s = sc.next();
    int count = 0;
    int count1 = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        count++;
      } else if (s.charAt(i) >= 'A' && s.charAt(i) >= 'Z') {
        count1++;
      }
    }
    System.out.println(
        "大写字母:" + count1 + ",数字:" + count + ",小写字母：" + (s.length() - count1 - count));
  }
}
