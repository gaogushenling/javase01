package com.zs.practice.Cards;

public class Test {
    public static void main(String[] args) {
        String[] f = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] s = {"红桃","黑桃","方片","梅花"};
        Card[] c = new Card[52];
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < s.length; j++) {
                c[i * 4 + j] = new Card(f[i],s[j]);
            }
        }
        for (Card x:c) {
            System.out.println(x);
        }
    }
}
