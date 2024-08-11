package com.lagou.task08;

public class SuperTest {
    {
        System.out.println("SuperTest 构造块");
    }
    static {
        System.out.println("SuperTest 静态构造块");
    }
    public SuperTest(){
        System.out.println("SuperTest 构造方法");
    }

    public static void main(String[] args) {
        SuperTest superTest = new SuperTest();
    }
}
