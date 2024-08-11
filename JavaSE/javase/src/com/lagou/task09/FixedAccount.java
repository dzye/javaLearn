package com.lagou.task09;

public class FixedAccount extends Account{

    @Override
    public double getLixi() {
        return getMoney()*0.03*1;
    }

    public static void main(String[] args) {
        Account account = new FixedAccount();
        account.setMoney(5000.01);
        double lixi = account.getLixi();
        System.out.println(lixi);
    }
}
