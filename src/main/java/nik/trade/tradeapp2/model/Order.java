package nik.trade.tradeapp2.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Order {
    private String id;
    private int amount;
    private LocalDate date;
    private Good good;
    private Customer customer;

    public Order(int amount, LocalDate date, Good good, Customer customer) {
        this.amount = amount;
        this.date = date;
        this.good = good;
        this.customer = customer;
    }

    public Order(String id, int amount, LocalDate date, Good good, Customer customer) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.good = good;
        this.customer = customer;
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", good=" + good +
                ", customer=" + customer +
                '}';
    }
}


