package com.zs.io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
       // File file = new File("./day014/src/com/zs/io/aaa.txt");//idea中，路径以idea根为根，此为javase
        //boolean delete()
        //删除由此抽象路径名表示的文件或目录。
       /* boolean b = file.delete();
        System.out.println(b);*/
        /*try {
            file.createNewFile();//当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.canExecute());//测试应用程序是否可以执行此抽象路径名表示的文件。
        System.out.println(file.canRead());//测试应用程序是否可以读取由此抽象路径名表示的文件。
        System.out.println(file.canWrite());//测试应用程序是否可以修改由此抽象路径名表示的文件。*/
        /*try {
            File file = File.createTempFile(System.currentTimeMillis() + "",".txt");
            *//*static File createTempFile(String prefix, String suffix)
            在默认临时文件目录中创建一个空文件，使用给定的前缀和后缀生成其名称。
              static File createTempFile(String prefix, String suffix, File directory)
              在指定的目录中创建一个新的空文件，使用给定的前缀和后缀字符串生成其名称。  *//*
            System.out.println(file);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*File file = new File("F:/test/a.txt");
        file.mkdir();//创建a.txt必须要有test
        file.mkdirs();//创建a.txt,没有test也行，会创建
        */
        /*File file = new File("字符串地址");
        String[] paths = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".zip")){
                    return false;
                }else {
                    return true;
                }
            }
        });
        for (String path:paths) {
            System.out.println(path);
        }*/
        /*String[] list()
        返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
        String[] list(FilenameFilter filter)
        返回一个字符串数组，命名由此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        File[] listFiles()
        返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File[] listFiles(FileFilter filter)
        返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。
        File[] listFiles(FilenameFilter filter)
        返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。
        static File[] listRoots()
        列出可用的文件系统根。*/


    }
}
