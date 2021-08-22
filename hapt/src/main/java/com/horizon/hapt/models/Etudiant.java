package com.horizon.hapt.models;

import java.util.Date;

public class Etudiant {
    private String nom;
    private String prenom;
    private String adresse;
    private int cin;
    private int tel;
    private String niveau;
    private Date dateN;

    public Etudiant(String nom, String prenom, String adresse, int cin, int tel, String niveau, Date dateN) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cin = cin;
        this.tel = tel;
        this.niveau = niveau;
        this.dateN = dateN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Date getDateN() {
        return dateN;
    }

    public void setNiveau(Date dateN) {
        this.dateN = dateN;
    }

}
