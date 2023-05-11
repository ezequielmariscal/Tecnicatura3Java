package domain;

public class Empleado {

    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // method para la SOBREESCRITURA
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+", Sueldo: "+ this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }
}
