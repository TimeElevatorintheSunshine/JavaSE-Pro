package com.zxj.day15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 如图,表格中是三年级一班的学生信息,后来张三丰移民到了山东,李老师需要将张三丰对应的住址改掉,请用程序完成需求,并将学生的信息打印到控制台上
 * 1 深圳 刘备
 * 2 广州 关羽
 * 3 北京 张飞 --> 美国
 * 4 上海 诸葛
 */

public class Question02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("深圳","刘备"));
        students.add(new Student("广州","李逵"));
        students.add(new Student("北京","爷"));
        students.add(new Student("武汉","喜羊羊"));
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals("爷"));
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private String local;
    private String name;
}
