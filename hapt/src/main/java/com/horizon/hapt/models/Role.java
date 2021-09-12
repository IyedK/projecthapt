package com.horizon.hapt.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(schema = "haptdb", uniqueConstraints = @UniqueConstraint(columnNames = "nom"))
public class Role implements Serializable {
    private static final long serialVersionUID = 1l;
    @Column
    private Long id;
    @Column
    private String nom;

    public Role(long id, String nom, Long serialVersionUID) {
        this.setId(id);
        this.setNom(nom);

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }
}
