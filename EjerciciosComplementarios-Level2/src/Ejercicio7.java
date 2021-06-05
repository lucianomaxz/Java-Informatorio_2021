import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        Fizz(1,6);
        for (var a :Fizz(1,6)
             ) {
            System.out.println(a);
        }
    }
    public static ArrayList<String> Fizz (int a, int b) {

        ArrayList <String> fizzBuzz= new ArrayList<>();

        if (a < b) {
            for (int i = 1;i <= b;i++) {
                if (i % 2 == 0 && i % 3 == 0 ) {
                    fizzBuzz.add("FizzBuzz");
                }
                else if (i % 2 == 0) {
                    fizzBuzz.add("Fizz");
                }
                else if (i % 3 == 0) {
                    fizzBuzz.add("Buzz");
                }
                else {
                    fizzBuzz.add(String.valueOf(i));
                }
            }
        } else {
            System.out.println("el primer numero q ingrese debe ser menor al segundo");
        }
        return fizzBuzz;
    }
}
