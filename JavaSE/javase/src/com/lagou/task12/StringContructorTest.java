package com.lagou.task12;

public class StringContructorTest {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("str1 = " + str1);
        System.out.println("-------------------------");
        byte[] bArr = {97,98,99,100,101};
        String str2 = new String(bArr,1,3);
        System.out.println("str2 = " + str2);
        System.out.println("-------------------------");
        String str3 = new String(bArr);
        System.out.println("str3 = " + str3);
        System.out.println("------------------------");
        char[] cArr = {'a','b','c','d','e','f','g','h'};
        String str4 = new String(cArr,1,3);
        System.out.println("str4 = " + str4);
        System.out.println("------------------------");
        String str5 = new String(cArr);
        System.out.println("str5 = " + str5);
        System.out.println("------------------------");
        String str6 = new String("hello");
        System.out.println("str6 = " + str6);
        System.out.println("------------------------");
    }
}
