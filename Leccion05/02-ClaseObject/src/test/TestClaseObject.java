package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if (empleado1 == empleado2) { // Como ver si son los empleados iguales?
            System.out.println("Tienen las misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }

        // Como hacemos para preguntar sobre el contenido ?? si son iguales o no ...

        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashCode es igual");
        } else {
            System.out.println("El valor hashCode es diferente");
        }
    }
}
