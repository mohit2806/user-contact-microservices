package com.contact.entity;

public class Contact {

    private Long cId;
    private String email;
    private String country;
    private Long userId;

    public Contact(Long cId, String email, String country, Long userId) {
        this.cId = cId;
        this.email = email;
        this.country = country;
        this.userId = userId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
