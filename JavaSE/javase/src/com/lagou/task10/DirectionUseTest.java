package com.lagou.task10;

public class DirectionUseTest {
    public static void test1(DirectionEnum de){
        switch (de){
            case LEFT:
                System.out.println("左牵黄"); break;
            case RIGHT:
                System.out.println("右擎苍"); break;
            case UP:
                System.out.println("举头望明月"); break;
            case DOWN:
                System.out.println("低头思故乡"); break;
            default:
                System.out.println("无");
        }
    }
    public static void main(String[] args) {
        test1(DirectionEnum.DOWN);
        System.out.println("----------------------");

    }
}
