package com.zs.test;

public class fors {
    static int[] arr = new int[]{1,2,3,4,5};

    public static void main(String[] args) {

        /*遍历数组*/
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
       /*下边的是foreach循环，与上边等价*/
        for (int x:arr) {
            System.out.println(x);
        }
    }
}
