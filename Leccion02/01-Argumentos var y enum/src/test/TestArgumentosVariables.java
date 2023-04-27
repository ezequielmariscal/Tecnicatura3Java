package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", "Perez",7, 8, 9);
    }
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        imprimirNumeros(numeros);
    }

    public static void imprimirNumeros(int ...numeros){ // se convierte en un array de tipo entero, la cant de elementos es indefinida los ... significa q recibe  varios argumentos variables
        for (int i= 0; i < numeros.length; i++){
            System.out.println("Elementos: "+numeros[i]);
        }

    }
}
