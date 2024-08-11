package com.lagou.task11;

public class IntegerTest {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.TYPE);
        System.out.println("---------------");
        Integer i1 = Integer.valueOf(123);
        Integer i2 = new Integer(1);
        int i3 = i2.intValue();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("-----------------------");
        Integer i4 = 1;
        int i5 = i3;
        System.out.println(i4);
        System.out.println(i5);
        System.out.println("-----------------");

    }
}
