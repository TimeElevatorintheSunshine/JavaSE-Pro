package com.cys.day08;

/** 题目2.通过键盘录入两个字符串,使用StringBuilder,将两个字符串反转,把他们的结果拼接起来,达到如下效果: 输入:"abc" 输入:"123" 结果:"cba321" */
public class Test2 {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("abc");
    StringBuilder s1 = new StringBuilder("123");
    s.reverse().append(s1.reverse());
    System.out.println(s);
  }
}
