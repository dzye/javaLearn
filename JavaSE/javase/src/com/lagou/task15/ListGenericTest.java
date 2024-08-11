package com.lagou.task15;

import java.util.ArrayList;
import java.util.List;

public class ListGenericTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        for (String s : list) {
            System.out.println(s);
        }
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
