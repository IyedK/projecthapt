package com.horizon.hapt.models;

public class Formateur {
    private int experience;
    private Long id;

    public Formateur(int experience, Long id) {
        this.setExperience(experience);
        this.setId(id);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
