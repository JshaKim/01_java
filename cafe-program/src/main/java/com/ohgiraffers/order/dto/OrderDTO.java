package com.ohgiraffers.order.dto;

public class OrderDTO {

    private String name;

    private int price;

    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuName() {
        return name;
    }

    public void setMenuName(String menuName) {
        this.name = menuName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity, int price) {
        this.quantity = quantity;
    }


}
