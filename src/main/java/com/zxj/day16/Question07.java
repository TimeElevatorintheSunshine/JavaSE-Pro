package com.zxj.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 我们输入一个要注册的用户名,如果之前有该用户名注册过, 京东是不会让相同的用户名注册的,会注册失败.根据以上描述,设计程序,完成注册功能! */
public class Question07 {
  public static void main(String[] args) {
    User user = new User();
    while (true) {
      user.register();
    }
  }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class User {

  List<Users> list = new ArrayList<>();

  public void register() {
    System.out.println("请您输入要注册的用户名");
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    for (Users s : list) {
      if (s.getName().equals(a)) {
        System.out.println("注册失败,名字重复");
        return;
      }
    }
    System.out.println("注册成功");
    list.add(new Users(a));
  }
}

@Data
@AllArgsConstructor
class Users {
  private String name;
}
