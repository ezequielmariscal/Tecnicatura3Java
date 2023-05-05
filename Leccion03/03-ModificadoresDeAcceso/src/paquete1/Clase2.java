package paquete1;


class Clase2 extends Clase1 { //tiene ausencia del public hace que sea una clase default
    String atributoDefault = "Valor del atributo default";

    public Clase2() {
       super();
       this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributo Default = " + this.atributoDefault);
        this.metodoDefault();
    }

    void metodoDefault(){
        System.out.println("Metodo Default");
    }
    // solo se puede imprimir en el mismo default asiq creamos un test main aca.
}
