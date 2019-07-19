package com.zs.test;

import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            Random num = new Random();
            int x = num.nextInt(100);
            arr[i] = x;
        }
        for (int i : arr) {
            System.out.println(i);
        }
        /*冒泡排序*/
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int a = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for (int i : arr) {
            System.out.print("  " + i);
        }
    }
}
