package com.losprzemyslaw.kolejkaonline.domain.DTO;

public class Client_QueueDTO {
    private int clientID;
    private int cNumber;
    private String name;
    private String login;

    public Client_QueueDTO(int clientID, int cNumber, String name, String login) {
        this.clientID = clientID;
        this.cNumber = cNumber;
        this.name = name;
        this.login = login;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }



    public int getcNumber() {
        return cNumber;
    }

    public void setcNumber(int cNumber) {
        this.cNumber = cNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Client_QueueDTO{" +
                "clientID=" + clientID +
                ", cNumber=" + cNumber +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
