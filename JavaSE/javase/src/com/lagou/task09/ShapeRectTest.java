package com.lagou.task09;

public class ShapeRectTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rect rect = new Rect();
        shape.show();
        rect.show();
        Shape sr = new Rect(7,8,9,0);
        sr.test();
        if(sr instanceof Circle) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
