package com.lagou.task10;

public class StaticOuterTest {
    public static void main(String[] args) {
        StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();
        staticInner.show();

    }
}
