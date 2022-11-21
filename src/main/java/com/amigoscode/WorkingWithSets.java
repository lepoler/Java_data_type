package com.amigoscode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>(); //Tree -> Preserve order / Hash -> doesn't preserve order
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        System.out.println(balls.size()); // Duplicates are not allow in Sets
        balls.forEach(System.out::println);
    }

    record Ball(String color){}
}
