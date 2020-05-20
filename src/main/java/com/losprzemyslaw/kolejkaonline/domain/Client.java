package com.losprzemyslaw.kolejkaonline.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Client {
    private int id;

    @NotNull
    @Size(min = 5, max = 20, message = "Login musi mieć od 5 do 20 znaków")
    private String login;

    private String password;
    private double balance;
    private String email;
    private String name;
    private String surname;

    public Client() {

    }

    public Client(int id, String login, String password, double balance, String email, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.balance = 0;
        this.email = email;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
