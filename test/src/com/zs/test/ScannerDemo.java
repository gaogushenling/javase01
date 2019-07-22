package com.zs.test;

import java.util.Scanner;

public class ScannerDemo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int index = input.nextInt();
        input.nextLine();
        System.out.println(index);
        String s = input.nextLine();
        System.out.print(s);
    }//此程序无法执行字符串输入，若执行必须打开注释代码部分
}
