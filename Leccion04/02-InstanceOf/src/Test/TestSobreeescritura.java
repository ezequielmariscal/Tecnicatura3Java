package Test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreeescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        //determinarTipo(empleado1);

    }

    public static void determinarTipo(Empleado empleado){ // determinamos el tipo y el tiempo de ejecucion.
        if (empleado instanceof  Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado; // esta es otra variable q tmb podemos usar
            //((Gerente) empleado).getDepartamento();
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if (empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            //Gerente gerente = (Gerente) empleado;     // si pong oesto creca un error class exception
            //System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if (empleado instanceof Object){
            System.out.println("Es de tipo object");
        }

    }
}
