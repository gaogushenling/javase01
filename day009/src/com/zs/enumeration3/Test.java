package com.zs.enumeration3;

public class Test {
    public static void main(String[] args) {
        Order order = new Order(0);
        OrderEnum orderEnum = OrderEnum.getOrderEnum(order.getOrderStatus());
        System.out.println(orderEnum.getInfo());
    }
}
