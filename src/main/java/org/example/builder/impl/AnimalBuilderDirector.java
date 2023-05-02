package org.example.builder.impl;

import org.example.builder.AnimalBuilder;
import org.example.template.Animal;

public class AnimalBuilderDirector  {

    private PerroBuilder perroBuilder;


    public Animal construirPerro() {
        this.perroBuilder = new PerroBuilder();
        perroBuilder.crearAnimal();
        perroBuilder.construirNombre("Perro");
        perroBuilder.construirEdad(5);
        perroBuilder.construirRaza("Pastor Aleman");
        perroBuilder.construiCuerpo("Tringular", "4", "Larga", "Larga");

        return perroBuilder.getAnimal();
    }
}