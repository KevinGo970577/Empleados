public class EmpleadoPlanta extends Empleado{
    double salarioFijo;

    public EmpleadoPlanta(String nombre, int edad, double salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }
}
