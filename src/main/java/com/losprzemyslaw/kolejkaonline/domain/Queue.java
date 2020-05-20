package com.losprzemyslaw.kolejkaonline.domain;

public class Queue {
    private int id;
    private String companyName;
    private int maxSize;
    private int numberOfPlaces;
    private int currentNumber;

    public Queue(int id, String companyName, int maxSize, int numberOfPlaces) {
        this.id = id;
        this.maxSize = maxSize;
        this.numberOfPlaces = numberOfPlaces;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "companyName='" + companyName + '\'' +
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
