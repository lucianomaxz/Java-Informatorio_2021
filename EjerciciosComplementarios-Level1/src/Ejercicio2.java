import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Ingrese otro numero entero");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        System.out.println("Suma: " + a + "+" + b + " = " + (a + b));
        System.out.println("Resta: " + a + "-" + b + " = " + (a - b));
        System.out.println("Multiplicacion: " + a + "*" + b + " = " + (a * b));
        System.out.println("Division: " + a + "/" + b + " = " + (a / b));

    }
}
