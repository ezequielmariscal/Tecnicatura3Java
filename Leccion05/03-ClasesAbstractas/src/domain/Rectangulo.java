package domain;

public class Rectangulo extends FiguraGeometrica{

    // Constructor

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    //Implementando el metodo

    @Override
    public void dibujar() {
        System.out.println("Se imprime un: "+this.getClass().getSimpleName());
    }
}
