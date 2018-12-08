package lab9;

public class Parada {
    
    private String nombre;
    private double distancia;
    private double angulo;
    private double coordX;
    private double coordY;
    
    public Parada() {
    }
    
    public Parada(String nombre, double distancia, double angulo) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.angulo = angulo;
        this.coordX = distancia * Math.cos(angulo);
        this.coordY = distancia * Math.sin(angulo);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getDistancia() {
        return distancia;
    }
    
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public double getAngulo() {
        return angulo;
    }
    
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    
    public double getCoordX() {
        return coordX;
    }
    
    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }
    
    public double getCoordY() {
        return coordY;
    }
    
    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
