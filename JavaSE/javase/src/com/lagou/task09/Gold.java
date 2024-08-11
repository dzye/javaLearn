package com.lagou.task09;

public class Gold implements Metal,Money{
    @Override
    public void buy() {
        System.out.println("买东西");
    }

    @Override
    public void shine() {
        System.out.println("金色");
    }

    public static void main(String[] args) {
        Metal metal = new Gold();
        metal.shine();

    }
}
