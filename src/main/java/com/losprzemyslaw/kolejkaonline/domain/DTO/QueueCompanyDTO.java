package com.losprzemyslaw.kolejkaonline.domain.DTO;

public class QueueCompanyDTO {
    private String description;
    private String companyName;
    private String adress;
    private String city;
    private String postcode;
    private int numberOfPlaces;
    private int queueID= 21;

    public QueueCompanyDTO() {
    }

    public QueueCompanyDTO(String description, String companyName, String adress, String city, String postcode, int numberOfPlaces, int queueID) {
        this.description = description;
        this.companyName = companyName;
        this.adress = adress;
        this.city = city;
        this.postcode = postcode;
        this.numberOfPlaces = numberOfPlaces;
        this.queueID = 21;
    }

    public int getQueueID() {
        return queueID;
    }

    public void setQueueID(int queueID) {
        this.queueID = queueID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }
}
