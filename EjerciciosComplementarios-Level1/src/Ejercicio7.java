import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Character [] alfabeto= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Character [] alfabetoMin= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.println("Ingrese una palabra");
        Scanner s = new Scanner(System.in);
        String palabra = s.nextLine();
        Character prueba;

        for (int i = 0;i <palabra.length();i++) {
            prueba = palabra.charAt(i);
            for (Character j = 0; j < alfabetoMin.length;j++) {
                if (prueba == alfabetoMin[j]) {
                    System.out.print(alfabeto[j]);
                }
            }
        }

    }
}
