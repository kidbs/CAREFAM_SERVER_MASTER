package com.jbp.animal060707.dtos;

public class AnimalDto {
    private String city;

    private String facility;

    private String municipality;

    private String category3;
    
    private String parking;

    public AnimalDto(String city, String municipality, String facility, String parking, String category3) {
        this.city=city;
        this.municipality=municipality;
        this.facility=facility;
        this.parking=parking;
        this.category3=category3;
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

