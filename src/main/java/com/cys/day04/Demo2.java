package com.cys.day04;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 某公司人事举办了这样一个活动,凡是入职6周年的员工,赠送一个精美小礼品,
 * 于是员工纷纷去计算了自己的入职年限,请设计程序,帮同事们计算出入职年限.
 */
public class Demo2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        StringBuilder sb = new StringBuilder();
        int a =ld.getYear();
        System.out.println("请输入你的入职年份");
        StringBuilder sb1 = new StringBuilder();
         int year = a -  sc.nextInt();;
        System.out.println(year);
        if (year>=6){
            System.out.println("小礼品");
        }else {
            System.out.println("时间不够");
        }


    }

}
