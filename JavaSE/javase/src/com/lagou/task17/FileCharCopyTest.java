package com.lagou.task17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharCopyTest {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
             fr = new FileReader("D:/a.txt");
             fw = new FileWriter("D:/b.txt");
             int res = 0;
             while((res = fr.read())!=-1){
                 fw.write(res);
             }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null&&fw != null){
                try {
                    fr.close();
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
