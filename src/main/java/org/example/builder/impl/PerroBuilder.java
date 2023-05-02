package org.example.builder.impl;

import org.example.builder.AnimalBuilder;
import org.example.builder.animalParts.Cuerpo;
import org.example.template.Animal;
import org.example.template.impl.Perro;

public class PerroBuilder extends AnimalBuilder {

    public PerroBuilder() {
        super();
    }

    @Override
    public void construirNombre(String nombre) {
        animal.setNombre(nombre);
    }

    @Override
    public void construirEdad(int edad) {
        animal.setEdad(edad);
    }

    @Override
    public void construirRaza(String raza) {
        animal.setRaza(raza);
    }

    @Override
    public Animal obtenerAnimal() {
        return animal.getAnimal();
    }


    public void construiCuerpo(String cabeza, String extremidades, String cola, String larga) {
        Cuerpo cuerpoPerro = new Cuerpo();
        cuerpoPerro.setCabeza(cabeza);
        cuerpoPerro.setExtremidades(extremidades);
        cuerpoPerro.setCola(cola);
        animal.setCuerpo(cuerpoPerro);
    }
}
