package com.lagou.task10;

//@ManTypes({@ManType(value = "职工"),@ManType(value = "超人")})
@ManType(value = "职工")
@ManType(value = "超人")
public class Man {

    @Deprecated
    public void show(){
        System.out.println("马上过时");
    }
    public static void main(String[] args) {
        int ia = 97;
        char c1 = (@ManType char) ia;
    }
}
