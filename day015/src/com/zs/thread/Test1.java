package com.zs.thread;

public class Test1 {
    public static void main(String[] args) {
        new ThreadDemo1().start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("b"+i);
        }
    }
}
