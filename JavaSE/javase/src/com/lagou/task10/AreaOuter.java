package com.lagou.task10;

/**
 * 编程实现局部内部类
 */
public class AreaOuter {
    private int cnt = 2;
    public void show(){
        final int[] ic = {4};
        class AreaInner{
            private int ia = 1;
            public AreaInner(){};
            public void test(){
                System.out.println(ia);
                System.out.println(cnt);
                ic[0] = 5;
                System.out.println("ic="+ ic[0]);
            }
        }
        AreaInner a = new AreaInner();
        a.test();
    }
}
