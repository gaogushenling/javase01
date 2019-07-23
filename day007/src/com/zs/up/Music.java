package com.zs.up;
//如果子类没有写play方法，会自动继承父类方法
public class Music {
    public static void tune(Instrument i){ //使用父类
        i.play();
    }
   /*public static void tune(Wind i) { //不使用父类,
       i.play();
   }
    public static void tune(Stringed i) { //不使用父类
        i.play();
    }
    public static void tune(Brass i) { //不使用父类
        i.play();
    }*/
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); //==Instrument i = flute; 发生了向上转型
        Stringed stringed = new Stringed();
        tune(stringed);
        Brass brass = new Brass();
        tune(brass);
    }
}
