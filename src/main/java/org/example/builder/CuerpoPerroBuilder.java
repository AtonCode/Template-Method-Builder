package org.example.builder;

import org.example.template.Animal;

public class CuerpoPerroBuilder implements Builder {
    private CuerpoPerro cuerpo;

    public CuerpoPerroBuilder() {
        this.cuerpo = new CuerpoPerro();
    }

    public void construirCabeza(String cabeza) {
        this.cuerpo.setCabeza(cabeza);
    }

    public void construirCuerpo(String cuerpo) {
        this.cuerpo.setCuerpo(cuerpo);
    }

    public void construirExtremidades(String extremidades) {
        this.cuerpo.setExtremidades(extremidades);
    }

    public void construirCola(String cola) {
        this.cuerpo.setCola(cola);
    }

    public CuerpoPerro obtenerCuerpoPerro() {
        return this.cuerpo;
    }

    @Override
    public void construirNombre(String nombre) {

    }

    @Override
    public void construirEdad(int edad) {

    }

    @Override
    public void construirRaza(String raza) {

    }

    @Override
    public Animal obtenerAnimal() {
        return null;
    }
}

