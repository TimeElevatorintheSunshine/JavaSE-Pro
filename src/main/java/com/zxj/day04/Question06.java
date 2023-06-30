package com.zxj.day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * 某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。
 * 请先依次录入5名员工的工号，然后展示出一组随机排名顺序。
 */
public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r =new Random();
        int[] arr =new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入第"+ (i+1) + "名员工工号" );
            arr[i] = sc.nextInt();
        }
        int data = 0;
        int a = 5;
        for (int i = 0; i < arr.length; i++) {
            data = r.nextInt(a);
            int temp = arr[data];
            arr[data] = arr[a-1];
            arr[a-1] =temp;
            a--;
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
