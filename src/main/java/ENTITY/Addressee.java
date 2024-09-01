package ENTITY;

import java.util.Arrays;

public class Addressee {
    private String company;
    private String contact;
    private String[] phones;
    private Address address;

    public Addressee(String company, String contact, String[] phones, Address address) {
        this.company = company;
        this.contact = contact;
        this.phones = phones;
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Addressee{" +
                "company='" + company + '\'' +
                ", contact='" + contact + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", address=" + address +
                '}';
    }
}
