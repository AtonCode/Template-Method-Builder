
# Manual de Usuario

## Introducción

El presente documento tiene como objetivo explicar el funcionamiento
del programa desarrollado para la asignatura de **Enfasis en Patrones de Diseño**.

## Descripción del programa

El programa desarrollado es un ejemplo de la implementación del patrón
de diseño **Template Method**. El programa consiste en la creación de un
Animal, el cual puede ser un perro o un gato. El animal tiene un es el template
que define el comportamiento de los animales, y las clases perro y gato son
las que implementan el template.

Perro y gato tienen un comportamiento diferente, pero ambos tienen un **Patron Builder** que
permite crearlos de manera sencilla si el objeto a crear se convierte en complejo.


## Requerimientos
 - Java 11
 - Maven 3.6.3

## Ejecución
Para ejecutar el programa se debe ejecutar el siguiente comando en la
carpeta raíz del proyecto:

1. Comando Linux y macOS:
    ```
        mvn clean package && java -jar target/Template-Method-Builder-1.0-SNAPSHOT.jar
    ```

