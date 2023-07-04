package com.zxj.day17;

import java.util.*;

/**
 * 某商店想统计一下一天内所售出的商品以及商品的数量，请设计程序完成此需求,展示每个售出的商品名称和数量
 * 要求:通过键盘录入商品名称模拟售出的商品，录入一次表示商品售出一次，直到录入end结束,结束之后,将统计结果打印出来.运行结果如下:
 */
public class Question01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Goods, Integer> goods = new HashMap();
    while (true) {
      System.out.println("请录入商品名称，输入end结束录入");
      String s = sc.next();
      if (s.equals("end")) {
        Set<Map.Entry<Goods, Integer>> entries = goods.entrySet();
        for (Map.Entry<Goods, Integer> entry : entries) {
          System.out.println(entry.getKey().getName() + entry.getValue());
        }
        break;
      } else {
        Goods good = new Goods(s);
        if (goods.get(good) == null) {
          goods.put(good, 1);
        } else {
          goods.put(good, goods.get(good) + 1);
        }
      }
    }
  }
}

class Goods {
  private String name;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Goods goods = (Goods) o;
    return Objects.equals(name, goods.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  public Goods(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
