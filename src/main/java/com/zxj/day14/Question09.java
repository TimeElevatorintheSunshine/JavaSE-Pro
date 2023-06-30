package com.zxj.day14;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 我们使用转账的时候,输入金额之后小数点后面只能输入到2位,而在程序内部,实际上是把输入的元,转成了分去操作了,当我们转成功之后,会再把分变成元来展示给用户们,请设计程序,完成所描述的需求
 * 提示:直接将元转成分,再将分转成元(至于软件内部怎么操作分的,我们无需关心)
 */
public class Question09 {
    public static void main(String[] args) {
        double money = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入金额");
        double sendMoney  = sc.nextDouble();
        System.out.println(BigDecimal.valueOf(money).multiply(BigDecimal.valueOf(100)).subtract(BigDecimal.valueOf(sendMoney).multiply(BigDecimal.valueOf(100))).divide(BigDecimal.valueOf(100)));

    }
}
