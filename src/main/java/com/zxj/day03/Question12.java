package com.zxj.day03;

import java.util.Scanner;

/**
 *某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
 * 存期		年利率（%）
 * 一年		2.25
 * 两年		2.7
 * 三年		3.25
 * 五年		3.6
 * 请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
 * 提示：
 * 存入金额和存入年限均由键盘录入
 * 本息计算方式：本金+本金×年利率×年限
 */
public class Question12 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("请输入您存入金额");
        double setMoney = sc.nextDouble();
        System.out.println("请输入存入的年份");
        int year = sc.nextInt();
        double rate = 0;
        switch (year){
            case 1:
                rate = 0.0225;
                break;
                case 2:
                rate = 0.027;
                break;
                case 3:
               rate = 0.0325;
                break;
                case 5:
                rate =0.36;
                break;
            default:
                System.out.println("有误");
        }
        double money = setMoney + setMoney * rate * year;
        System.out.println("您的本息是：" + money);

    }
}
