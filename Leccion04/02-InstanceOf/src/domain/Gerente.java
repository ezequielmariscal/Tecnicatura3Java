package domain;

public class Gerente extends Empleado{

    private String departamento;


    public Gerente(String nombre, double sueldo,String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    // Sobreescribimos el metodo

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle()+", Departamento: "+this.departamento;
        //lo agrego para saber que proviene del metodo padre lo SOBREESCRIBE
        // LO ESTA MODIFICANDO
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
