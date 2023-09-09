package com.jbp.animal060707.entities;

public class AnimalEntity {


    private Long id;

    private String address;
    private String municipality;

    public String getMunicipality() {
        return municipality;
    }

    public AnimalEntity setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    private String closedDays;
    private String parking;

    public String getClosedDays() {
        return closedDays;
    }

    public AnimalEntity setClosedDays(String closedDays) {
        this.closedDays = closedDays;
        return this;
    }

    public String getParking() {
        return parking;
    }

    public AnimalEntity setParking(String parking) {
        this.parking = parking;
        return this;
    }

    public String getOperatingTime() {
        return operatingTime;
    }

    public AnimalEntity setOperatingTime(String operatingTime) {
        this.operatingTime = operatingTime;
        return this;
    }

    public String getAccompanying() {
        return accompanying;
    }

    public AnimalEntity setAccompanying(String accompanying) {
        this.accompanying = accompanying;
        return this;
    }

    private String operatingTime;
    private String accompanying;
    private String facility;

    private String category3;

    private String city;

    private String homePage;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AnimalEntity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getHomePage() {
        return homePage;
    }

    public AnimalEntity setHomePage(String homePage) {
        this.homePage = homePage;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AnimalEntity setCity(String city) {
        this.city = city;
        return this;
    }

    public Long getId() {
        return id;
    }

    public AnimalEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public AnimalEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getFacility() {
        return facility;
    }

    public AnimalEntity setFacility(String facility) {
        this.facility = facility;
        return this;
    }

    public String getCategory3() {
        return category3;
    }

    public AnimalEntity setCategory3(String category3) {
        this.category3 = category3;
        return this;
    }
}
