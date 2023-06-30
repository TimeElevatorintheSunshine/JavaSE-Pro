package com.zxj.day03;

import com.sun.xml.internal.ws.util.StreamUtils;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏。
 */
public class Question08 {
    public static void main(String[] args) {
       Random r = new Random();
       int data = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请猜数字");
        while (true){
            int guess = sc.nextInt();
            if (data > guess){
                System.out.println("过小");
            }else if (data < guess){
                System.out.println("过大");
            }else {
                System.out.println("猜中了");
                break;
            }

        }

    }
}
