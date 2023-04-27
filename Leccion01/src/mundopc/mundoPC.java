package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {

        Monitor monitorHP = new Monitor("HP",13); //importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("HP", monitorHP,tecladoHP,ratonHP);

        //Creamos otros objetos de diferente marca

        Monitor monitorGamer = new Monitor("Gamer",32); //importar la clase
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton ratonHPGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Gamer", monitorGamer,tecladoGamer,ratonHPGamer);

        Orden orden1 = new Orden(); // Inizilizamos arreglo vacio
        Orden orden2 = new Orden(); // una nueva lista para el objeto orden2

        orden1.agregarComputadora(computadoraHP) ;
        orden1.agregarComputadora(computadoraGamer);

        Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas", monitorHP,tecladoGamer,ratonHP);
        orden2.agregarComputadora(computadorasVarias);

        orden1.mostrarOrden();
        orden2.mostrarOrden();

        // Crear mas objetos de tipo computadora con todos sus elementos
        // Completar una lista en el objeto que llegue a los 10 elementos
        // Probar de esta manera los métodos al maximo





    }
}
