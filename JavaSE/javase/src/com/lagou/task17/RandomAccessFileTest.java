package com.lagou.task17;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("D:\\a.txt", "rw");
            raf.seek(2);
            int res = raf.read();
            System.out.println("打印："+(char)res);
            raf.write('2');
            System.out.println("写入成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
