package com.backend.egg.entity;

import java.time.LocalDate;

public record AlveoleParams(int nombre, double prix, LocalDate date, Type taille) {
}
