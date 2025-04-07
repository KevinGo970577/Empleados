import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc1, opc2, opc3, edad, pagoHoras = 98000;
        double salarioFijo = 2100000, horasTrabajo;
        String nombre;
        boolean menu = false;
        List<Empleado> listaEmpleadoPlanta = new ArrayList<>();
        List<Empleado> listaEmpleadoHoras = new ArrayList<>();

        do {
            System.out.println("  FABRICA UNIMINUTO");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Ver Empleado");
            System.out.println("3. Salir");
            opc1 = teclado.nextInt();

            if (opc1 == 1) {
                System.out.println("Que tipo de empleado deseas agregar?");
                System.out.println("1. Empleado Planta");
                System.out.println("2. Empleado Por Horas");
                opc2 = teclado.nextInt();
                if (opc2 == 1) {
                    System.out.println("EMPLEADO PLANTA");
                    System.out.println("Ingrese el nombre del empleado");
                    nombre = teclado.next();
                    System.out.println("Ingrese la edad del empleado");
                    edad = teclado.nextInt();
                    listaEmpleadoPlanta.add(new EmpleadoPlanta(nombre, edad, salarioFijo));
                    menu = true;
                }
                if (opc2 == 2) {
                    System.out.println("EMPLEADO HORAS");
                    System.out.println("Ingrese el nombre del empleado");
                    nombre = teclado.next();
                    System.out.println("Ingrese la edad del empleado");
                    edad = teclado.nextInt();
                    System.out.println("Ingrese las horas trabajadas");
                    horasTrabajo = teclado.nextInt();
                    pagoHoras = (int) (pagoHoras * horasTrabajo);
                    listaEmpleadoHoras.add(new EmpleadoHoras(nombre, edad, pagoHoras, horasTrabajo));
                    menu = true;
                }
            }
            if (opc1 == 2) {
                System.out.println("Que tipo de empleado deseas ver?");
                System.out.println("1. Empleado Planta");
                System.out.println("2. Empleado por horas");
                opc3 = teclado.nextInt();
                if (opc3 == 1) {
                    System.out.println("EMPLEADO PLANTA");
                    System.out.println(listaEmpleadoPlanta);
                }
                if (opc3 == 2) {
                    System.out.println("EMPLEADO POR HORAS");

                    System.out.println(listaEmpleadoHoras);
                }
            }
            if (opc1 == 3) {
                break;
            }
        } while (menu);
    }
}