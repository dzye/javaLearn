package com.lagou.task10;

public class DirectionTest {
    public static void main(String[] args) {
        /*Direction d1 = new Direction("向上");
        System.out.println(d1.getDesc());

        Direction d2 = new Direction("向下");
        System.out.println(d2.getDesc());

        Direction d3 = new Direction("向左");
        System.out.println(d3.getDesc());

        Direction d4 = new Direction("向右");
        System.out.println(d4.getDesc());

        System.out.println("-----------------------------");*/

        Direction d1 = Direction.UP;
        System.out.println(d1.getDesc());
        Direction d2 = Direction.DOWN;
        System.out.println(d2.getDesc());
        Direction d3 = Direction.LEFT;
        System.out.println(d3.getDesc());
        Direction d4 = Direction.RIGHT;
        System.out.println(d4.getDesc());
        System.out.println("---------------------");
        DirectionEnum d5 = DirectionEnum.UP;
        System.out.println(d5.getDesc());
    }
}
