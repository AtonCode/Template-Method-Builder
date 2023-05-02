package org.example.template;

import org.example.builder.animalParts.Cuerpo;

public abstract class Animal {

    private String nombre;
    private int edad;
    private String raza;


    public Animal() {
        this.nombre = "Animal";
        this.edad = 0;
        this.raza = "Raza";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public Animal getAnimal() {
        return this;
    }





    public void vivir() {
        nacer();
        crecer();
        reproducirse();
        envejecer();
    }

    public void morir() {
        morir();
    }

    public void moverse() {
        saltar();
        correr();
    }

    public void descansar() {
        dormir();
    }

    public void alimentarse() {
        comer();
    }

    public void emitirSonido() {
        ladrar();
    }





    public void nacer() {
        System.out.println("Ha nacido un animal mamífero.");
    }
    public void crecer() {
        System.out.println("El animal está creciendo.");
    }
    public abstract void reproducirse();
    public abstract void envejecer();



    public void saltar() {
        System.out.println("El animal está saltando.");
    }
    public void correr() {
        System.out.println("El animal está corriendo.");
    }
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
    public void comer() {
        System.out.println("El animal está comiendo.");
    }
    public void ladrar() {
        System.out.println("El animal está ladrando.");
    }

    public void mostrar() {
        System.out.println("El animal es un "+this.getClass()+" se llama " + this.nombre + ", tiene " + this.edad + " años y es de raza " + this.raza + ".");


    }

    public abstract Cuerpo getCuerpo();

    public abstract void setCuerpo(Cuerpo cuerpoPerro);
}