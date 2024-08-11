package com.lagou.task12;

public class StringExamTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));
        System.out.println("----------------------------");
        String str5 = "hello";
        String str6 = "hel" + "lo";
        System.out.println(str5 == str6);
        String str7 = "hel";
        String str8 = str7 + "lo";
        System.out.println(str5 == str8);
    }
}
