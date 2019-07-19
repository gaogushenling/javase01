package com.zs.test;

public class Triangle1 {
    //1 逻辑思维
   /* public static void main(String[] args) {
        for(int i = 0; i <5; i++){
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    
    //2 数学思维
    /*public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(x + "," + y +"  ");
            }
            System.out.println();
        }
    }*/
                                                                               /*上述代码打印结果，是二维坐标系
                                                                                0,0  0,1  0,2  0,3  0,4
                                                                                1,0  1,1  1,2  1,3  1,4
                                                                                2,0  2,1  2,2  2,3  2,4
                                                                                3,0  3,1  3,2  3,3  3,4
                                                                                4,0  4,1  4,2  4,3  4,4
                                                                               */
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
               if(x>=y){                                     //此类问题注意关键线位置的规律即可！！！！！！！！！！！！，然后菱形用此方法。详情看菱形代码
                   System.out.print("*");
               }
            }
            System.out.println();
        }
    }
}
