package com.zs.test;

import java.util.Scanner;

public class ChickenRabbit {
    public static void main(String[] args) {

        System.out.println("请输入头的个数：");
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        System.out.println("请输入脚的个数：");
        int foot = scanner.nextInt();
        if (head>=0 && foot>=0 && (foot >= 2*head) && foot <= 4*head && (foot % 2 ==0)){
            int x = (4*head - foot)/2;
            int y = head - x;
            System.out.println("兔子有"+ y +"只");
            System.out.println("鸡有"+ x +"只");
        }else {
            System.out.println("请输入合法数据");
        }

        /*20头，56脚，有8只兔，那就有12只鸡*/
    }
}
