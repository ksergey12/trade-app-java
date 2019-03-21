package nik.trade.tradeapp2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Good {
    @Id
    private String id;
    private String name;
    private int price;
    private String Delivery;
    private String Description;

    public Good() {
    }

    public Good(String name, int price, String delivery, String description) {
        this.name = name;
        this.price = price;
        Delivery = delivery;
        Description = description;
    }

    public Good(String id, String name, int price, String delivery, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        Delivery = delivery;
        Description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDelivery() {
        return Delivery;
    }

    public void setDelivery(String delivery) {
        Delivery = delivery;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return Objects.equals(id, good.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Good{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Delivery='" + Delivery + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
