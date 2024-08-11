package com.lagou.task14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        System.out.println(c1);
        c1.add(1);
        c1.add("2");
        Person p1 = new Person();
        c1.add(p1);
        System.out.println(c1);
        Collection c2 = new ArrayList();
        c2.add(333);
        c2.add("three");
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c1.contains(2));
        Collection c3 = new ArrayList();
        c3.add(1);
        System.out.println(c1.containsAll(c3));
        c3.add(2);
        System.out.println(c1.containsAll(c3));
        Collection c4 = new ArrayList();
        c4.add(1);
        c4.retainAll(c1);
        System.out.println(c4);
        c4.add("123");
        c4.add(new Person());
        System.out.println(c4);
        c4.remove(new Person());
        System.out.println(c4);
        c4.removeAll(c1);
        System.out.println(c4);
        c4.clear();
        System.out.println(c4);
        System.out.println(c1.size());
        System.out.println(c4.isEmpty());
        System.out.println(c1.isEmpty());
        System.out.println(c1.equals(c4));
        c1.clear();
        System.out.println(c1.equals(c4));

        System.out.println(Arrays.toString(c3.toArray()));
        System.out.println(Arrays.asList(c3.toArray()));
    }
}
