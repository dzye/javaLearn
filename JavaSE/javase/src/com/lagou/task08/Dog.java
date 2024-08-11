package com.lagou.task08;

public class Dog extends Animal {
    private int teeth;

    public Dog() {
        super();
    }

    public Dog(String name, String color, int teeth) {
        super(name, color);
        setTeeth(teeth);
    }
    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        if(teeth>0) {
            this.teeth = teeth;
        }else{
            System.out.println("牙齿数量不正确");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println(getTeeth());
    }
}
