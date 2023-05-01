package org.example.template.impl;

import org.example.template.Animal;

public class Gato extends Animal {

    private String nombre;
    private int edad;
    private String raza;

    public Gato() {
        super();
        this.nombre = "Gato";
        this.edad = 0;
        this.raza = "Raza";
    }
    public Gato(String nombre, int edad, String raza) {

        super();
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;

    }

    public void reproducirse() {
        System.out.println("El gato se ha apareado.");
    }

    public void envejecer() {
        System.out.println("El gato está envejeciendo.");
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + "]";
    }
}
