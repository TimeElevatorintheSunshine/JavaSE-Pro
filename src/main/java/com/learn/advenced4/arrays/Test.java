package com.learn.advenced4.arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args){
        int[] arr = {999,22,333,11,2,666,32,448};
        //从小到大排序,fromIndex起始位，toIndex是截止位减1,()
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //引用类型
        Integer[] arr1 = {2,9,5,4,1,6,3,8};
        MyComparator myComparator = new MyComparator();

        Arrays.sort(arr1,myComparator);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        //将一个变长参数或者数组转换成List
        List<Object> list = Arrays.asList(arr);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        //查找元素索引，必须进行升序排序后在再操作
        System.out.println(Arrays.binarySearch(arr, 999));
        //拷贝对象，和拷贝对象长度
        int[] ints = Arrays.copyOf(arr, 12);
        //arr[3] = 40;拷贝出来的地址不同
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "\t");
        }
        System.out.println("");
        //拷贝对象，和拷贝对象开始和结束索引中的元素
        int[] ints1 = Arrays.copyOfRange(arr, 2, 5);
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i] + "\t");
        }
        System.out.println("");
        String s = Arrays.toString(arr);
        System.out.println(s.toString());
        Arrays.fill(ints,5,10,50);//可以在指定位置进行数值填充
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "\t");
        }
        IntUnaryOperator pow = new IntUnaryOperator(){

            @Override
            public int applyAsInt(int operand) {
                int val = ints[operand];
                return val + val;
            }

        };
        //把数组中的原数据改为新数据
        Arrays.setAll(ints,pow);
        System.out.println(Arrays.toString(ints));
        int[] arr6 = {2,9,5,4,1,6,3,8};
        Arrays.stream(arr1,1,5);
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + "\t");
        }


    }
}
