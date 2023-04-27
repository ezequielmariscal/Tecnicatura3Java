package enumeraciones;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: "+Dias.LUNES); // son valores estaticos q podemos tratar en nuestro programa como una list
        indicarDiaSemana(Dias.LUNES); // Las enum se tratan como cadenas
        // Ahora no se deben utilizar las comillas, se accede a traves de el operador de punto
        // Agrego los default
        System.out.println("Dia 2: "+Dias.MARTES);
        indicarDiaSemana(Dias.MARTES);
        System.out.println("Dia 3: "+Dias.MIERCOLES);
        indicarDiaSemana(Dias.MIERCOLES);
        System.out.println("Dia 4: "+Dias.JUEVES);
        indicarDiaSemana(Dias.JUEVES);
        System.out.println("Dia 5: "+Dias.VIERNES);
        indicarDiaSemana(Dias.VIERNES);
        System.out.println("Dia 6: "+Dias.SABADO);
        indicarDiaSemana(Dias.SABADO);
        System.out.println("Dia 7: "+Dias.DOMINGO);
        indicarDiaSemana(Dias.DOMINGO);


    }

    private static void indicarDiaSemana(Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES: System.out.println("Segundo dia de la semana");
                break;
            //Agregar todos los dias de la semana
            case  MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES: System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO: System.out.println("Sesto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }
}
