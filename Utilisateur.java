package com.LegrandVoyage;


import java.util.List;

public class Utilisateur {
    private String nom;
    private  String email;

    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void addReview (String avis,String contact, String list) {

        Hotel hotels= new Hotel(avis, contact, list);
        hotels.add(hotels);
        System.out.println("hotel ajoutée : " + hotels);
    }


}
