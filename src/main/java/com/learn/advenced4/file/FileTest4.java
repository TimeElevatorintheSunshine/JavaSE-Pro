package com.learn.advenced4.file;

import java.io.File;
import java.util.Arrays;

public class FileTest4 {
  public static void main(String[] args) {
    // 获取当前文件夹一级文件名称到一个字符串数组中去返回
    File f1 = new File("D:\\projetforlearn\\heima\\基础加强14天课程");
    System.out.println(Arrays.toString(f1.list()));
    // 获取当前目录下所有的一级文件对象，到一个文件对象的数组中去返回
    File[] f2 = f1.listFiles();
    for (File file : f2) {
      System.out.println(file.getAbsolutePath());

      File f = new File("D:/projetforlearn");
      File[] files = f.listFiles();
      System.out.println(Arrays.toString(files));
    }
  }
}
