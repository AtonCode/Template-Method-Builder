package org.example;

import org.example.builder.AnimalBuilder;
import org.example.builder.Builder;
import org.example.template.Animal;
import org.example.template.impl.Gato;
import org.example.template.impl.Perro;

/*
    Materia de Enfasis: Patron de diseño Pontificia Universidad Javeriana de Bogota
    Ejemplo de uso de los patrones de diseño:

    Autores: Juan Esteban Hurquijo Ortiz y Alejandro Sacristan Leal
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

    NOTA: Si desea quitar el patron builde solo debe intercambiar el contenido del main con los comentarios
    que dicen "MAIN Usando SOLO el template method para construir un estados de vida de un animal" : )

            La clase Animal es el themeplate method
            La clase builder es el AnimalBuilder

 */


public class Main {

    public static void main(String[] args) {

        //Builder de perro cachorro (nace y crece)
        Builder builder = new AnimalBuilder();
        builder.construirNombre("Eva");
        builder.construirEdad(1);
        builder.construirRaza("Rootweiller");
        ((AnimalBuilder) builder).construirPerroSaltador();

        // Builder + Template method
        //Usando el template method para construir un estados de vida de un animal y el builder para construir un animal
        Animal perro = builder.obtenerAnimal();
        System.out.println(perro.toString()); // Salida: Perro [nombre=Eva, edad=4, raza=Rootweiller]
        System.out.println(".................................................................");


        // Builder de Perron viejo (nace y envejece)
        builder.construirNombre("Tony");
        builder.construirEdad(7);
        builder.construirRaza("Labrador");
        ((AnimalBuilder) builder).construirPerroFallecido();

        // Builder + Template method
        Animal perroViejo = builder.obtenerAnimal();
        System.out.println(perroViejo.toString()); // Salida: Perro [nombre=Tony, edad=7, raza=Labrador]
        System.out.println(".................................................................");


        // ............................................................. ...
        // Usando el builder para construir un animal gato desde un patron template method
        // ............................................................. ...

    }

    /*
        // MAIN Usando SOLO el template method para construir un estados de vida de un animal


        Animal perro = new Perro();
        perro.vivir(); // Salida: Ha nacido un animal mamífero. El animal está creciendo. El perro se ha apareado. El perro está envejeciendo.

        Animal gato = new Gato();
        gato.vivir(); // Salida: Ha nacido un animal mamífero. El animal está creciendo. El gato se ha apareado. El gato está envejeciendo.

    */


}
