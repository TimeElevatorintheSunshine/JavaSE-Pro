package com.learn.advenced4.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/** 某班80学生，组织秋游，班长提供了四个经典依次是(A,B,C,D),每个学生只能选择一个景点，请统计最终哪个景点想过去的人最多 */
public class MapDemo {
  public static void main(String[] args) {
    Random r = new Random();
    String[] arr = new String[80];
    for (int i = 0; i < arr.length; i++) {
      int choice = r.nextInt(4);
      switch (choice) {
        case 0:
          arr[i] = "A";
          break;
        case 1:
          arr[i] = "B";
          break;
        case 2:
          arr[i] = "C";
          break;
        case 3:
          arr[i] = "D";
          break;
        default:
      }
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    Map<String, Integer> map = new HashMap<>();
    /* int a = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals("A")) {
        if (map.containsKey("A")) {
          map.put("A", ++a);
        } else {
          map.put("A", a);
        }
      } else if (arr[i].equals("B")) {

        if (map.containsKey("B")) {
          map.put("B", ++a);
        } else {
          a = 1;
          map.put("B", a);
        }
      } else if (arr[i].equals("C")) {

        if (map.containsKey("C")) {
          map.put("C", ++a);
        } else {
          a = 1;
          map.put("C", a);
        }
      } else if (arr[i].equals("D")) {

        if (map.containsKey("D")) {
          map.put("D", ++a);
        } else {
          a = 1;
          map.put("D", a);
        }
      }
    }*/
    for (String s : arr) {
      if (map.containsKey(s)) {
        map.put(s, map.get(s) + 1);
      } else {
        map.put(s, 1);
      }
    }
    System.out.println(map);
  }
}
