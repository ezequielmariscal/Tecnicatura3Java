package test;

import accesodatos.*;

public class TestInterface {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        datos.listar();
    }
}
