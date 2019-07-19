package com.zs.test;

import java.util.Random;

/*定义一个数组，长度为5
给每一个位置生成一个随机数
遍历打印数组
输出最大值、最小值、总和、平均值
排序
* */
public class Array {

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int x = r.nextInt(100);
            arr[i] = x;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        /*int max = arr[0],min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

        }System.out.print("最大值为：" + max);
        System.out.print("最小值为：" + min);*/
    }
}
