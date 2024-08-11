package com.lagou.task10;

import java.util.Scanner;

public class ChessPlay {
    private String[][] arr;
    private String curRole = "黑子";
    public ChessPlay() {
        arr = new String[16][16];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                arr[i][j] = "+";
            }
        }
    }
    public String getPoint(int row, int col) {
        return arr[row][col];
    }
    public void setPoint(int row, int col, String point) {
        arr[row][col] = point;
    }
    public void show(){
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.curRole+"输入坐标位置：");
        int row = sc.nextInt();
        int col = sc.nextInt();
        this.setPoint(row, col, this.curRole.substring(0,1));
        this.show();
    }
    /*public boolean check(int row, int col){

    }*/
    public static void main(String[] args) {
        ChessPlay play = new ChessPlay();
        play.show();
        play.play();
    }
}
