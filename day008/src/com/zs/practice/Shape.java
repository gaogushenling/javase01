package com.zs.practice;

public abstract class Shape {
    double area;
    double per;
    String color;
    Shape(){
    }
    Shape(String color){
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();
}
