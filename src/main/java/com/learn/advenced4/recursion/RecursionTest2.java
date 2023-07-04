package com.learn.advenced4.recursion;

public class RecursionTest2 {
  public static void main(String[] args) {
    System.out.println(recursion(5));
  }

  public static int recursion(int n) {
    if (n == 1) {
      return 1;
    } else {
      return recursion(n - 1) * n;
    }
  }
}
