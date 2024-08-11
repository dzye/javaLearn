package com.lagou.task14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        Iterator it = c1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        Iterator it1 = c1.iterator();
        while (it1.hasNext()) {
            Object o = it1.next();
            sb1.append(o);
            if(it1.hasNext()) {
                sb1.append(",");
            }
        }
        sb1.append("]");
        System.out.println(sb1);
        Iterator it2 = c1.iterator();
        while (it2.hasNext()) {
            Object o = it2.next();
            if(o.equals("b")) {
                it2.remove();
            }
        }
        System.out.println(c1);
        System.out.println("----------------------");
        for(Object o : c1){
            System.out.println(o);
        }
    }
}
