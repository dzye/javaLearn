package com.lagou.task13;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1: " + sb1);
        System.out.println("容量: " + sb1.capacity());
        System.out.println("长度: " + sb1.length());
        System.out.println("--------------------");
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb2: " + sb2);
        System.out.println("容量: " + sb2.capacity());
        System.out.println("长度: " + sb2.length());
        System.out.println("--------------------");
        StringBuilder sb3 = new StringBuilder(10);
        System.out.println("sb2: " + sb3);
        System.out.println("容量: " + sb3.capacity());
        System.out.println("长度: " + sb3 .length());
        System.out.println("---------------------");
        StringBuilder sb4 = new StringBuilder("abcdefghijkl");
        StringBuilder sb5 = sb4.insert(1,"bbbd");
        System.out.println("sb5: " + sb5);
        StringBuilder sb6 = sb4.append("mmmmm");
        System.out.println("sb6: " + sb6);
        StringBuilder sb7 = sb4.delete(0,4);
        System.out.println("sb7: " + sb7);
        StringBuilder sb8 = sb4.deleteCharAt(2);
        System.out.println("sb8: " + sb8);
        StringBuilder sb9 = sb4.replace(2,4,"ooo");
        System.out.println("sb9: " + sb9);
        StringBuilder sb10 = sb4.reverse();
        System.out.println("sb10: " + sb10);
        System.out.println("---------------------");
    }
}
