package com.losprzemyslaw.kolejkaonline.domain;

public class Company_Queue {
    int companyID;
    int queueID;
    int c_number;

    public Company_Queue(int companyID, int queueID, int c_number) {
        this.companyID = companyID;
        this.queueID = queueID;
        this.c_number = c_number;
    }

    @Override
    public String toString() {
        return "Company_Queue{" +
                "companyID=" + companyID +
                ", queueID=" + queueID +
                '}';
    }
}
