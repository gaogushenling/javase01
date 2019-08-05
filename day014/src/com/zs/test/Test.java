package com.zs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
                                            //***********字节流，输入输出***********************
/*1.在控制台输入一个文件路径
2.输入target路径
3.将src路径指定的文件拷贝到target目录下
* */
public class Test {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("请输入源文件地址：");
        String srcPath = src.nextLine();
        File srcFile = new File(srcPath);
        System.out.println("请输入目标路径");
        String targetpath = src.nextLine();
        /*File f = new File(targetpath);//使之更安全
        if (!f.exists()){
            f.mkdirs();
        }*/
        File targetFile = new File(targetpath + srcFile.getName());

        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(targetFile);
            byte[] bytes = new byte[8];
            int i = 0;
            while ((i = in.read(bytes)) != -1) {
                out.write(bytes, 0, i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {//使之更安全
                if (in != null){
                    in.close();
                }if (out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
