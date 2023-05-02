package org.example.builder.animalParts;

public class Cuerpo {
    private String cabeza;
    private String tronco;
    private String extremidades;
    private String cola;

    public Cuerpo() {
        this.cabeza = "cabeza";
        this.tronco = "cuerpo";
        this.extremidades = "extremidades";
        this.cola = "cola";
    }


    public Cuerpo(String cabeza, String cuerpo, String extremidades, String cola) {
        this.cabeza = cabeza;
        this.tronco = cuerpo;
        this.extremidades = extremidades;
        this.cola = cola;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;

    }

    public String getTronco() {
        return tronco;
    }

    public void setTronco(String tronco) {
        this.tronco = tronco;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public void mostrar() {
        System.out.println("Su cuerpo:" +
                "\n 1. Cabeza: "+ this.cabeza +
                "\n 2. Torzo: " + this.tronco +
                "\n 3. Extremidades: " + this.extremidades +
                "\n 4. Cola: " + this.cola );

    }

}

