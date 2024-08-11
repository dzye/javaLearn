package com.lagou.task16;

import java.io.IOException;

public class ExceptionPreventTest {
    public static void main(String[] args) {
        int ia = 6;
        int ib = 0;
        if(ib != 0) {
            System.out.println(ia / ib);
        }

        int[] arr = new int[5];
        int pos = 5;
        if(pos >= 0 && pos < arr.length) {
            System.out.println(arr[pos]);
        }
        String str = null;
        if(str != null) {
            System.out.println(str.length());
        }

        Exception ex = new Exception();
        if(ex instanceof IOException) {
            IOException ie = (IOException) ex;
        }
        String str2 = "123a";
        if(str2.matches("\\d+")) {
            System.out.println(Integer.parseInt(str2));
        }
        System.out.println("结束");
    }
}
