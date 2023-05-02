package org.example;

import org.example.builder.impl.AnimalBuilderDirector;
import org.example.builder.impl.PerroBuilder;
import org.example.template.Animal;

/*
    Materia de Enfasis: Patron de diseño Pontificia Universidad Javeriana de Bogota
    Ejemplo de uso de los patrones de diseño:

    Autores: Juan Esteban Urquijo y Alejandro Sacristan Leal
    En colaboracion con el patron template method
    En colaboracion con el patron builder

    Descripcion:

        El patron template method se usa para definir un esqueleto de un algoritmo en una operacion,
    postergando algunos pasos a las subclases. El patron template method permite que las subclases redefinan
    ciertos pasos de un algoritmo sin cambiar la estructura del mismo.

        El patron builder se usa para construir objetos complejos paso a paso. El patron builder permite

    El Ejemplo:

        Se crean animales de tipo Perro y Gato, los cuales tienen un estado del ciclo de vida diferente.
    Se puden usar poderes o habilidades.
    No cambia la estructura pero si el comportamieto.
    El patron Builder se usa para construir un animal de tipo perro o gato que pueden llegar a ser objetos complejos.
    Se usara el patron builder para construir un animal perro desde un patron template method

    RETO: Agregar Gato. El gato esta en una etapa de vida diferente al perro. El gato tiene 7 vidas.
    El gato tiene un poder de ataque diferente al perro. El gato tiene un poder de defensa diferente al perro.

 */


public class Main {

    public static void main(String[] args) {


        // Builder method
        AnimalBuilderDirector director = new AnimalBuilderDirector();
        Animal perro = director.construirPerro();

        // Template method
        perro.vivir();
        perro.descansar();

        // Prints
        perro.mostrar();
        perro.getCuerpo().mostrar();

    }

}
