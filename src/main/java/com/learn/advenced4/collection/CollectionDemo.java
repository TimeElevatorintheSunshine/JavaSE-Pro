package com.learn.advenced4.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
    //创建一个集合容器
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《王者荣耀》",9.7,"后羿"));
        movies.add(new Movie("《英雄联盟》",9.9,"寒冰"));
        movies.add(new Movie("《原神》",9.8,"派蒙"));
        System.out.println(movies);
        for (Movie movie : movies) {
            System.out.println("电影名:" + movie.getName());
            System.out.println("评分:" + movie.getScore());
            System.out.println("演员:" + movie.getActor());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Movie{
    private String name;
    private double score;
    private String actor;
}
