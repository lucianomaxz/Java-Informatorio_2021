import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList estudiantes = new ArrayList();
        estudiantes.add("luciano");
        estudiantes.add("lucas");
        estudiantes.add("lucio");
        estudiantes.add("mariano");
        estudiantes.add("miriam");
        estudiantes.add("marcelo");
        estudiantes.add("ema");
        estudiantes.add("emo");
        estudiantes.add("emi");
        estudiantes.add("el");
        estudiantes.add("kun");
        estudiantes.add("aguero");

        ArrayList grupo1 = new ArrayList();
        grupo1.add(estudiantes.subList(0,3));

        ArrayList grupo2 = new ArrayList();
        grupo2.add(estudiantes.subList(3,6));

        ArrayList grupo3 = new ArrayList();
        grupo3.add(estudiantes.subList(6,9));

        ArrayList grupo4 = new ArrayList();
        grupo4.add(estudiantes.subList(9,12));

        System.out.println("GRUPO1");
        for (var g:grupo1
             ) {
            System.out.println(g);
        }
        System.out.println("GRUPO2");
        for (var g:grupo2
        ) {
            System.out.println(g);
        }
        System.out.println("GRUPO3");
        for (var g:grupo3
        ) {
            System.out.println(g);
        }
        System.out.println("GRUPO4");
        for (var g:grupo4
        ) {
            System.out.println(g);
        }



    }
}
