public class Empleado {
    String nombre;
    int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Empleado setEdad(int edad) {
        this.edad = edad;
        return this;
    }
}
