package com.zxj.day01;

/**
 * 请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。
 * 1、班级里有100个学员。
 * 2、某商品价格55.55元。
 * 3、地球已经诞生超过46亿年。
 * 4、“5是偶数”这句话的描述是假的。
 * 输出结果如下：
 * 100
 * 55.55
 * 4600000000
 * false
 */
public class Question04 {
    public static void main(String[] args) {
       int studentNumber = 100;
        System.out.println(studentNumber);
        double price = 55.55;
        System.out.println(price);
        long earthBrithday = 4600000000l;
        System.out.println(earthBrithday);
        boolean flag = false;
        System.out.println(flag);

                int a = 10;
                {
                    a = 20;
                    System.out.println(a);
                }
                {
                    int b = 20;
                    System.out.println(b);
                }
                //b = 30; b没有被定义
                // System.out.println(b);


    }
}
