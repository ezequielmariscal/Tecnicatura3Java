package domain;

public class Gerente extends Empleado{

    private String departamento;


    public Gerente(String nombre, double sueldo,String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle()+", Departamento: "+this.departamento;
        //lo agrego para saber que proviene del metodo padre lo SOBREESCRIBE
        // LO ESTA MODIFICANDO
    }
}
