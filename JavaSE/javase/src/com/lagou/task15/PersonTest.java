package com.lagou.task15;

import java.awt.*;
import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("a",14,"男");
        System.out.println(person);
        System.out.println("-------------------");
        Person<String> p2 = new Person<>();
        p2.setGender("2");
        System.out.println(p2);
        Integer[] arr = {11,12,13,14,15,16,17,18,19,20};
        p2.printArray(arr);
    }
}
