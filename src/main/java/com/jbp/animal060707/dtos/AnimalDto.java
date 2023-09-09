package com.jbp.animal060707.dtos;

public class AnimalDto {
    private String city;

    private String facility;

    private String municipality;

    private String category3;
    
    private String parking;

    public String getAddress() {
        return address;
    }

    public AnimalDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getOperatingTime() {
        return operatingTime;
    }

    public AnimalDto setOperatingTime(String operatingTime) {
        this.operatingTime = operatingTime;
        return this;
    }

    public String getClosedDays() {
        return closedDays;
    }

    public AnimalDto setClosedDays(String closedDays) {
        this.closedDays = closedDays;
        return this;
    }

    public String getHomePage() {
        return homePage;
    }

    public AnimalDto setHomePage(String homePage) {
        this.homePage = homePage;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AnimalDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    private String address;

    private String operatingTime;

    private String closedDays;

    private String homePage;

    private String phoneNumber;

    public AnimalDto(String city, String municipality, String facility, String parking, String category3, String address, String homePage, String operatingTime, String closedDays, String phoneNumber) {
        this.city=city;
        this.municipality=municipality;
        this.facility=facility;
        this.parking=parking;
        this.category3=category3;
        this.address=address;
        this.homePage=homePage;
        this.operatingTime=operatingTime;
        this.closedDays=closedDays;
        this.phoneNumber=phoneNumber;
    }


    public String getCity() {
        return city;
    }

    public AnimalDto setCity(String city) {
        this.city = city;
        return this;
    }

    public String getFacility() {
        return facility;
    }

    public AnimalDto setFacility(String facility) {
        this.facility = facility;
        return this;
    }

    public String getMunicipality() {
        return municipality;
    }

    public AnimalDto setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    public String getCategory3() {
        return category3;
    }

    public AnimalDto setCategory3(String category3) {
        this.category3 = category3;
        return this;
    }

    public String getParking() {
        return parking;
    }

    public AnimalDto setParking(String parking) {
        this.parking = parking;
        return this;
    }
}

