package com.learn.advenced4.regax;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String rs = "古力娜扎5s5fa5f迪丽热巴safa55554马儿咋哈asfaf556卡尔扎巴";
        System.out.println(rs.replaceAll("\\w+", "-"));


        String rs1 = "我我我喜欢编编编编编编编编程程程程程程程";

        System.out.println(rs1.replaceAll("(.)\\1+", "$1"));

        String rs3 = "古力娜扎5s5fa5f迪丽热巴safa55554马儿咋哈asfaf556卡尔扎巴";
        String[] str = rs3.split("\\w+");
        System.out.println(Arrays.toString(str));

    }
}
