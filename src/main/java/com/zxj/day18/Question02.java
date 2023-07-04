package com.zxj.day18;
/**
 * 猴子第一天摘下若干桃子，当即吃了一半，觉得好不过瘾，于是又多吃了一个 第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个
 * 以后每天都是吃前天剩余桃子数量的一半，觉得好不过瘾，又多吃了一个 等到第10天的时候发现桃子只有1个了。 需求：请问猴子第一天摘了多少个桃子？
 */
public class Question02 {
  public static void main(String[] args) {
    /*
    f(n)
    f(n/2 - 1)
    f(n/2 - 1)/2 -1

     */
    System.out.println(f(1));
  }

  public static int f(int n) {

    if (n == 10) {
      return 1;
    } else {
      return 2 * (f(n + 1) + 1);
    }
  }
}
