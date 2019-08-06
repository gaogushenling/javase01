package com.zs.thread;
/*实现多线程的第二种方法，实现接口Runnable*/
public class RunnableDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("通过接口实现多线程，屏蔽掉了单继承实现多线程的缺点！");
    }
}
