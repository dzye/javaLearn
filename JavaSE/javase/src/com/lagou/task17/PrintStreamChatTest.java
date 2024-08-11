package com.lagou.task17;

import java.io.*;
import java.util.Scanner;

public class PrintStreamChatTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintStream ps = null;
        try {
             br = new BufferedReader(new InputStreamReader(System.in));
             ps = new PrintStream(new FileOutputStream("D:/a.txt"));
            while(true) {
                System.out.println("请输入聊天内容");
                String str = br.readLine();
                if ("bye".equals(str)) {
                    System.out.println("结束");
                    break;
                } else {
                    ps.println(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ps != null) {
                ps.close();
            }
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
