package com.backend.egg.entity;

public enum Type {
    PETIT("PETIT"),
    GRAND("GRAND");

    public final String contente;

    private Type(String contente) {
        this.contente = contente;
    }

    public String getContente() {
        return contente;
    }

}
