package com.lagou.task15;

import java.util.LinkedList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Animal> lt1 = new LinkedList<>();
        List<Dog> lt2 = new LinkedList<>();
        System.out.println("------------------");
        List<?> lt3 = new LinkedList<>();
        lt3 = lt1;
        lt3 = lt2;
    }
}
