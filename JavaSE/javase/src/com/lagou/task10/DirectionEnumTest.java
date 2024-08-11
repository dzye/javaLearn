package com.lagou.task10;
import java.util.Arrays;
public class DirectionEnumTest {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(DirectionEnum.values()));
        DirectionEnum up = DirectionEnum.UP;
        System.out.println(up.toString());
        System.out.println(up.ordinal());
        System.out.println("------------------------------");
        System.out.println(DirectionEnum.valueOf("UP").toString());
        DirectionEnum down = DirectionEnum.DOWN;
        System.out.println(up.compareTo(down));
        DirectionEnum[] values = DirectionEnum.values();
        for(int i =0;i<values.length;i++){
            values[i].show();
        }
    }
}
