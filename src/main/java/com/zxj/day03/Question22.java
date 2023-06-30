package com.zxj.day03;

/**
 * 有一个容量为10L的空水桶。水桶的上面开始往里灌水，同时下面开始往出流水。
 * 第一分钟灌水的速度是1L/min，
 * 第二分钟灌水的速度是2L/min，
 * 第三分钟灌水的速度是3L/min，
 * 以此类推。而流水的速度固定是3L/min。
 * 那么几分钟之后，水桶里能保持灌满水的状态？
 */
public class Question22 {
    public static void main(String[] args) {
        int water = 0;
        for (int i = 1; i < 10; i++) {
            if (i - 3 >0){
                water += i -3;
            }
            if (water == 10){
                System.out.println(i);
                break;
            }
        }
    }
}
