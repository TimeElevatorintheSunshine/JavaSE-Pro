package com.zxj.day15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 有4个人参加公务员考试,考试成绩如图所示,录取3名学生,淘汰分数最低的一名,设计一个程序,完成需求
 * 1 99 刘备
 * 2 85 关羽
 * 3 90 张飞
 * 4 75 诸葛
 */
public class Question01 {
    public static void main(String[] args) {
        List<CivilServantTest> civilServantTests = new ArrayList<>();
        civilServantTests.add(new CivilServantTest(99,"刘备"));
        civilServantTests.add(new CivilServantTest(85,"关羽"));
        civilServantTests.add(new CivilServantTest(90,"张飞"));
        civilServantTests.add(new CivilServantTest(75,"诸葛"));
        civilServantTests.sort((CivilServantTest o1, CivilServantTest o2)-> o1.getScore()-o2.getScore());
        civilServantTests.remove(0);
        System.out.println(civilServantTests);
    }
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class CivilServantTest {
    private int score;
    private String name;
}
