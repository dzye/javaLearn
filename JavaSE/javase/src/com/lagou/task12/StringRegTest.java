package com.lagou.task12;

import java.util.Scanner;

public class StringRegTest {
    public static void main(String[] args) {
        String reg1 = "\\d{6}"; // 银行卡号  6位数字组成
        String reg2 = "[1-9][0-9]{4,14}"; // qq 非0开头 5-15位
        String reg3 = "1[34578][\\d]{9}"; // 手机号
        String reg4 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入银行卡号");
        String str = sc.next();
        System.out.println(str.matches(reg1));
        System.out.println("请输入qq号");
        String str2 = sc.next();
        System.out.println(str2.matches(reg2));
        System.out.println("请输入手机号");
        String str3 = sc.next();
        System.out.println(str3.matches(reg3));
    }
}
