package com.zs.practice;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(1,2,"蓝色");
                                                                        /*题目另外一个Circle类没写*/
        for (Shape x:shapes) {
            x.getArea();
            x.getPer();
            x.showAll();
        }
    }
}
