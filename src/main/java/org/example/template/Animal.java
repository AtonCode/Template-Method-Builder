package org.example.template;

public abstract class Animal {
    public void vivir() {
        nacer();
        crecer();
        reproducirse();
        envejecer();
    }

    public void nacer() {
        System.out.println("Ha nacido un animal mamífero.");
    }

    public void crecer() {
        System.out.println("El animal está creciendo.");
    }

    public abstract void reproducirse();

    public abstract void envejecer();

    public void morir() {
        System.out.println("El animal ha muerto.");
    }

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

    public void maullar() {
        System.out.println("El animal está maullando.");
    }

    public void ronronear() {
        System.out.println("El animal está ronroneando.");
    }

    public void morder() {
        System.out.println("El animal está mordiendo.");
    }

    public void rascar() {
        System.out.println("El animal está rascando.");
    }

    public void cazar() {
        System.out.println("El animal está cazando.");
    }
}