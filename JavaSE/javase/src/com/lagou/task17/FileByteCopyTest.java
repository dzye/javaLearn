package com.lagou.task17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteCopyTest {
    public static void main(String[] args) {
        long g1 = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:/a.mp4");
            fos = new FileOutputStream("D:/b.mp4");
            /*int res = 0;
            while((res = fis.read())!=-1){
                fos.write(res);
            }*/
            /*int num = fis.available();
            byte[] bytes = new byte[num];
            fis.read(bytes);
            fos.write(bytes);*/

            byte[] buf = new byte[1024];
            int len;
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null&&fos!=null) {
                try {
                    fis.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long g2 = System.currentTimeMillis();
        System.out.println(g2-g1);
    }
}
