package com.lagou.task12;

public class StringCharTest {
    public static void main(String[] args) {
        String str1 = "hello";
        char char1 = str1.charAt(0);
        System.out.println("char1: " + char1);
        int len = str1.length();
        System.out.println("len: " + len);
        boolean flag = str1.isEmpty();
        System.out.println("flag: " + flag);
        String str4 = "";
        System.out.println(str4.isEmpty());
    }
}
