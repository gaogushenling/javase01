package com.zs.Interface4;

public class Test {
    public static void main(String[] args) {
        Order order = new Order(1);
        OrderEnum orderEnum = OrderEnum.NO_PAY.getOrderEnum(order.getOrderStatus());
        System.out.println(orderEnum.getInfo());
    }
}
