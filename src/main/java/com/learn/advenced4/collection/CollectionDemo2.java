package com.learn.advenced4.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
     List<String> list = new ArrayList<>();
     list.add("喜羊羊");
     list.add("懒羊羊");
     list.add("美羊羊");
     list.add("灰太狼");
     list.add("红太狼");
        System.out.println(list);
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("羊")){
                list.remove(name);
            }
        }*/
        /*for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (name.contains("羊")){
                list.remove(name);
            }
        }
        System.out.println(list);*/
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("羊")){
               it.remove();
            }
        }
        System.out.println(list);
    }
}
