package com.zxj.day18;

/** 需求：计算1-n的和的结果，使用递归思想解决。 分析: 我们先从数学思维上理解递归的流程和核心点 */
public class Question01 {
  public static void main(String[] args) throws Exception {

    System.out.println(sum(5));
  }

  public static int sum(int n) {
    if (n <= 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    } else {
      return sum(n - 1) + n;
    }
  }
}
