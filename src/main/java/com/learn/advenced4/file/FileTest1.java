package com.learn.advenced4.file;

import java.io.File;
import java.util.Arrays;

public class FileTest1 {
  public static void main(String[] args) {
    // 创建一个File对象，指代某个具体文件
    // 路径分隔符
    File file = new File("D:/projetforlearn/New Text Document.txt");
    // File file = new File("D:\\projetforlearn\\New Text Document.txt");
    /*File file =
    new File(
        "D:" + File.separator + "projetforlearn" + File.separator + "New Text Document.txt");*/
    System.out.println(file.length()); // 文件大小 字节
    // 注意File对象可以指代一个不存在的文件路径
    File f1 = new File("D:/note");
    System.out.println(f1.length());
    System.out.println(Arrays.toString(f1.listFiles()));
    // 我现在要定位的文件是在模块中，怎么定位
    // 绝对路径：带盘符的
    // File  f4   =new
    // File("D:\\projetforlearn\\JavaSE-Pro\\src\\main\\java\\com\\learn\\advenced4\\file\\itheima.txt")
    // 相对路径：不带盘符，默认是直接去工程下寻找文件的
    File file2 = new File("src\\main\\java\\com\\learn\\advenced4\\file\\itheima.txt");
    System.out.println(file2.length());
  }
}
