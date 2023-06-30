package com.cys.day04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 如图所示:当我们输入年份的时候,会自动计算2月份的天数,以及自动判断是否为闰年,一年有多少天,设计程序,实现此功能!
 */
public class Demo1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("请输入年份");
        int year = sc.nextInt();
        if (compare(year)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }

    }
    public static boolean compare(int year){
        Calendar now = Calendar.getInstance();
        now.set(year,2,1);
        int days = now.get(Calendar.DAY_OF_YEAR);
        now.set(year,1,1);
        int days1 = now.get(Calendar.DAY_OF_YEAR);
        Integer day = days - days1;

        return day.equals(29);

    }
}
