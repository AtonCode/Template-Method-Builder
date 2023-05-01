package org.example.builder;


import org.example.template.Animal;
import org.example.template.impl.Gato;
import org.example.template.impl.Perro;

public class AnimalBuilder implements Builder {
    private String nombre;
    private int edad;
    private String raza;
    private Animal animal;

    public void construirNombre(String nombre) {
        this.nombre = nombre;
    }

    public void construirEdad(int edad) {
        this.edad = edad;
    }

    public void construirRaza(String raza) {
        this.raza = raza;
    }

    public Animal obtenerAnimal() {
        return animal;
    }


    public void construirPerroSaltador() {
        this.animal = new Perro(nombre, edad, raza, new CuerpoPerro("Cobra", "Jaguar", "Negras y Rojo", "Larga"));
        this.animal.nacer();
        this.animal.ladrar();
        this.animal.correr();
        this.animal.saltar();


    }
    public void construirPerroFallecido() {
        this.animal = new Perro(nombre, edad, raza, new CuerpoPerro("Elefante", "Mico", "Cuadrupedo", "Larga"));
        this.animal.vivir();
        this.animal.dormir();

    }

    public void construirGato() {
        this.animal = new Gato(nombre, edad, raza);
    }


}

