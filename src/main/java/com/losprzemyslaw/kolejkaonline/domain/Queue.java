package com.losprzemyslaw.kolejkaonline.domain;

public class Queue {
    private int id;
    private int companyid;
    private int maxSize;
    private int numberOfPlaces;
    private int currentNumber;

    public Queue(int id, int companyid, int maxSize, int numberOfPlaces) {
        this.id = id;
        this.maxSize = maxSize;
        this.numberOfPlaces = numberOfPlaces;
        this.companyid= companyid;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "companyid='" + companyid + '\'' +
                ", maxSize=" + maxSize +
                ", numberOfPlaces=" + numberOfPlaces +
                ", currentNumber=" + currentNumber +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }
}
