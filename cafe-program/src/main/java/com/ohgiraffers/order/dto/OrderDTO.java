package com.ohgiraffers.order.dto;

public class OrderDTO {

    private String name;

    private int price;

    private int quantity;

    private int totalPrice;

    public OrderDTO(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = price*quantity;
    }

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

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setQuantity(int quantity, int price) {
        this.quantity = quantity;
        this.price = price * quantity;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
