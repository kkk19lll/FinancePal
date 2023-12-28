package com.example.financepal.models;

public class Wallet {
    private String id, name_wallet;
    private int money_wallet, user_id;

    public Wallet(String id, String name_wallet, int money_wallet, int user_id) {
        this.id = id;
        this.name_wallet = name_wallet;
        this.money_wallet = money_wallet;
        this.user_id = user_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName_wallet() {
        return name_wallet;
    }

    public void setName_wallet(String name_wallet) {
        this.name_wallet = name_wallet;
    }

    public int getMoney_wallet() {
        return money_wallet;
    }

    public void setMoney_wallet(int money_wallet) {
        this.money_wallet = money_wallet;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
