package com.lagou.task14;

import java.util.LinkedList;
import java.util.List;

public class ListMethodTest {
    public static void main(String[] args) {
        List lt1 = new LinkedList();
        lt1.add(0,"a");
        System.out.println(lt1);
        lt1.add(1,"b");
        System.out.println(lt1);
        lt1.add(1,"c");
        System.out.println(lt1);
        System.out.println("-----------");
        System.out.println(lt1.get(0));
        for(int i=0;i<lt1.size();i++){
            System.out.println(lt1.get(i));
        }
        lt1.add(1,"b");
        System.out.println(lt1.indexOf("b"));
        System.out.println(lt1.lastIndexOf("b"));
        System.out.println(lt1);
        lt1.set(1,"n");
        System.out.println(lt1);
        lt1.remove(1);
        System.out.println(lt1);
        List lt2 = lt1.subList(0,2);
        System.out.println(lt2);
    }
}
