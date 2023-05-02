package org.example.builder;

import org.example.builder.animalParts.Cuerpo;
import org.example.template.Animal;

public abstract class AnimalBuilder implements Builder {
    protected Animal animal;

    public AnimalBuilder(){

        this.animal = new Animal() {
              @Override
                public void reproducirse() {
                    System.out.println("El animal está reproduciéndose.");
                }

                @Override
                public void envejecer() {
                    System.out.println("El animal está envejeciendo.");
                }

            @Override
            public Cuerpo getCuerpo() {
                  return new Cuerpo();
            }

            @Override
            public void setCuerpo(Cuerpo cuerpoPerro) {
                System.out.println("El animal tiene un cuerpo.");
            }
        };
    }

    public void crearAnimal() {
        // Build the animal
        animal = new Animal() {
            @Override
            public void reproducirse() {
                System.out.println("El animal está reproduciéndose.");
            }

            @Override
            public void envejecer() {
                System.out.println("El animal está envejeciendo.");
            }

            @Override
            public Cuerpo getCuerpo() {
                return new Cuerpo();
            }

            @Override
            public void setCuerpo(Cuerpo cuerpoPerro) {
                System.out.println("El animal tiene un cuerpo.");
            }

        };
    }

    public  void construirNombre(String nombre){
        animal.setNombre(nombre);
    }

    public  void construirEdad(int edad){
        animal.setEdad(edad);
    }

    public  void construirRaza(String raza){
        animal.setRaza(raza);
    }

    public Animal getAnimal() {
        return animal;
    }
}
