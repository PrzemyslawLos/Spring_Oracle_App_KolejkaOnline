package com.losprzemyslaw.kolejkaonline.domain;

public class Company {
    int id;
    String login;
    String password;
    String description;
    String companyName;
    String adress;
    String city;
    String postcode;

    public Company(int id, String login, String password, String description, String companyName, String adress, String city, String postcode) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.description = description;
        this.companyName = companyName;
        this.adress = adress;
        this.city = city;
        this.postcode = postcode;
    }

    public Company() {
    }

    @Override
    public String toString() {
        return "Company{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", description='" + description + '\'' +
                ", companyName='" + companyName + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}
