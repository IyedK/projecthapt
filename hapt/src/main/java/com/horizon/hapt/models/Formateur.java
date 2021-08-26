package com.horizon.hapt.models;

public class Formateur {
    private String nom;
    private String prenom;
    private String adresse;
    private int cin;
    private int tel;
    private String specialite;
    
    public Formateur(String nom, String prenom, String adresse, int cin, int tel, String specialite) {
        this.nom = nom;
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.setCin(cin);
        this.setTel(tel);
        this.setSpecialite(specialite);
    }
    
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
}
