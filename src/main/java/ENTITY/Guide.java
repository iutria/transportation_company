package ENTITY;

import java.util.Date;

public abstract class Guide {
    protected final static double BASE = 5000;
    protected String type;
    protected final static double INCREMENT = 0.25;
    protected int id;
    protected String status;
    protected Date date;
    protected double weight;
    protected int amount;
    protected Addressee addressee;
    protected Sender sender;
    protected boolean DHL;

    public Guide(
            int id,
            String status,
            Date date,
            double weight,
            int amount,
            String name,
            String department,
            String phoneExt,
            String company,
            String contact,
            String[] phones,
            Address address,
            boolean DHL
        ) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.weight = weight;
        this.amount = amount;
        this.sender = new Sender(name, department, phoneExt);
        this.addressee = new Addressee(company, contact, phones, address);
        this.DHL = DHL;
    }

    public Addressee getAddressee() {
        return addressee;
    }

    public void setAddressee(Addressee addressee) {
        this.addressee = addressee;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {this.status = status;}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isDHL() {
        return DHL;
    }

    public void setDHL(boolean DHL) {
        this.DHL = DHL;
    }

    public abstract double calculateGuideValue();

    @Override
    public String toString() {
        return type +":{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", date=" + date +
                ", weight=" + weight +
                ", amount=" + amount +
                ", addressee=" + addressee.toString() +
                ", sender=" + sender.toString() +
                ", liquidation = " + calculateGuideValue() +
                '}';
    }
}
