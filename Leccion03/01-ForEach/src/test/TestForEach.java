package test;

/*foreach es una estructura de control de flujo en Java que se utiliza para recorrer
los elementos de un arreglo o de una colección de elementos de manera más sencilla y
concisa que con otras estructuras de control de flujo como for o while.
 */

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9}; //Sintaxis resumida
        for (int edad: edades) { //Sintaxis del ForEach
            System.out.println("edad = " + edad);
        }
        Persona personas[] = {new Persona("Palpatine"), new Persona("Darth Vader"), new Persona("Moff Tarkin")};

        //ForEach
        for (Persona persona: personas) {
            System.out.println("Persona = " + persona);
        }
    }
}
