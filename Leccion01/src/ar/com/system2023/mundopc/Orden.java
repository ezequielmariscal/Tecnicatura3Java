package ar.com.system2023.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadora []; //Array de objetos
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private  int contadorComputadoras;

// Genero constructor vacio

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    // Metodo para agregar una nueva computadora al array

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadora[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("Has superado el limite: "+Orden.MAX_COMPUTADORAS);
        }
    }
    // Mostrar Orden
    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadoras de la orden #: "+this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadora[i]);
        }
    }
}
