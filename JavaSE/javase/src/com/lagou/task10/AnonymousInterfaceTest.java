package com.lagou.task10;

public class AnonymousInterfaceTest {
    public static void test(AnonymousInterface ai){
        ai.show();
    }
    public static void main(String[] args) {
        AnonymousInterfaceTest.test(new AnonymousInterfaceImpl());
        System.out.println("---------------------------------------");
        AnonymousInterface ai = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        AnonymousInterfaceTest.test(ai);
        System.out.println("------------------------------------------");
        AnonymousInterface ait = ()-> System.out.println("匿名内部类2lamda表达式");
        AnonymousInterfaceTest.test(ait);
    }
}
