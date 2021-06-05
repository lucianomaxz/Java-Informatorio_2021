import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Ingrese Nombre y Apellido");
        Scanner s = new Scanner(System.in);
        String nomyap = s.nextLine();

        System.out.println("Ingrese Edad");
        Scanner s2 = new Scanner(System.in);
        int edad = s2.nextInt();

        System.out.println("Ingrese su direccion");
        Scanner s3 = new Scanner(System.in);
        String direcc = s3.nextLine();

        System.out.println("Ingrese su ciudad");
        Scanner s4 = new Scanner(System.in);
        String ciudad = s4.nextLine();

        System.out.println(ciudad + " - " + direcc + " - " + edad + " - " + nomyap);

    }
}
