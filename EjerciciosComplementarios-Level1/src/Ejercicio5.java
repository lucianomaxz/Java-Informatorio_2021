import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Ingrese otro numero entero");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        int result = 0;
        for (int i = 0; i < b;i++) {
            result = result + a;
        }
        System.out.println("Resultado " + result);
    }
}
