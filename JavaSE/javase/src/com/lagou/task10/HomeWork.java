package com.lagou.task10;

public class HomeWork {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[16][16];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
