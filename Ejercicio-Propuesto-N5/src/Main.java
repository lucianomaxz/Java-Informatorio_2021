import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleadoList = loadEmpleados();

        System.out.println("Empleados con una letra especifica en el apellido.");
        for (Empleado e: Empleado.getPrimeraLetra(empleadoList, "S")) {
            System.out.println(e);
        }

        System.out.println("\nEmpleado más viejo y empleado más joven.");
        Map<String, Empleado> oldYoungMap = Empleado.getEmpleadosJoven(empleadoList);
        oldYoungMap.forEach((k,v) -> System.out.println(k +
                ":\nEmpleado: " + v.getNombre() + " " + v.getApellido() +
                " - Edad: " + v.getEdad()));

        System.out.println("\nEmpleado con mejor y peor salario.");
        Map<String, Empleado> bestPoorSalariesMap = Empleado.getEmpleadosMejorPeorSalario(empleadoList);
        bestPoorSalariesMap.forEach((k,v) -> System.out.println(k +
                ":\nEmpleado: " + v.getNombre() + " " + v.getApellido() +
                " - Salario: " + v.getSalario()));

        System.out.println("\nLista de empleados ordenados alfabeticamente por nombre y apellido.)");
        for (Empleado e: Empleado.ordenarApellido(empleadoList)) {
            System.out.println(e);
        }
    }

    public static List<Empleado> loadEmpleados() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String[] empleado;
        List<Empleado> empleadoList = new ArrayList<>();

        try {
            file = new File("C:\\Users\\Luciano\\IdeaProjects\\Ejercicio-Propuesto-N5\\src\\Empleados.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                empleado = line.split(",");
                empleadoList.add(new Empleado(empleado[0], empleado[1], empleado[2], empleado[3]));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileReader)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return empleadoList;
    }
}
