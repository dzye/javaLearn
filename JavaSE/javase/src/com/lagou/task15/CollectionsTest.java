package com.lagou.task15;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        Integer max = Collections.max(c);
        Integer min = Collections.min(c);
        System.out.println(max);
        System.out.println(min);
        Collections.reverse(c);
        System.out.println(c);
        Collections.swap(c, 0, 1);
        System.out.println(c);
        Collections.sort(c);
        System.out.println(c);
        Collections.shuffle(c);
        System.out.println(c);
//        List<Integer> c2 = new ArrayList<>(30);
        List<Integer> c2 = Arrays.asList(new Integer[5]);
        System.out.println(c2);
        Collections.copy(c2, c);
        System.out.println(c2);
    }
}
