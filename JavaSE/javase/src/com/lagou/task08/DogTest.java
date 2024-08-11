package com.lagou.task08;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("coco");
        dog1.setColor("orange");
        dog1.setTeeth(12);
        dog1.show();
        Dog dog2 = new Dog("maomao","gray",12);
        dog2.show();
    }
}
