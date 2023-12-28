package com.example.financepal.models;

public class Investment {
    private String id, name_investment, description;
    private int price;

    public Investment(String id, String name_investment, String description, int price) {
        this.id = id;
        this.name_investment = name_investment;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName_investment() {
        return name_investment;
    }

    public void setName_investment(String name_investment) {
        this.name_investment = name_investment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
