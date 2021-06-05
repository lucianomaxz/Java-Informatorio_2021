import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList ciudades = new ArrayList();
        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");

        for (var ciudad:ciudades
             ) {
            System.out.println("#1 - " + ciudad);
        }

    }
}
