package com.lagou.task11;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1,"a");
        Student s2 = new Student(1,"a");
        System.out.println(s1.equals(s2));
        System.out.println("---------------");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("----------");
        System.out.println(s1.toString());
    }
}
