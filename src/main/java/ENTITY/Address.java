package ENTITY;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String COL;
    private String CP;

    public Address() {}

    public Address(String street, String city, String state, String country, String COL, String CP) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.COL = COL;
        this.CP = CP;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCOL() {
        return COL;
    }

    public void setCOL(String COL) {
        this.COL = COL;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }
}
