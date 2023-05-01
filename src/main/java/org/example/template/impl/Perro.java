package org.example.template.impl;

import org.example.builder.CuerpoPerro;
import org.example.template.Animal;

public class Perro extends Animal {

    private String nombre;
    private int edad;
    private String raza;

    private CuerpoPerro cuerpo;

    public Perro() {
        super();
        this.nombre = "Perro";
        this.edad = 0;
        this.raza = "Raza";
        this.cuerpo = new CuerpoPerro();
    }

    public Perro(String nombre, int edad, String raza, CuerpoPerro cuerpo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.cuerpo = cuerpo;
    }

    @Override
    public void nacer() {
        super.nacer();

    }

    public void reproducirse() {
        System.out.println("El perro se ha apareado.");
    }

    public void envejecer() {
        System.out.println("El perro está envejeciendo.");
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", edad=" + edad + ", raza=" + raza +
                ", cuerpo= Cabeza: " + cuerpo.getCabeza() + ", Cuerpo: " +
                cuerpo.getCuerpo() + ", Extremidades: " + cuerpo.getExtremidades() + ", Cola: " + cuerpo.getCola() + "]";
    }
}

