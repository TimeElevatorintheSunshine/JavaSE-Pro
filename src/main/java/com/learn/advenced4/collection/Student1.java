package com.learn.advenced4.collection;

public class Student1 {
    @Override
    public String toString() {
        return "" +
                 name
                 + age
                ;
    }

    public String getName() {
        return name;
    }

    public Student1() {
    }

    public Student1(String name, int age, int size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private String name;
    private int age;

    private int size;
}
