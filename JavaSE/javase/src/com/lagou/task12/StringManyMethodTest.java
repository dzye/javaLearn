package com.lagou.task12;

public class StringManyMethodTest {
    public static void main(String[] args) {
        String str = new String("hello ");
        System.out.println(str);
        System.out.println(str.contains("he"));
        System.out.println(str.contains("hl"));
        System.out.println(str.indexOf("el"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.startsWith("he"));
        System.out.println(str.endsWith("l"));
        System.out.println(str.endsWith(" "));
        System.out.println(str.startsWith("l",0));
        System.out.println(str.startsWith("e",1));
    }
}
