package com.learn.advenced4.map;

import java.util.*;

/**
 * 要求在程序中记住如下省份和其对应的城市信息，记录成功后，要求可以查询出湖北省的城市信息 江苏省 = 南京市，扬州市，苏州市，无锡市，常州市 湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
 * 河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
 */
public class MapDemo2 {
  public static void main(String[] args) {
    Map<String, List<String>> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
    map.put("湖北省", list);

    List<String> cities = map.get("湖北省");
    for (String city : cities) {
      System.out.println(city);
    }
    map.forEach(
        (p, c) -> {
          System.out.println(c);
        });
  }
}
