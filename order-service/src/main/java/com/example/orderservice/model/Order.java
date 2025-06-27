package com.example.orderservice.model;

public class Order {
    private int id;
    private String product;
    private double amount;
    private String status;

    public Order(int i, String string) {
        this.id = i;
        this.product = string;
        this.amount = 0.0; // Default amount
        this.status = "Pending"; // Default status
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }  
    
    
}

   