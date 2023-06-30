package com.learn.advenced4.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {

    Integer[] arr ={11,22,55,44,33,99};
        Arrays.sort(arr,Student::compare);
        System.out.println(Arrays.toString(arr));
        Student student = new Student();
        Arrays.sort(arr,student::compareDesc);

        String[] s = {"Add","baf","Casa","acc","fff","Bww","caw"} ;
        Arrays.sort(s,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(s));





    }

}

class Student{

    public static int compare(Integer o1, Integer o2){
         return o1 -o2;
     }
        public int  compareDesc(Integer o1,Integer o2){
            return o2 -o1;
        }
}
interface createCar{
    Car create(String name,double price);
}
class Car{
    private String name;
    private double price;

    public Car() {
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
