package com.losprzemyslaw.kolejkaonline.domain;

public class Company_Queue {
    private int companyID;
    private int queueID;
    private int c_number;

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

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getQueueID() {
        return queueID;
    }

    public void setQueueID(int queueID) {
        this.queueID = queueID;
    }

    public int getC_number() {
        return c_number;
    }

    public void setC_number(int c_number) {
        this.c_number = c_number;
    }
}
