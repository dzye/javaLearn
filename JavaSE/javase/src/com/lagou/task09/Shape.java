package com.lagou.task09;

public class Shape {
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void show(){
        System.out.println("x=" + x + ", y=" + y);
    }

    public static void test(){
        System.out.println("shape静态");
    }
}
