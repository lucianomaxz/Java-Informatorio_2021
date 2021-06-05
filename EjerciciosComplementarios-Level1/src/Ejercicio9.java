import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner s = new Scanner(System.in);
        String frase = s.nextLine();

        System.out.println("Ingrese la letra que quiere saber la cantidad de veces que se repite");
        Scanner s2 = new Scanner(System.in);
        String letra = s2.nextLine();

        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (letra.charAt(0) == frase.charAt(i)){
                cont++;
            }
        }

        System.out.println("Se repite " + cont);

    }
}
