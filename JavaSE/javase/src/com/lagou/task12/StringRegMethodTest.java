package com.lagou.task12;


public class StringRegMethodTest {
    public static void main(String[] args) {
        String str1 = "1001,zhangfei,30";
        String[] sArr = str1.split(",");
        for(int i=0;i<sArr.length;i++){
            System.out.println(sArr[i]);
        }
        String str2 = str1.replace('0','1');
        System.out.println(str2);
        String str3 = str1.replaceAll("[a-z]","2");
        System.out.println(str3);
    }
}
