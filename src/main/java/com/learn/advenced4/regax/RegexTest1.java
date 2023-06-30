package com.learn.advenced4.regax;

public class RegexTest1 {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("asda4444"));
        System.out.println(checkQQ("8484848"));
        System.out.println("~~~~~~~~~~~~");
        System.out.println(checkQQ1(null));
        System.out.println(checkQQ1("asda4444"));
        System.out.println(checkQQ1("8484848"));

    }

    public static boolean checkQQ1(String qq){
        return qq != null &&qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq) {
        //判断qq是否为null
        if (qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9') {
                return false;
            }
        }return true;

    }

}
