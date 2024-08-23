package com.LegrandVoyage;

public class Chambre {
    private String numero;
    private String tarif;

    public Chambre(String numero, String tarif) {
        this.numero = numero;
        this.tarif = tarif;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
}
