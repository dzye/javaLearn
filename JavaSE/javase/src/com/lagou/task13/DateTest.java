package com.lagou.task13;

import java.util.Date;
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(123);
        System.out.println(date);
        Date date1 = new Date(123);
        System.out.println(date1);
    }
}
