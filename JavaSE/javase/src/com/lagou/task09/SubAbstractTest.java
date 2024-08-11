package com.lagou.task09;

import com.lagou.task08.SubSuperTest;

public class SubAbstractTest extends AbstractTest{

    @Override
    public void show() {
        System.out.println("被迫重写");
    }
    public static void main(String[] args) {
        new SubAbstractTest().show();

        AbstractTest abstractTest = new SubAbstractTest();
        abstractTest.show();

    }
}
