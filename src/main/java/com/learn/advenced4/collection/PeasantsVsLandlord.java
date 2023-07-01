package com.learn.advenced4.collection;

import java.util.*;

public class PeasantsVsLandlord {
    public static void main(String[] args) {
        /*
        1.总共有54张牌
        2.点数：3，4，5，6，7，8，9，10，J,Q,K,A,2
        3.花色：♠，♥，♣，♦
        4.大小王：🤡 🃏
        5.斗地主：发出51张牌，剩下三张坐底牌
         */
        String[] s = new String[]{"♠", "♥", "♣", "♦"};
        /*String s = "♠";
        String s1 = "♥";
        String s2 = "♣";
        String s3 = "♦";*/
        List<String> list = new ArrayList<>();

        list.add("🤡");
        list.add("🃏");
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                list.add(s[i] + j);
            }
            list.add(s[i] + "J");
            list.add(s[i] + "Q");
            list.add(s[i] + "K");
            list.add(s[i] + "A");
        }
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        String[] s1= new String[list.size()/3-1];
        String[] s2= new String[list.size()/3-1];
        String[] s3= new String[list.size()/3-1];
        String[] s4 = new String[3];
        int j = 0;
        for (int i = 0; i < 17; i++) {
            s1[i] = list.get(j++);
            s2[i] = list.get(j++);
            s3[i] = list.get(j++);
        }
        int z = 53;
        for (int i = 0; i < 3; i++) {
            s4[i] = list.get(z--);
        }
        Arrays.sort(s1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        System.out.println(Arrays.toString(s3));
        System.out.println(Arrays.toString(s4));
    }
}
