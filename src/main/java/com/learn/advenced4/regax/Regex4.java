package com.learn.advenced4.regax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn,电话18762832633，0203232323" +
                "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";
        String regex = "\\w{2,}@\\w{2,10}(\\.\\w{2,10}){1,2}|" +
                "0\\d{2,7}-?[1-9]\\d{4,18}|400-?\\d{3,8}-?\\d{3,8}|1[3-9]\\d{9}";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(rs);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
