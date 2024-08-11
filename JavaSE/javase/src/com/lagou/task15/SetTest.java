package com.lagou.task15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet();
        s1.add("two");
        System.out.println(s1);
        s1.add("one");
        System.out.println(s1);
        s1.add("three");
        System.out.println(s1);
        s1.add("one");
        System.out.println(s1);
        Set<String> s2 = new LinkedHashSet<>();
        s2.add("two");
        System.out.println(s2);
        s2.add("one");
        System.out.println(s2);
        s2.add("three");
        System.out.println(s2);
        s2.add("one");
        System.out.println(s2);
    }
}
