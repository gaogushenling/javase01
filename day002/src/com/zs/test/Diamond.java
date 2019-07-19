package com.zs.test;
                                                                               /*
                                                                                0,0  0,1  0,2  0,3  0,4
                                                                                1,0  1,1  1,2  1,3  1,4
                                                                                2,0  2,1  2,2  2,3  2,4
                                                                                3,0  3,1  3,2  3,3  3,4
                                                                                4,0  4,1  4,2  4,3  4,4
                                                                               */
public class Diamond {
    public static void main(String[] args) {
       for (int x = 0; x < 5; x++) {
           for (int y = 0; y < 5; y++) {
               if(x + y >= 2 && y - x <= 2 &&
                  x - y <= 2 && x + y <= 6 ){
                   System.out.print("*");
               }else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
