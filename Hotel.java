package com.LegrandVoyage;

import java.util.List;

public class Hotel {
    private String avis;
    private String contact;
    private List<Hotel> hotels;

    public Hotel(String avis, String contact, List<Hotel> hotels) {
        this.avis = avis;
        this.contact = contact;
        this.hotels = hotels;
    }

    public String getAvis() {
        return avis;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void addHotel(String avis, String contact, List<Hotel> hotels) {

    }

    public void add(Hotel hotels) {
    }
}













































