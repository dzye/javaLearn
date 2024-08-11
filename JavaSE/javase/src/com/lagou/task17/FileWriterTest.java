package com.lagou.task17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:/a.txt",true);
            fw.write('b');

            char[] cArr = new char[]{'a','b','c','d','e','f'};

            fw.write(cArr,2,1);
            fw.write(cArr);
            fw.flush();
            System.out.println("写入数据成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
