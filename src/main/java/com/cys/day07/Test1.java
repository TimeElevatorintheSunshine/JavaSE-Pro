package com.cys.day07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 第一题:
 * 1.定义一个Computer类型的数组，长度为3
 * 2.创建3个Computer对象，存储到数组中
 * 3.获取数组中价格最贵的那个电脑对象
 */
public class Test1 {
    public static void main(String[] args) {
        Computer[] arr = new Computer[3];
        arr[0] = new Computer(99.9,"华为");
        arr[1] = new Computer(199.9,"苹果");
        arr[2] = new Computer(88.9,"小米");
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[max].getPrice() < arr[i].getPrice()){
                max = i;
            }
        }
        System.out.println(arr[max]);
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Computer {
    private double price;
    private String name;
}