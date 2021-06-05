import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre;
        System.out.println("Ingrese su nombre");
        Scanner s = new Scanner(System.in);
        nombre = s.nextLine();
        System.out.println("Hola " + nombre);
    }
}
