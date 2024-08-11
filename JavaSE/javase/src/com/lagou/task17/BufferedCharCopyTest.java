package com.lagou.task17;

import java.io.*;

public class BufferedCharCopyTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("D:/a.txt"));
            bw = new BufferedWriter(new FileWriter("D:/b.txt"));
            String s1 = null;
            while ((s1 = br.readLine()) != null) {
                bw.write(s1);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
