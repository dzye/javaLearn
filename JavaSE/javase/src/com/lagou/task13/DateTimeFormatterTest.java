package com.lagou.task13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String s1 = dtf.format(now);
        System.out.println(s1);
        TemporalAccessor now2 = dtf.parse(s1);
        System.out.println(now2);
    }
}
