package com.backend.egg.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alveole")
public class Alveole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantite;
    private double prix_uni;
    private double prix_tt;
    @Enumerated(EnumType.STRING)
    private Type taille;
    @Temporal(TemporalType.DATE)
    private LocalDate wati;

    public Alveole() {
    }

    public Alveole(int quantite, double prix_uni, double prix_tt, Type taille, LocalDate wati) {
        this.quantite = quantite;
        this.prix_uni = prix_uni;
        this.prix_tt = prix_tt;
        this.taille = taille;
        this.wati = wati;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix_uni() {
        return prix_uni;
    }

    public void setPrix_uni(double prix_uni) {
        this.prix_uni = prix_uni;
    }

    public double getPrix_tt() {
        return prix_tt;
    }

    public void setPrix_tt(double prix_tt) {
        this.prix_tt = prix_tt;
    }

    public Type getTaille() {
        return taille;
    }

    public void setTaille(Type taille) {
        this.taille = taille;
    }

    public LocalDate getWati() {
        return wati;
    }

    public void setWati(LocalDate wati) {
        this.wati = wati;
    }
}
