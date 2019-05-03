package nik.trade.tradeapp2.forms;

public class OrderForm {
    private String id;
    private int amount;
    private String date;
    private String good;
    private String customer;
    private int count;
    private int summ;

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = this.amount* this.count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGood() {
        return good;
    }

    public String getCustomer() {
        return customer;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", good='" + good + '\'' +
                ", customer='" + customer + '\'' +
                '}';
    }
}
