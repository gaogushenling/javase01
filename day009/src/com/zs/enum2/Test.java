package com.zs.enum2;

public class Test {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.AUTUMN);
//        SeasonEnum.AUTUMN
        SeasonEnum[] season = SeasonEnum.values();
        for (SeasonEnum s:season) {
            System.out.println(s);
        }
    }
}
