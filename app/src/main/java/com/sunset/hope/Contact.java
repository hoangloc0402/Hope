package com.sunset.hope;

public class Contact {
    private String phoneNumber = null;
    private String address = null;
    private String email = null;

    public Contact() {
        this.phoneNumber = "";
        this.address = "";
        this.email = "";
    }

    public Contact(String phoneNumber, String address, String email) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
