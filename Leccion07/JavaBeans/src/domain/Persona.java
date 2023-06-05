package domain;

import java.io.Serializable;

public class Persona implements Serializable { 
    private String nombre;
    private String apelllido;

    // Constructor vacio: es obligatorio para que se sea un javaBeans
    public Persona(){

    }

    public Persona(String nombre, String apelllido) {
        this.nombre = nombre;
        this.apelllido = apelllido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", apelllido='" + apelllido + '\'' + '}';
    }
}
