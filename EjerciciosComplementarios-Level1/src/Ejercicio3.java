import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i = 1;i<=num;i++) {
            for (int j = 1;j <= i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
