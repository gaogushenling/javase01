package com.zs.test;

public class Letter {
    public static void main(String[] args) {
        /*for (int i = 97; i < 123; i++) {
            System.out.print((char)i);                          //1
        }for (int i = 121; i > 96; i--) {
            System.out.print((char)i);
        }*/
        for (int i = 97; i < (123 + 25); i++) {
            if (i < 123) {
                System.out.print((char) i);                      //2
            }else {
                System.out.print((char) (244 - i));         /*变量自增，使用常数减去则可缔造递减*/
            }
        }
    }
}
