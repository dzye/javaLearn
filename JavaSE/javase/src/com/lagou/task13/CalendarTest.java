package com.lagou.task13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Date date = new Date(2008-1900,7,8,8,8,8);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
        System.out.println("-------------------------");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2008,7  ,8,8,8,8);
        Date date1 = calendar.getTime();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = sdf1.format(date1);
        System.out.println(format1);
        calendar.set(Calendar.YEAR,2018);
        Date date2 = calendar.getTime();
        String format2 = sdf1.format(date2);
        System.out.println(format2);
        calendar.add(Calendar.MONTH,11);
        Date date3 = calendar.getTime();
        String format3 = sdf1.format(date3);
        System.out.println(format3);
    }
}
