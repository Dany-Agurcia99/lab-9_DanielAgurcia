package lab9;

import java.awt.Color;
import java.util.ArrayList;

public class Autobus {

    private String identificacion;
    private String placa;
    private String colo;
    private double velocidad;
    ArrayList<Estudiante> lista_estudiantes = new ArrayList();

    public Autobus() {
    }

    public Autobus(String identificacion, String placa, String colo, double velocidad) {
        this.identificacion = identificacion;
        this.placa = placa;
        this.colo = colo;
        this.velocidad = velocidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColo() {
        return colo;
    }

    public void setColo(String colo) {
        this.colo = colo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Estudiante> getLista_estudiantes() {
        return lista_estudiantes;
    }

    public void setLista_estudiantes(ArrayList<Estudiante> lista_estudiantes) {
        this.lista_estudiantes = lista_estudiantes;
    }

    @Override
    public String toString() {
        return identificacion;
    }

}
