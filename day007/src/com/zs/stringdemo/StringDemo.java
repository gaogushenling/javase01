package com.zs.stringdemo;

public class StringDemo {
    /*String成员方法*/
    public static void main(String[] args) {
        String s = new String("sadfgh");
        System.out.println(s.charAt(1));
        System.out.println(s.codePointAt(1));/*去看API就好了*/
    }
}
