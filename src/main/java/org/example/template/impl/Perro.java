package org.example.template.impl;

import org.example.template.Animal;
import org.example.builder.animalParts.Cuerpo;

public class Perro extends Animal {

    private Cuerpo cuerpo;

    public Perro() {
        super();
        super.setNombre("Perro");
        super.setEdad(0);
        super.setRaza("Raza");
        this.cuerpo = new Cuerpo("Cabeza", "Cuerpo", "Extremidades", "Cola");
    }

    public Perro(String nombre, int edad, String raza, Cuerpo cuerpo) {
        super();
        super.setNombre("Perro");
        super.setEdad(0);
        super.setRaza("Raza");
        this.cuerpo = cuerpo;
    }

    @Override
    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

   @Override
   public Cuerpo getCuerpo() {
        return this.cuerpo;
    }

    @Override
    public void nacer() {
        super.nacer();
        System.out.println("El perro ha nacido.");

    }

    public void reproducirse() {
        System.out.println("El perro se ha apareado.");
    }

    public void envejecer() {
        System.out.println("El perro está envejeciendo.");
    }

    public void mostrar() {
        System.out.println("Animal: " + this.getClass());
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Raza: " + super.getRaza());
        System.out.println("Cuerpo: " + this.cuerpo.getCabeza()
            + ", " + this.cuerpo.getExtremidades()
            + ", " + this.cuerpo.getCola());
    }
}

