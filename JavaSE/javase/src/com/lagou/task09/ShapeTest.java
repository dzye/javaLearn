package com.lagou.task09;

public class ShapeTest {
//    public static void draw(Rect r){
//        r.show();
//    }
//    public static void draw(Circle c){
//        c.show();
//    }
    public static void draw(Shape s){
//        if(s instanceof Rect){
//            draw((Rect)s);
//        }else if(s instanceof Circle){
//            draw((Circle)s);
//        }
        s.show();
    }
    public static void main(String[] args) {
        Rect r = new Rect(1,2,3,4);
        ShapeTest.draw(r);
        Circle c = new Circle(1,2,3);
        ShapeTest.draw(c);
    }
}
