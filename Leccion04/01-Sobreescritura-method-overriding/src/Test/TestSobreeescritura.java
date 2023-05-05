package Test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreeescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",10000);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalle());
        imprimir(empleado1);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        imprimir(empleado1);
        //System.out.println("gerente1 = " + gerente1.obtenerDetalle());

    }

    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalle(); // ayuda a obtener el punto de ruptura
        System.out.println("detalles = "+ detalles); // hace que se ejecute por variable
        // hay una relacion clase padre y hija entonces como adquiere sus atributos no hace faltar poner Gerente gerente
        //esta llamando al metodo sobreescrito
    }
}
