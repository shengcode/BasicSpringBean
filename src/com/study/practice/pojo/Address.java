/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.practice.pojo;

public class Address {
    private String Street;
    private String City;
    private String State;
    private String Country;
    private String Zip;

     public Address() {
        this.Street = "N/A";
        this.City = "N/A";
        this.State = "N/A";
        this.Country = "N/A";
        this.Zip = "N/A";
    }
    public Address(String Street, String City, String State, String Country, String Zip) {
        this.Street = Street;
        this.City = City;
        this.State = State;
        this.Country = Country;
        this.Zip = Zip;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    @Override
    public String toString() {
        return "Address{" + "Street=" + Street + ", City=" + City + ", State=" + State + ", Country=" + Country + ", Zip=" + Zip + '}';
    }
    
    
    
}
