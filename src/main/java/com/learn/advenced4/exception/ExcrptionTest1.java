package com.learn.advenced4.exception;

public class ExcrptionTest1 {
    public static void main(String[] args) {
        //自定异常
        //保存一个合法的年龄
        try {
            age(23);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void age(int age) throws AgeIllegalRuntimeException{
        if (age>0 && age<150){
            System.out.println("年龄被保存" + age);
        }else {
            //用一个异常对象封装这个问题
            //throw抛出去这个异常对象
            //throws 用在方法上抛出方法内部异常
            throw new AgeIllegalRuntimeException("/age is illegal , your age is " + age);

        }
    }
}
class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}

