package com.horizon.hapt.models;

public class Entreprise {
    private String raison;
    private String matriculeFiscale;
    private String rc;
    private Long id;

    public Entreprise(String raison, String matriculeFiscale, String rc, Long id) {
        this.setRaison(raison);
        this.setMatriculeFiscale(matriculeFiscale);
        this.setRc(rc);
        this.setId(id);
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getMatriculeFiscale() {
        return matriculeFiscale;
    }

    public void setMatriculeFiscale(String matriculeFiscale) {
        this.matriculeFiscale = matriculeFiscale;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
