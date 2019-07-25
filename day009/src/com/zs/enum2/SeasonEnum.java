package com.zs.enum2;
/*
enum:语法糖，本质不变，改变用法。编译不变
* */
public enum SeasonEnum {
    AUTUMN("秋", "皎如秋月"),
    SPRING("春", "灿如春华"),
    SUMMER("夏", "生如夏花"),
    WINTER("冬", "清如冬雪");

    private String name;
    private String description;

    SeasonEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
