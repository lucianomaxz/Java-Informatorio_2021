import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja = new ArrayList<Integer>();
        baraja.add(1);
        baraja.add(2);
        baraja.add(3);
        baraja.add(4);
        baraja.add(5);
        baraja.add(6);
        baraja.add(7);
        baraja.add(8);
        baraja.add(9);
        baraja.add(10);

        System.out.println("EN ORDEN");

        for (var b:baraja
             ) {
            System.out.println(b);
        }

        System.out.println("ORDEN INVERSO");

        Collections.reverse(baraja);

        for (var b:baraja
        ) {
            System.out.println(b);
        }
        System.out.println("ORDEN ALEATORIO");


        Collections.shuffle(baraja);

        for (var b:baraja
        ) {
            System.out.println(b);
        }
    }
}
