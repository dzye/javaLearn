package com.lagou.task09;

public class Rect extends Shape{
    private int length;
    private int width;

    public Rect() {}

    public Rect(int x, int y, int length, int width) {
        super(x, y);
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    void show() {
        super.show();
        System.out.println("width: " + width+", length: " + length);
    }

    public static void test(){
        System.out.println("rect静态");
    }
}
