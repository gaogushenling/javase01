package com.zs.test;

public class Triangle5 {
    public static void main(String[] args) {
        for(int i = 0; i <5; i++){
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }for (int k = 0; k < i + i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
