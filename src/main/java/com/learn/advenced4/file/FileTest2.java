package com.learn.advenced4.file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest2 {
  public static void main(String[] args) {
    // 创建文件对象，指代某个文件
    File file = new File("D:\\projetforlearn\\New Text Document.txt");
    // 判断当前文件对象，对应的文件路径是否存在，存在返回true
    System.out.println(file.exists()); // true
    // 判断当前文件对象指代的是否是文件，是文件返回true，反之
    System.out.println(file.isFile()); // true
    // 判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之
    System.out.println(file.isDirectory()); // false
    // 获取文件的名称（包括后缀）
    System.out.println(file.getName());
    // 获取文件的大小，返回字节个数
    System.out.println(file.length());
    // 获取文件的最后修改时间
    System.out.println(file.lastModified());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    System.out.println(sdf.format(file.lastModified()));
    // 获取创建文件对象时，使用的路径
    System.out.println(file.getPath());
    // 获取绝对路径
    System.out.println(file.getAbsolutePath());
  }
}
