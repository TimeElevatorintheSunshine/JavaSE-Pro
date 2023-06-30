package com.zxj.day03;

/**
 * 水仙花数是一个三位数
 * 水仙花数的个位、十位、百位的数字立方和等于原数
 */
public class Question01 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999 ; i++) {
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i / 100;
            if (Math.pow(ge,3) + Math.pow(shi, 3) + Math.pow(bai,3) == i){
                System.out.print(i + "\t");
            }
        }

    }
}
