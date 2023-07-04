package com.learn.advenced4.recursion;

import java.io.File;

public class RecursionTest3 {
  public static void main(String[] args) throws Exception {
    Recursion(new File("D:\\projetforlearn"), "FeiQ.exe");
  }

  public static void Recursion(File file, String s) throws Exception {
    if (file == null || !file.exists() || file.isFile()) {
      return;
    }
    File[] files = file.listFiles();
    if (files != null && files.length > 0) {
      for (File file1 : files) {
        if (file1.isFile()) {
          if (file1.getName().contains(s)) {
            Runtime.getRuntime().exec(file1.getAbsolutePath());
            return;
          }
        } else {
          Recursion(file1, s);
        }
      }
    }
  }
}
