package com.zs.Interface4;

public enum OrderEnum implements TestInterface{
    NO_PAY(0,"未支付"),
    YES_PAY(1,"已支付"),
    OVER(2,"已完成");


    private Integer code;
    private String info;

    OrderEnum(Integer code, String info) {
        this.code = code;
        this.info = info;
    }

    public Integer getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }


    @Override
    public OrderEnum getOrderEnum(Integer code) {
            OrderEnum[] orderEnums = OrderEnum.values();
            for (OrderEnum orderEnum:orderEnums) {
                if (orderEnum.code.equals(code)){
                    return orderEnum;
                }
            }
            return null;
    }
}
