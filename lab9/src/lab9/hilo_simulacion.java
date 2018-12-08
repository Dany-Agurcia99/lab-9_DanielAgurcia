package lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
import javax.swing.JLabel;
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
        System.out.println("entro");
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
        Parada P_Actual;
        int sub = 0;
        int time = 0;
        while (vive) {
            if (avance) {
                P_Actual = lista_Paradas.get(sub);
                parada.setText(P_Actual.getNombre());
                tiempo_label.setText(String.valueOf(time) + " minutos");
                tiempo = (int) (P_Actual.getDistancia() / bus.getVelocidad()) * 60;
                barra.setMaximum(tiempo);
                barra.setValue(barra.getValue() + 1);
                System.out.println(barra.getValue());
                if (barra.getValue() == barra.getMaximum()) {
                    sub++;
                    for (int i = 0; i < bus.getLista_estudiantes().size(); i++) {
                        if (bus.getLista_estudiantes().get(i).getParada().getNombre().equals(parada.getText())) {
                            System.out.println("se bajo " + bus.getLista_estudiantes().get(i).getNombre());
//                            tablal.setModel(new javax.swing.table.DefaultTableModel(
//                                    new Object[][]{},
//                                    new String[]{
//                                        "Parada", "Tiempo", "Estudiante"
//                                    }
//                            ) {
//                                boolean[] canEdit = new boolean[]{
//                                    false, false, false
//                                };
//
//                                public boolean isCellEditable(int rowIndex, int columnIndex) {
//                                    return canEdit[columnIndex];
//                                }
//                            });
                            DefaultTableModel modelo = (DefaultTableModel) tablal.getModel();
                            Object[] row = {parada.getText(), tiempo, bus.getLista_estudiantes().get(i).getNombre()};
                            modelo.addRow(row);
                            tablal.setModel(modelo);
                        }
                    }

                }
                time++;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public ArrayList ordenar_paradas(Autobus bus2) {
        ArrayList<Parada> temp = new ArrayList();
        ArrayList<Double> temp2 = new ArrayList();
        ArrayList<Parada> temp3 = new ArrayList();
        System.out.println("Hola");
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
        return temp3;
    }
}
