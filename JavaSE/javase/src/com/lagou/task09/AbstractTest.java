package com.lagou.task09;

public abstract class AbstractTest {
    private int cut;

    public AbstractTest() {
    }

    public AbstractTest(int cut) {
        setCut(cut);
    }

    public int getCut() {
        return cut;
    }

    public void setCut(int cut) {
        this.cut = cut;
    }
    public abstract void show();
    public static void main(String[] args) {
//        AbstractTest test = new AbstractTest
    }
}
