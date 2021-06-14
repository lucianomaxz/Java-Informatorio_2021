import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private float salario;

    public Empleado(){
    }

    public Empleado(String nombre, String apellido, String nacimiento, String salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.salario = Float.parseFloat(salario);
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String lastname) {
        this.apellido = lastname;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNacimiento(String birth) {
        this.nacimiento = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public int getEdad() {
        Period difference = Period.between(this.nacimiento, LocalDate.now());
        return difference.getYears();
    }


    public static List<Empleado> getPrimeraLetra(List<Empleado> empleados, String letra) {
        List<Empleado> empleadosList = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (letra.equalsIgnoreCase(String.valueOf(empleado.getApellido().charAt(0))))
                empleadosList.add(empleado);
        }

        return empleadosList;
    }

    public static Map<String, Empleado> getEmpleadosJoven(List<Empleado> empleados) {
        Map<String, Empleado> empleadosMap = new HashMap<>();
        empleados.sort(Comparator.comparing(Empleado::getEdad));

        empleadosMap.put("Empleado mas joven", empleados.get(0));
        empleadosMap.put("Empleado mas viejo", empleados.get(empleados.size() - 1));
        return empleadosMap;
    }


    public static Map<String, Empleado> getEmpleadosMejorPeorSalario(List<Empleado> empleados) {
        Map<String, Empleado> empleadosMap = new HashMap<>();
        empleados.sort(Comparator.comparing(Empleado::getSalario));

        empleadosMap.put("Peor", empleados.get(0));
        empleadosMap.put("Salario", empleados.get(empleados.size() - 1));
        return empleadosMap;
    }

    public static List<Empleado> ordenarApellido(List<Empleado> empleados) {
        empleados.sort(Comparator.comparing(Empleado::getNombre).thenComparing(Empleado::getApellido));
        return empleados;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + nombre + '\'' +
                ", lastname='" + apellido + '\'' +
                ", birth=" + nacimiento.toString() +
                ", salary=" + salario +
                '}';
    }
}
