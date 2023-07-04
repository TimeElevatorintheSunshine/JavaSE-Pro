package com.zxj.day18;
/** 啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶， 请问10元钱可以喝多少瓶酒，剩余多少空瓶和盖子。 */
public class Question03 {
  public static int totalBottle;
  public static int residualLid;
  public static int residualBottle;

  public static void main(String[] args) {
    f(10);
    System.out.println(totalBottle);
    System.out.println(residualLid);
    System.out.println(residualBottle);
  }

  public static void f(int n) {
    int buyBottle = n / 2;
    totalBottle += buyBottle;

    int allLid = buyBottle + residualLid;
    int allBottle = buyBottle + residualBottle;
    int money = 0;
    if (allLid >= 4) {

      money += (allLid / 4) * 2;
    }
    residualLid = allLid % 4;
    if (allBottle >= 2) {

      money += (allBottle / 2) * 2;
    }
    residualBottle = allBottle % 2;
    if (money >= 2) {
      f(money);
    }
  }
}
