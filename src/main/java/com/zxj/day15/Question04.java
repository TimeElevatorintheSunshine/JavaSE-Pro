package com.zxj.day15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * 使用所学知识,完成"我的订单"业务需求
 * 我的每个订单中有很多订单项,而订单项都是由商品构成的,我们的账户上有可能有很多个订单,请设计一个程序完成订单,并将订单项中的每一个商品信息打印到控制台上!
 */
public class Question04 {
    public static void main(String[] args) {
        List<List<Goods>> bingDictionaries = new ArrayList<>();
        BingDictionary bingDictionary = new BingDictionary();
        List<Goods> addGoods = bingDictionary.addGoods();
        List<Goods> addGoods1 = bingDictionary.addGoods();
        List<Goods> addGoods2 = bingDictionary.addGoods();
        bingDictionaries.add(addGoods);
        bingDictionaries.add(addGoods1);
        bingDictionaries.add(addGoods2);
        System.out.println(bingDictionaries);

}

@Data
static class BingDictionary {
    public List<Goods> addGoods() {
        List<Goods> goods = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加商品名字");
        String name = sc.next();
        System.out.println("请输入要添加商品价格");
        double price = sc.nextDouble();
        goods.add(new Goods(name, price));
        return goods;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
static class Goods {
    private String name;
    private double price;

}}
