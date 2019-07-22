package com.zs.statics;

public class Test {
    /*public static void main(String[] args) {
        System.out.println(StaticDemo.abs(-4));//不需要对象
    }*/
    public static void main(String[] args) {
        System.out.println(new StaticDemo().abs(-4));//new 必须创建新对象 **注意括号
        //括号
    }
}
