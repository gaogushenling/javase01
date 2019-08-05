package com.zs.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*字符流：输出流 写*/
public class Test3 {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("./day014/src/com/zs/io/aaa.txt");
        Writer w = new OutputStreamWriter(out);
        /*将admin写入到内存*/
        w.write("admin");
        /*执行下列操作之一才可成功写入，不然数据只在内存中，没有保存到硬盘*/
        w.flush();/*流刷新*/
        w.close();/*流关闭*/
    }
}
