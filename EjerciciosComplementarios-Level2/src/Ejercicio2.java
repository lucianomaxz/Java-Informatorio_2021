import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList numeros = new ArrayList();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        System.out.println("Tamaño del array antes de añadir al principio y al final: " + numeros.stream().count());

        for (var num:numeros
             ) {
            System.out.println(num);
        }

        numeros.add(0,1);
        numeros.add(7);
        System.out.println("Tamaño del array despues de añadir al principio y al final: " + numeros.stream().count());

        for (var num:numeros
        ) {
            System.out.println(num);
        }
    }
}
