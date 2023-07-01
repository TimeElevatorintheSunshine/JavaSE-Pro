package com.zxj.day15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 模拟注册用户,如果存在要注册的用户,直接显示"对不起,您注册的用户已经存在!请直接登录!",可以继续注册;
 * 如果不存在要注册的用户,显示"注册成功!",并将所有用户的信息显示出来!
 */
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        users.add(new User("张三","12131","asfafa"));
            for (int i = 0; i < users.size(); i++) {
                System.out.println("注册请输入手机号码");
                String numberPhone = sc.next();
                if (numberPhone.equals(users.get(i).getPhoneNumber())){
                    System.out.println("对不起,您注册的用户已经存在!请直接登录!");
                    break;
                }else {
                    User user = new User();
                    System.out.println("请输入密码");
                    user.setPhoneNumber(numberPhone);
                    user.setPassWord(sc.next());
                    System.out.println("请输入名字");
                    user.setName(sc.next());
                    System.out.println("注册成功");
                    users.add(user);
                    System.out.println("手机号码"+user.getPhoneNumber() );
                    System.out.println("密码"+user.getPassWord() );
                    System.out.println("名字"+user.getName() );
                }

            }
        System.out.println(users.size());




    }
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class User {
    private String name;
    private String phoneNumber;
    private String passWord;
}
