package com.lagou.task09;

public class Circle extends Shape{
    private int radius;
    public Circle() {}
    public Circle(int x,int y,int radius) {
        super(x,y);
        setRadius(radius);
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    void show() {
        super.show();
        System.out.println("圆："+this.radius);
    }
}
