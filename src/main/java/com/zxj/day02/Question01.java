package com.zxj.day02;

/**
 * 需求:
 * 身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
 * 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
 * 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
 * 现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
 */
public class Question01 {
    public static void main(String[] args) {
       double fatherHight = 178;
       double motherHight = 165;
        System.out.println("儿子身高(厘米)=" + (fatherHight + motherHight) * 1.08 / 2);
        System.out.println("女儿身高(厘米)=" + (fatherHight * 0.923 + motherHight)/ 2);
    }
}
