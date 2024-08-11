package com.lagou.task08;

public class SubSuperTest extends SuperTest{
    {
        System.out.println("SubSuperTest 构造块");
    }
    static {
        System.out.println("SubSuperTest 静态构造块");
    }
    public SubSuperTest(){
        System.out.println("SubSuperTest 构造方法");
    }
    public static void main(String[] args) {
        SubSuperTest ss = new SubSuperTest();
    }
}
