package com.zxj.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 如图所示:我们在逛淘宝的时候,会把喜欢的商品加入到购物车中,当我们第一次加入到购物车的时候, 购物车中该商品的数量会显示为1,如果我们添加的是同一个店铺的同一件商品,
 * 购物车中该商品的数量会增加1。但是如果添加的不是同一个店铺的商品不用,我们则认为不是同一件商品, 添加到购物车的时候就会当做新商品添加。请设计程序,完成将商品添加到购物车的需求. --购物车
 * ----店铺 ----店铺 ------商品名称 商品数量 ------商品名称 商品数量
 */
public class Question03 {
  public static void main(String[] args) {

    ShopCar shopCar = new ShopCar();

    shopCar.add();
  }
}

class ShopCar {
  Map<Good, Integer> goods = new HashMap<>();

  public void add() {

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("请选择店铺，如果不需要添加了请输入end");
      String shopName = sc.next();
      if (shopName.equals("end")) {
        Set<Map.Entry<Good, Integer>> entries = goods.entrySet();
        for (Map.Entry<Good, Integer> entry : entries) {
          System.out.println(
              entry.getKey().getShopName() + entry.getKey().getName() + entry.getValue());
          return;
        }
      } else {
        System.out.println("请添加商品");
        String name = sc.next();
        Good good = new Good(name, shopName);
        if (goods.get(good) == null) {
          goods.put(good, 1);
        } else {
          goods.put(good, goods.get(good) + 1);
        }
      }
    }
  }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Good {
  private String name;
  private String shopName;
}
