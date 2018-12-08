package lab9;

public class Estudiante {

    private String nombre;
    private int edad;
    private int numero_cuenta;
    private Parada parada;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int numero_cuenta, Parada parada) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero_cuenta = numero_cuenta;
        this.parada = parada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    @Override
    public String toString() {
        return "Estudiante: "+ nombre + "  parada: " + parada;
    }
    
}
