package org.example.builder;


import org.example.template.Animal;

public interface Builder {
    public void construirNombre(String nombre);
    public void construirEdad(int edad);
    public void construirRaza(String raza);
    public Animal obtenerAnimal();
}
