package com.zs.bank;

import java.util.Scanner;

/**
 * 1.查余额
 * 2.存款
 * 3.取款
 * 4.转账
 * 5.退出
 */
public class Bank {
    static int rmb = 10000;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }
    static void showMenu(){
        while(true){
            System.out.println("===================");
            System.out.println("1.查看余额");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入功能编号：");
            int index = input.nextInt();
            input.nextLine();
            switch (index){
                case 1:
                    lookMoney();
                    break;
                case 2:
                    addRmb();
                    break;
                case 3:
                    outRmb();
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("没有此功能");
            }
        }
    }
    static void lookMoney(){
        System.out.println("余额：" + rmb);
    }
    static void addRmb(){
        System.out.println("请输入存入金额：");
        int add = input.nextInt();
        input.nextLine();
        rmb += add;
        System.out.println("存入成功，余额:" + rmb);
    }
    static void outRmb(){
        System.out.println("请输入取款金额：");
        int out = input.nextInt();
        input.nextLine();
        rmb -= out;
        System.out.println("取款成功，余额:" + rmb);
    }
    static void tRmb(){
        System.out.println("请输入转账金额：");
        int out = input.nextInt();
        input.nextLine();
        if(rmb>=out){
            rmb -= out;
            System.out.println("转账成功，余额:" + rmb);
        }else {
            System.out.println("余额不足");
        }
    }
}
