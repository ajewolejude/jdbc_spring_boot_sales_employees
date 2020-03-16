package com.example.jdbc_project.model;

public class Sale {

    public int id;
    public String item;
    public int quantity;
    public float amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Sale() {
    }

    public Sale( String item, int quantity, float amount) {
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
    }
}
