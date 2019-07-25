package com.zs.example1;
/*java中如何实现枚举
* 通过私有构造方法
* 提供常量实现
* jdk5之后，提供方法
* */
public class Season {
    private String name;
    private String description;
/*私有*/
    private Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static final Season SPRING = new Season("春","灿如春华");
    public static final Season SUMMER = new Season("夏","生如夏花");
    public static final Season AUTUMN = new Season("秋","皎如秋月");
    public static final Season WINTER = new Season("冬","清如冬雪");

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
