package com.zs.substitute;
/*
用静态方法替代构造方法
 */
public class Count {
    private static Count c = new Count();

    public static Count getInstance(){
        return c;
    }
}
