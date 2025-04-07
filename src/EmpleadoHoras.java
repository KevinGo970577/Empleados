public class EmpleadoHoras extends Empleado{
    int pagoHoras;
    double horasTrabajo;

    public EmpleadoHoras(String nombre, int edad, int pagoHoras, double horasTrabajo) {
        super(nombre, edad);
        this.pagoHoras = pagoHoras;
        this.horasTrabajo = horasTrabajo;
    }

}
