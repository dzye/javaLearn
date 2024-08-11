package com.lagou.task12;

public class StringJudgeTest {
    public static void main(String[] args) {
        String str1 = "上海自来来自海上";
        int len = str1.length();
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if(str1.charAt(i) != str1.charAt(len - i - 1)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
