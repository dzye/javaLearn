package com.lagou.task16;

public class ExceptionFinallyTest {
    public static void main(String[] args) {
        int ia = 5;
        int ib = 0;
        try {
            System.out.println(ia/ib);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("最后");
        }
    }
}
