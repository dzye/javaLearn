package com.lagou.task09;

public class Man implements Hunter{
    @Override
    public void running() {
        System.out.println("奔跑");
    }

    @Override
    public void hunt() {
        System.out.println("捕猎");
    }

    public static void main(String[] args) {
        Runner runner = new Man();
        runner.running();
//        runner.hunt();
        Hunter hunter = new Man();
        hunter.hunt();
        hunter.running();
    }
}
