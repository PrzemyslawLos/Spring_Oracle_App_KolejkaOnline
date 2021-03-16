package com.losprzemyslaw.kolejkaonline.domain;

public class Client_Queue {
    private int clientID;
    private int queueID;
    private int cNumber;

    public Client_Queue(int clientID, int queueID, int cNumber) {
        this.clientID = clientID;
        this.queueID = queueID;
        this.cNumber = cNumber;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getQueueID() {
        return queueID;
    }

    public void setQueueID(int queueID) {
        this.queueID = queueID;
    }

    public int getcNumber() {
        return cNumber;
    }

    public void setcNumber(int cNumber) {
        this.cNumber = cNumber;
    }

    @Override
    public String toString() {
        return "Client_Queue{" +
                "clientID=" + clientID +
                ", queueID=" + queueID +
                ", cNumber=" + cNumber +
                '}';
    }
}
