package com.zxj.day16;

import java.util.HashMap;
import java.util.Map;

/**
 * 要求在程序中记住如下省份和其对应的城市信息，记录成功后，要求可以查询出湖北省的城市信息 江苏省 = 南京市，扬州市，苏州市，无锡市，常州市 湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
 * 河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
 */
public class Question03 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("江苏省", "南京市，扬州市，苏州市，无锡市，常州市 ");
    map.put("湖北省", "武汉市，孝感市，十堰市，宜昌市，鄂州市 ");
    map.put("河北省", "石家庄市，唐山市，邢台市，保定市，张家口市 ");
    System.out.println(map.get("湖北省"));
  }
}
