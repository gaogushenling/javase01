package com.zs.test;

public class Narcissistic {
    /**
     * 水仙花数
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i/100;
            int b = i/10%10;
            int c = i%10;
            if (i == Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
                System.out.println(i);
            }
        }
    }
}
