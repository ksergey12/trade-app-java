package nik.trade.tradeapp2.model;

import java.util.Date;

public class Order {
    public String id;
    public int idCustomer;
    public int idGood;
    public int amount;
    public Date date;

    public Order() {
    }

    public Order(String id, int idCustomer, int idGood, int amount, Date date) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.idGood = idGood;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdGood() {
        return idGood;
    }

    public void setIdGood(int idGood) {
        this.idGood = idGood;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
