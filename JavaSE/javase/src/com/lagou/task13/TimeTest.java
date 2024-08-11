package com.lagou.task13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println("-------------------");
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        System.out.println("-------------------");
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        System.out.println("--------------------");
        LocalDateTime now3 = LocalDateTime.of(2008,8,8,20,8,8);
        System.out.println(now3);
        System.out.println("年："+ now3.getYear());
        System.out.println("月："+ now3.getMonthValue());
        System.out.println("日："+ now3.getDayOfMonth());
        System.out.println("时："+ now3.getHour());
        System.out.println("分："+ now3.getMinute());
        System.out.println("秒："+ now3.getSecond());
        LocalDateTime now4 = now3.withYear(2009).withMonth(9).withDayOfMonth(9).withHour(21).withMinute(9).withSecond(9);
        System.out.println(now4);
        LocalDateTime now5 = now3.plusYears(1).plusMonths(1).plusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1);
        System.out.println(now5);
        LocalDateTime now6 = now5.minusYears(1).minusMonths(1).minusDays(1).minusHours(1).minusMinutes(1).minusSeconds(1);
        System.out.println(now6);
    }
}
