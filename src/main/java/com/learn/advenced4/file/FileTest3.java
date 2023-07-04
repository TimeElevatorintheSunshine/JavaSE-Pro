package com.learn.advenced4.file;

import java.io.File;

public class FileTest3 {
  public static void main(String[] args) throws Exception {
    // 创建一个新文件，创建成功返回true，反之
    File file = new File("D:/abc");
    System.out.println(file.createNewFile());
    // 用于创建文件夹，注意：只能创建一级文件夹
    File file1 = new File("D:/projectforlearn/aaa");
    System.out.println(file1.mkdir());
    // 用于创建文件夹，可以创建多级文件夹
    File file2 = new File("D:/projectforlearn/aaa/bbb");
    System.out.println(file2);
    // 删除文件，或者空文件夹，不能删除非空文件夹
    System.out.println(file.delete());
    System.out.println(file2.delete());
  }
}
