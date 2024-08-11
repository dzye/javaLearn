package com.lagou.task15;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet();
        System.out.println(ts);
        String st = new String("abc");
        ts.add(st);
        System.out.println(ts);

        Set<Student> set = new TreeSet();
        set.add(new Student("a",11));
        set.add(new Student("b",12));
        set.add(new Student("c",13));
        set.add(new Student("d",14));
        System.out.println(set);

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Set<Student> set2 = new TreeSet(comparator);
      }
}
