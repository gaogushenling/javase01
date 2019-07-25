package com.zs.practice;

public class Rectangle extends Shape{
    double width;
    double height;
    Rectangle(){}
    Rectangle(double width,double height,String color){
        super(color);                            //父类的构造方法优先，   super必须在第一行！！！
        this.width = width;
        this.height = height;

    }
    public double getArea(){
        area = width * height;
        return area;
    };
    public double getPer(){
        per = 2*(width + height);
        return per;
    };
    public void showAll(){
        System.out.println("面积："+area+"周长："+per);
    };
}
