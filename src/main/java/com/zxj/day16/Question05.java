package com.zxj.day16;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 如图所示:有四名学生参加注册会计师考试,表格中记录的是4名学生的考试成绩,请按照成绩将四名学生从小到大进行排名,并将结果展示出来. */
public class Question05 {
  public static void main(String[] args) {
    Map<Students, Double> map =
        new TreeMap<Students, Double>((o1, o2) -> (int) (o1.getScore() - o2.getScore()));
    Students students = new Students("超人强", 59.9);
    Students students1 = new Students("小呆呆", 99.9);
    Students students2 = new Students("GG棒", 109.9);
    Students students3 = new Students("小菲菲", 100.9);
    map.put(students1, students1.getScore());
    map.put(students2, students2.getScore());
    map.put(students, students.getScore());
    map.put(students3, students3.getScore());
    Set<Map.Entry<Students, Double>> entries = map.entrySet();
    for (Map.Entry<Students, Double> entry : entries) {
      System.out.println(entry.getKey());
    }
  }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Students {
  private String name;
  private double score;

  @Override
  public String toString() {
    return name + "=" + score;
  }
}
