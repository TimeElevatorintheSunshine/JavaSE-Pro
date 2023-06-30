package com.cys.day04;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 要求:只需要校验用户名,密码以及邮箱(无需验证确认密码以及邮箱验证码)
 * 用户名:必须是大小写字母,数字,_组合
 * 1.包含至少一个大写字母
 * 2.至少包含一个小写字母
 * 3.至少包含一个数字
 * 4.至少包含一个下划线_
 * 5.所有元素出现位置随机
 * 6.长度【4-16】

 */
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println(sc.next().matches("[0-9]{1,4}"));
        while (true) {
            System.out.println("输入用户名");
            System.out.println(sc.next().matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[_])[a-zA-Z0-9_]{3,16}"));

        }

    }

}
