package com.backend.egg.entity;


import jakarta.persistence.*;

@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypeRole libelle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeRole getLibelle() {
        return libelle;
    }

    public void setLibelle(TypeRole libelle) {
        this.libelle = libelle;
    }
}
