package com.zs.thread;
/*实现多线程的第一种方法，继承Thread*/
public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("a"+i);

        }
    }
}
