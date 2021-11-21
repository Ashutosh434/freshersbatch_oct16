package com.example.SpringRestExampleApplication;

public class Address {
    public Address(Integer id, String city, String state, String country) {
        super();
        this.id = id;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    private Integer id;
    private String city;
    private String state;
    private String country;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    @Override
    public String toString() {
        return "User [city=" + city + ", state=" + state + ", country=" + country + "]";
    }



}
