package org.example.builder;

public class CuerpoPerro {
    private String cabeza;
    private String cuerpo;
    private String extremidades;
    private String cola;

    public CuerpoPerro() {
        this.cabeza = "cabeza";
        this.cuerpo = "cuerpo";
        this.extremidades = "extremidades";
        this.cola = "cola";
    }


    public CuerpoPerro(String cabeza, String cuerpo, String extremidades, String cola) {
        this.cabeza = cabeza;
        this.cuerpo = cuerpo;
        this.extremidades = extremidades;
        this.cola = cola;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getCabeza() {
        return cabeza;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public String getCola() {
        return cola;
    }

}

