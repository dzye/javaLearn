package com.lagou.task12;

public class StringByteCharTest {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println("str1: " + str1);
        System.out.println("----------------------");
        byte[] bytes = str1.getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }
        String str2 = new String(bytes);
        System.out.println("str2: " + str2);
        System.out.println("----------------------");
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        String str3 = new String(chars);
        System.out.println("str3: " + str3);


    }
}
