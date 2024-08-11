package com.lagou.task16;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/a.txt");
        /*if(f1.exists()) {
            System.out.println("文件名："+ f1.getName());
            System.out.println("文件大小："+f1.length());
            Date d1 = new Date(f1.lastModified());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("最后修改时间："+sdf.format(d1));
            System.out.println("绝对路径："+f1.getAbsolutePath());
            System.out.println(f1.delete()?"删除成功":"删除失败");
        }else {
            System.out.println(f1.createNewFile()?"文件创建成功":"文件创建失败");
        }


        System.out.println("-----------------------");
        File f2 = new File("D:/目录/子目录");
        if(f2.exists()) {
            System.out.println("目录名称："+ f2.getName());
            System.out.println(f2.delete()?"目录删除成功":"目录删除失败");
        }else{
            System.out.println(f2.mkdirs()?"目录创建成功":"目录创建失败");
        }

        System.out.println("--------------------------");
        File f3 = new File("D:/目录");
        if(f3.exists()) {
            File[] files = f3.listFiles();
            for(File file : files) {
                if(file.isFile()) {
                    System.out.println("文件: "+file.getName());
                }else if(file.isDirectory()) {
                    System.out.println("目录: "+file.getName());
                }
            }
        }else{
            System.out.println("无");
        }*/

        System.out.println("---------------------------");
        /*FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.matches("[\\s\\S]*\\.avi");
            };
        };*/
        FileFilter fileFilter = (File pathname)->{return pathname.getName().endsWith(".txt");};
        File f4 = new File("D:/目录");
        if(f4.exists()) {
            File[] files = f4.listFiles(fileFilter);
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
