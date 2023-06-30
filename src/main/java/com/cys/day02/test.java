package com.cys.day02;

public class test {
    public static void main(String[] args){

        int param = 1;
        String position="";
        switch(param){

            case 1:
                position="兄长";
            case 2:
                position="兄弟";

                break;

            case 3:
                position="小妹";

                break;

        }
        System.out.println(position);



    }
}
