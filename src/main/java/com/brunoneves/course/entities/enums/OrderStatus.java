package com.brunoneves.course.entities.enums;

public enum OrderStatus {

    WAINTING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCEL(5);

    private int code;
    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    //converte um valor numeroico para um valor enumerado

    public static OrderStatus valueOf(int code){
        for (OrderStatus value : OrderStatus.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OderStatus code: " + code);
    }
}
