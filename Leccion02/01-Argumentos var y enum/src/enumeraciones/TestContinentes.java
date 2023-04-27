package enumeraciones;

public class TestContinentes {
    public static void main(String[] args) {
        System.out.println("Continentes N° 1: "+Continentes.AFRICA);
        System.out.println("N° de paises en el 1er. continente: "+Continentes.AFRICA.getHabitantes());
        System.out.println("Continentes N° 2: "+Continentes.EUROPA);
        System.out.println("N° de paises en el 2do. continente: "+Continentes.EUROPA.getHabitantes());
        System.out.println("Continentes N° 3: "+Continentes.ASIA);
        System.out.println("N° de paises en el 3ro. continente: "+Continentes.ASIA.getHabitantes());
        System.out.println("Continentes N° 4: "+Continentes.AMERICA);
        System.out.println("N° de paises en el 4to. continente: "+Continentes.AMERICA.getHabitantes());
        System.out.println("Continentes N° 5: "+Continentes.OCEANIA);
        System.out.println("N° de paises en el 5to. continente: "+Continentes.OCEANIA.getHabitantes());
    }
}
