package com.horizon.hapt.models;

public class Etudiant {
    private Long id;
    private int contactF;

    public Etudiant(String mail, int contactF, Long id) {
        this.contactF = contactF;
        this.setId(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getContactF() {
        return contactF;
    }

    public void setContactF(int contactF) {
        this.contactF = contactF;
    }

}
