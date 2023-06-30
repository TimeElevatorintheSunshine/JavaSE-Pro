package com.cys.day04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.invoke.SwitchPoint;
import java.util.*;


/**
 * 我们在逛淘宝的时候,搜索商品之后都可以按照价格从低到高显示,后面淘宝可能会出现新的商品,
 * 那么新添的商品也会按照价格从低到高重新排序,请设计一个程序,完成添加新商品之后价格重新排序.
 */
public class Demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Commodity> list = new ArrayList<>();
        Commodity c = new Commodity(999,"苹果");
        Commodity c1 = new Commodity(55,"香蕉");
        Commodity c2 = new Commodity(22,"西瓜");
        Commodity c3 = new Commodity(3333,"荔枝");
        list.add(c);
        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println("请录入产品名字");
        Commodity c4 = new Commodity();
        c4.setName(sc.next());
        System.out.println("请录入产品价格");
       c4.setPrice(sc.nextDouble());
       list.add(c4);
       list.sort((o1, o2) ->(int)( o1.getPrice() - o2.getPrice()));
        System.out.println(list.toString());


    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Commodity{
    private double price;
    private String name;


}
