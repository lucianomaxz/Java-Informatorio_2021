import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorHora = new ArrayList<>();

        List<Integer> totales = new ArrayList<>();

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);

        int cont = 0,cont2 = -1,totalFinal = 0;

        for (var hora:horasTrabajadas
             ) {
            for (var valor:valorHora
                 ) {
                cont2++;
                if (cont == cont2) {
                    var total = (int)hora * (int)valor;
                    totales.add(total);
                }
            }
            cont2 = -1;
            cont++;
        }

        for (var v:totales
             ) {
            totalFinal += (int) v;
            System.out.println(v);
        }

        System.out.println("Total final " + totalFinal);
    }
}
