package com.lagou.task17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("D:/a.txt");
            /*int i1 = fr.read();
            System.out.println((char)i1);*/
            /*int res = 0;
            while((res = fr.read())!=-1){
                System.out.println((char)res);
            }*/
            char[] c1 = new char[5];
            /*int res = fr.read(c1,1,3);
            System.out.println(res);
            for (char c : c1) {
                System.out.println((char)c);
            }*/
            int res = fr.read(c1);
            System.out.println(res);
            for (char c : c1) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
