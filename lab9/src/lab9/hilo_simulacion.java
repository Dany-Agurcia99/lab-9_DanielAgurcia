package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class hilo_simulacion extends Thread {

    private JProgressBar barra;
    private JLabel tiempo_label;
    private JLabel parada;
    private JTable tablal;
    private boolean avance;
    private boolean vive;
    private Autobus bus;

    public hilo_simulacion() {
    }

    public hilo_simulacion(JProgressBar barra, JLabel tiempo_label, JLabel parada, JTable tablal, boolean avance, boolean vive, Autobus bus) {
        this.barra = barra;
        this.tiempo_label = tiempo_label;
        this.parada = parada;
        this.tablal = tablal;
        this.avance = avance;
        this.vive = vive;
        this.bus = bus;
    }

    public boolean isAvance() {
        return avance;
    }

    public void setAvance(boolean avance) {
        this.avance = avance;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    ArrayList<Parada> lista_Paradas = new ArrayList();

    @Override
    public void run() {
        lista_Paradas = ordenar_paradas(bus);
        int tiempo;
        int distancia;
        Parada P_Siguiente;
        Parada P_Anterior;
        int sub = 0;
        int time = 0;
        while (vive) {
            if (avance) {
                System.out.println(sub);
                if (sub < lista_Paradas.size()) {
                    if (sub == 0) {
                        P_Siguiente = lista_Paradas.get(sub);
                        P_Anterior = null;
                        parada.setText(P_Siguiente.getNombre());
                        tiempo_label.setText(String.valueOf(time) + " minutos");
                        distancia = (int) Math.sqrt(Math.pow((P_Siguiente.getCoordX() - 0), 2) + Math.pow((P_Siguiente.getCoordY() - 0), sub));
                        tiempo = (int) (distancia / bus.getVelocidad()) * 60;
                        barra.setMaximum(tiempo);
                        System.out.println(barra.getMaximum());
                        barra.setValue(barra.getValue() + 1);
                        System.out.println(barra.getValue());
                        time++;
                        if (barra.getValue() == barra.getMaximum()) {
                            for (int i = 0; i < bus.getLista_estudiantes().size(); i++) {
                                if (bus.getLista_estudiantes().get(i).getParada().getNombre().equals(parada.getText())) {
                                    System.out.println("se bajo " + bus.getLista_estudiantes().get(i).getNombre());
                                    DefaultTableModel modelo = (DefaultTableModel) tablal.getModel();
                                    Object[] row = {parada.getText(), tiempo, bus.getLista_estudiantes().get(i).getNombre()};
                                    modelo.addRow(row);
                                    tablal.setModel(modelo);
                                }
                            }
                            System.out.println(P_Siguiente.getNombre());
                            sub++;
                            barra.setValue(0);
                            JOptionPane.showMessageDialog(null, "Parada " + P_Siguiente.getNombre() + " Recorrida");
                            time = 0;
                        }
                    } else {
                        P_Siguiente = lista_Paradas.get(sub);
                        P_Anterior = lista_Paradas.get(sub - 1);
                        parada.setText(P_Siguiente.getNombre());
                        tiempo_label.setText(String.valueOf(time) + " minutos");
                        distancia = (int) Math.sqrt(Math.pow((P_Siguiente.getCoordX() - P_Anterior.getCoordX()), 2) + Math.pow((P_Siguiente.getCoordY() - P_Anterior.getCoordY()), sub));
                        tiempo = (int) (distancia / bus.getVelocidad()) * 60;
                        barra.setMaximum(tiempo);
                        System.out.println(barra.getMaximum());
                        barra.setValue(barra.getValue() + 1);
                        System.out.println(barra.getValue());
                        time++;
                        if (barra.getValue() == barra.getMaximum()) {
                            for (int i = 0; i < bus.getLista_estudiantes().size(); i++) {
                                if (bus.getLista_estudiantes().get(i).getParada().getNombre().equals(parada.getText())) {
                                    System.out.println("se bajo " + bus.getLista_estudiantes().get(i).getNombre());
                                    DefaultTableModel modelo = (DefaultTableModel) tablal.getModel();
                                    Object[] row = {parada.getText(), tiempo, bus.getLista_estudiantes().get(i).getNombre()};
                                    modelo.addRow(row);
                                    tablal.setModel(modelo);
                                    bus.getLista_estudiantes().remove(bus.getLista_estudiantes().get(i));
                                }
                            }
                            System.out.println(P_Siguiente.getNombre());
                            System.out.println(P_Anterior.getNombre());
                            sub++;
                            barra.setValue(0);
                            JOptionPane.showMessageDialog(null, "Parada " + P_Siguiente.getNombre() + " Recorrida");
                            time = 0;
                        }
                    }
                } else {
                    P_Anterior = lista_Paradas.get(sub - 1);
                    System.out.println(P_Anterior.getNombre());
                    parada.setText("Unitec");
                    tiempo_label.setText(String.valueOf(time) + " minutos");
                    distancia = (int) Math.sqrt(Math.pow((0 - P_Anterior.getCoordX()), 2) + Math.pow((0 - P_Anterior.getCoordY()), sub));
                    tiempo = (int) (distancia / bus.getVelocidad()) * 60;
                    barra.setMaximum(tiempo);
                    System.out.println(barra.getMaximum());
                    barra.setValue(barra.getValue() + 1);
                    System.out.println(barra.getValue());
                    if (barra.getValue() == barra.getMaximum()) {
                        avance = false;
                    }
                    time++;
                }
                if (avance == false) {
                    vive = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        JOptionPane.showMessageDialog(null, "Ruta recorrida exitosamente");
    }

    public ArrayList ordenar_paradas(Autobus bus2) {
        ArrayList<Parada> temp = new ArrayList();
        ArrayList<Double> temp2 = new ArrayList();
        ArrayList<Parada> temp3 = new ArrayList();
        ArrayList<Parada> temp4 = new ArrayList();
        for (int i = 0; i < bus.getLista_estudiantes().size(); i++) {
            Parada p = bus.getLista_estudiantes().get(i).getParada();
            temp.add(p);
        }
        for (Estudiante estudiante : bus2.getLista_estudiantes()) {

        }
        for (Parada parada : temp) {
            double d = parada.getDistancia();
            temp2.add(d);
        }
        Collections.sort(temp2);
        for (Double dis : temp2) {
            for (Parada pa : temp) {
                if (pa.getDistancia() == dis) {
                    temp3.add(pa);
                    break;
                }
            }
        }
//        for (Parada parada1 : temp3) {
//            for (Parada parada2 : temp4) {
//                if (parada2.getNombre().equals(parada1.getNombre())) {
//                } else {
//                    temp4.add(parada1);
//                }
//            }
//        }
//        for (Parada parada1 : temp4) {
//            System.out.println(parada1.getNombre());
//        }
        return temp3;
    }
}
