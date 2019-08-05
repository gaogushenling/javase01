package com.zs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
/*字符流 ：输入流 读*/
public class Test2 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream("./day014/src/com/zs/io/aaa.txt");
            Reader r = new InputStreamReader(in,"utf-8");
            char[] chars = new char[8];
            String str = "";
            int i = 0;
            while ((i = r.read(chars)) != -1){
                str += new String(chars,0,i);
            }
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
