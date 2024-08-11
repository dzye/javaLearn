package com.lagou.task09;

public abstract class Account {
    private double money;

    public Account() {
    }

    public Account(double money) {
        setMoney(money);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public abstract double getLixi();
}
