package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {

    @Value("101")
    private int orderId;

    @Value("SURAJ")
    private String customerName;

    @Value("Laptop")
    private String productName;

    @Value("4")
    private int quantity;

    public void display() {
        System.out.println("Following is order details:");
        System.out.println("OrderId: " + orderId);
        System.out.println("CustomerName: " + customerName);
        System.out.println("ProductName: " + productName);
        System.out.println("Quantity: " + quantity);
    }
}