package com.lagou.task10;

/**
 * 静态内部类
 */
public class StaticOuter {
    private int cnt = 1;
    private static int snt = 2;

    public static class StaticInner {
        private int ia = 3;
        private static int snt = 4;

        public StaticInner() {
        }

        public void show(){
            System.out.println("ia = " + ia);
            System.out.println("外部类snt = " + StaticOuter.snt);
            System.out.println("内部类snt = " + StaticInner.snt);
        }
    }
}
