package com.learn.advenced4.lambda;

public class Test2 {
    public static void main(String[] args) {
        //lambda只能简化接口中只有一个抽象方法的匿名内部类形式
      /*  new Swimming(){
            @Override
            public void swimming(int a){
                System.out.println("狗子");
            }
        };*/
        Swimming s =() -> System.out.println("狗子");
            go(s);
            go(()-> System.out.println("猫子"));

    }
    public static void go(Swimming swimming){
        System.out.println("开始");
        swimming.swimming();
        System.out.println("结束");
    }
}
@FunctionalInterface
interface Swimming{
    void swimming();
}
