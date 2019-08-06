package com.zs.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*多线程实现文件拷贝和输入台聊天*/
public class ThreadDemo3 {
    public static void main(String[] args) {
        new Thread(() ->{
            try {
                InputStream in = new FileInputStream("F:\\workspace_IDEA.zip");
                OutputStream out = new FileOutputStream("E:\\workspace_IDEA.zip");
                byte[] bytes = new byte[1024];
                int i;
                while ((i = in.read(bytes)) != -1){
                    out.write(bytes,0,i);
                }
                System.out.println("文件传输完成");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("正在聊天");
        System.out.println("正在聊天");
        System.out.println("正在聊天");
        System.out.println("正在聊天");
        System.out.println("正在聊天");
        System.out.println("正在聊天");
    }
}
