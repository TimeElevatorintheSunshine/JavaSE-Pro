package com.zxj.day16;

import java.util.HashSet;
import java.util.Scanner;

public class Question08 {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    System.out.println("请输入用户名");
    hashSet.add(new Scanner(System.in).nextLine());
    System.out.println("请输入用户名");
    hashSet.add(new Scanner(System.in).nextLine());
    while (hashSet.size() < 2) {
      System.out.println("用户名重复,请重新输入");
      hashSet.add(new Scanner(System.in).nextLine());
    }
    System.out.println("注册成功");
  }
}
