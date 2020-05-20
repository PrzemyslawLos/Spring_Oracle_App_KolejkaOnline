package com.losprzemyslaw.kolejkaonline.domain;

public class Queue {
    int id;
    String companyName;
    int maxSize ;
    int numberOfPlaces;
    int currentNumber;

    public Queue(int id, String companyName,int maxSize, int numberOfPlaces) {
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

}
