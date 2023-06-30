package com.zxj.day03;

import java.math.BigDecimal;

/**
 * 有一个输出语句System.out.print("@")。使用这个语句，在控制台打印出一个五行的三角形，效果如下：
 * 	@
 * 	@@
 * 	@@@
 * 	@@@@
 * 	@@@@@
 */
public class Question18 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < count; i1++) {
                System.out.print("@");
            }
            System.out.println("");
            count++;
        }


    }
}
