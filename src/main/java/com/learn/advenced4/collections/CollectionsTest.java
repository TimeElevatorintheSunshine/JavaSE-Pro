package com.learn.advenced4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //为集合批量添加数据
        Collections.addAll(list,"喜羊羊","大古","樱木花道");
        System.out.println(list);
        //打乱list集合中的元素顺序
        Collections.shuffle(list);
        System.out.println(list);
        //对list集合中的元素进行升序排序
        Collections.sort(list);
        //对list集合中的元素进行降序排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
