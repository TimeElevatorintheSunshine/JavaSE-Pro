package com.zxj.day04;

import java.util.Scanner;

/**
 * 某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
 */
public class Question01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "名员工的销售额");
            sum += sc.nextInt();
        }
        System.out.println("总销售额是" + sum);
    }
}
