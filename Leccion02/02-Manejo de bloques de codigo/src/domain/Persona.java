package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    static { // Bloque de inicialización estático
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas; // sube de a 1 numero
        // idPersona = 10; no es un atributo estatico, por eso nos marca un error
    }

    {
        // Bloque de inicializacion NO estatico (contexto dinamico)
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++; // incrementamos el atributo
    }

    // Los bloques de inicializacion se ejecuta antes del constructor


    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {

        return "Persona{" + "idPersona=" + idPersona + '}';

    }
}
