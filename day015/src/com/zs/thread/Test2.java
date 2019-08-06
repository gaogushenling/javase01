package com.zs.thread;

public class Test2 {
    public static void main(String[] args) {
        new Thread(new RunnableDemo2()).start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
}
