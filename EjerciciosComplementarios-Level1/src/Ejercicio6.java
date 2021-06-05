import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Ingrese otro numero entero que sera el exponente");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        int result = 1;

        for (int i = 0; i < b;i++) {
            result = result * a;
        }
        System.out.println(a + " elevado a " + b + " es igual a: " + result);
    }
}
