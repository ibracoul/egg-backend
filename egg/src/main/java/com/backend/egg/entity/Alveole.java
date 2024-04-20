package com.backend.egg.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alveole")
public class Alveole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nombre;
    private double prix;
    @Temporal(TemporalType.DATE)
    private LocalDate dateSortie;
    @Enumerated(EnumType.STRING)
    private Type taille;


    public Alveole() {
    }


    public Alveole(int nombre, double prix, LocalDate dateSortie, Type taille) {
        this.nombre = nombre;
        this.prix = prix;
        this.taille = taille;
        this.dateSortie = dateSortie;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Type getTaille() {
        return taille;
    }

    public void setTaille(Type taille) {
        this.taille = taille;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }
}
