package com.lagou.task17;

import java.io.*;

public class BufferedByCopyTest {
    public static void main(String[] args) {
        long g1 = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            InputStream inputStream = new FileInputStream("D:/a.mp4");
            bis = new BufferedInputStream(inputStream);
            OutputStream outputStream = new FileOutputStream("D:/b.mp4");
            bos = new BufferedOutputStream(outputStream);
            byte[] buf = new byte[1024];
            int len;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long g2 = System.currentTimeMillis();
        System.out.println(g2-g1);
    }
}
