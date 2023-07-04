package com.learn.advenced4.recursion;

public class RecursiongTest1 {
  public static void main(String[] args) {
    /*
     * 需求：计算n的阶乘，5的阶乘=1*2*3*4*5; 6的阶乘=1*2*3*4*5*6；
     */
    System.out.println(recursion(6));
  }

  public static int recursion(int n) {
    int recursion = 1;
    while (true) {
      if (n > 0) {
        recursion *= n--;
      } else {
        break;
      }
    }
    return recursion;
  }
}
