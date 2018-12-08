/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Daniel Agurcia
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_crear_estduiante = new javax.swing.JDialog();
        jb_agregar_Estudiante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre_estudiante = new javax.swing.JTextField();
        tf_edad_estudiante = new javax.swing.JTextField();
        tf_numero_cuenta = new javax.swing.JTextField();
        cb_paradas_agregar_estudiante = new javax.swing.JComboBox<>();
        jb_volver = new javax.swing.JButton();
        ventana_crear_bus = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jb_crear_bus = new javax.swing.JButton();
        tf_id_bus = new javax.swing.JTextField();
        tf_placa_bus = new javax.swing.JTextField();
        tf_color_bus = new javax.swing.JTextField();
        tf_velocidad_bus = new javax.swing.JTextField();
        jb_volver_bus = new javax.swing.JButton();
        ventana_agregar_al_bus = new javax.swing.JDialog();
        cb_estudiantes = new javax.swing.JComboBox<>();
        jb_agregar_al_bus = new javax.swing.JButton();
        jb_volver_meterBus = new javax.swing.JButton();
        ventana_agregar_parada = new javax.swing.JDialog();
        Nombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jb_agregar_parada = new javax.swing.JButton();
        tf_nombre_paradas = new javax.swing.JTextField();
        tf_angulo_parada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_distancia_parada = new javax.swing.JTextField();
        jl_tiempo = new javax.swing.JLabel();
        jl_parada_actual = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jb_agreEst = new javax.swing.JButton();
        jb_agreEstBus = new javax.swing.JButton();
        jb_crearB = new javax.swing.JButton();
        jb_crearPAr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jb_agregar_Estudiante.setText("Ingresar Estudiante");
        jb_agregar_Estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_EstudianteMouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Numero de Cuenta");

        jLabel4.setText("Parada");

        tf_edad_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_edad_estudianteActionPerformed(evt);
            }
        });

        jb_volver.setText("volver atras");

        javax.swing.GroupLayout ventana_crear_estduianteLayout = new javax.swing.GroupLayout(ventana_crear_estduiante.getContentPane());
        ventana_crear_estduiante.getContentPane().setLayout(ventana_crear_estduianteLayout);
        ventana_crear_estduianteLayout.setHorizontalGroup(
            ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_crear_estduianteLayout.createSequentialGroup()
                .addGroup(ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_crear_estduianteLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_edad_estudiante)
                            .addComponent(tf_nombre_estudiante)
                            .addComponent(tf_numero_cuenta)
                            .addComponent(cb_paradas_agregar_estudiante, 0, 173, Short.MAX_VALUE)))
                    .addGroup(ventana_crear_estduianteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventana_crear_estduianteLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jb_agregar_Estudiante)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        ventana_crear_estduianteLayout.setVerticalGroup(
            ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventana_crear_estduianteLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jb_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_edad_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_numero_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ventana_crear_estduianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_paradas_agregar_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jb_agregar_Estudiante)
                .addGap(30, 30, 30))
        );

        jLabel5.setText("Identificacion");

        jLabel6.setText("Placa");

        jLabel7.setText("Color");

        jLabel8.setText("Velocidad");

        jb_crear_bus.setText("Crear Bus");
        jb_crear_bus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crear_busMouseClicked(evt);
            }
        });

        jb_volver_bus.setText("Volver atras");

        javax.swing.GroupLayout ventana_crear_busLayout = new javax.swing.GroupLayout(ventana_crear_bus.getContentPane());
        ventana_crear_bus.getContentPane().setLayout(ventana_crear_busLayout);
        ventana_crear_busLayout.setHorizontalGroup(
            ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_crear_busLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_id_bus)
                    .addComponent(tf_placa_bus)
                    .addComponent(tf_color_bus)
                    .addComponent(tf_velocidad_bus, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ventana_crear_busLayout.createSequentialGroup()
                .addGroup(ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_crear_busLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jb_crear_bus))
                    .addGroup(ventana_crear_busLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_volver_bus)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        ventana_crear_busLayout.setVerticalGroup(
            ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_crear_busLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_volver_bus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_id_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_placa_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_color_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_crear_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_velocidad_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jb_crear_bus)
                .addGap(39, 39, 39))
        );

        jb_agregar_al_bus.setText("Agregar al Bus");
        jb_agregar_al_bus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_al_busMouseClicked(evt);
            }
        });

        jb_volver_meterBus.setText("Volver atras");

        javax.swing.GroupLayout ventana_agregar_al_busLayout = new javax.swing.GroupLayout(ventana_agregar_al_bus.getContentPane());
        ventana_agregar_al_bus.getContentPane().setLayout(ventana_agregar_al_busLayout);
        ventana_agregar_al_busLayout.setHorizontalGroup(
            ventana_agregar_al_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_agregar_al_busLayout.createSequentialGroup()
                .addGroup(ventana_agregar_al_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_agregar_al_busLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventana_agregar_al_busLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jb_agregar_al_bus))
                    .addGroup(ventana_agregar_al_busLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_volver_meterBus)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        ventana_agregar_al_busLayout.setVerticalGroup(
            ventana_agregar_al_busLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_agregar_al_busLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_volver_meterBus)
                .addGap(31, 31, 31)
                .addComponent(cb_estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jb_agregar_al_bus)
                .addGap(16, 16, 16))
        );

        Nombre.setText("Nombre");

        jLabel10.setText("Angulo");

        jb_agregar_parada.setText("Agregar Paradas");
        jb_agregar_parada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_paradaMouseClicked(evt);
            }
        });

        jLabel9.setText("Distancia");

        javax.swing.GroupLayout ventana_agregar_paradaLayout = new javax.swing.GroupLayout(ventana_agregar_parada.getContentPane());
        ventana_agregar_parada.getContentPane().setLayout(ventana_agregar_paradaLayout);
        ventana_agregar_paradaLayout.setHorizontalGroup(
            ventana_agregar_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_agregar_paradaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(ventana_agregar_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(ventana_agregar_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_agregar_parada)
                    .addComponent(tf_nombre_paradas)
                    .addComponent(tf_angulo_parada)
                    .addComponent(tf_distancia_parada, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        ventana_agregar_paradaLayout.setVerticalGroup(
            ventana_agregar_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_agregar_paradaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ventana_agregar_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(tf_nombre_paradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ventana_agregar_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_angulo_parada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(ventana_agregar_paradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_distancia_parada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jb_agregar_parada)
                .addGap(42, 42, 42))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jl_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 100, 20));
        getContentPane().add(jl_parada_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 491, 165, 39));

        jProgressBar1.setBackground(new java.awt.Color(255, 0, 0));
        jProgressBar1.setMaximum(5);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 279, 45));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parada", "Tiempo", "Estudiante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 6, -1, -1));

        jb_agreEst.setText("Agregar Estudiante");
        jb_agreEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agreEstMouseClicked(evt);
            }
        });
        getContentPane().add(jb_agreEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 6, 171, -1));

        jb_agreEstBus.setText("Agregar Estudiante al Bus");
        jb_agreEstBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agreEstBusMouseClicked(evt);
            }
        });
        getContentPane().add(jb_agreEstBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 40, -1, -1));

        jb_crearB.setText("Crear un Bus");
        jb_crearB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearBMouseClicked(evt);
            }
        });
        getContentPane().add(jb_crearB, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 74, 171, -1));

        jb_crearPAr.setText("Crear Parada");
        jb_crearPAr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearPArMouseClicked(evt);
            }
        });
        jb_crearPAr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb_crearPArKeyPressed(evt);
            }
        });
        getContentPane().add(jb_crearPAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 108, 171, -1));

        jButton1.setText("Comenzar Recorrido");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 440, 171, 45));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_edad_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_edad_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_edad_estudianteActionPerformed

    private void jb_agregar_paradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_paradaMouseClicked
        String nombre = tf_nombre_paradas.getText();
        double angulo = Math.toRadians(Double.parseDouble(tf_angulo_parada.getText()));
        double distancia = Double.parseDouble(tf_distancia_parada.getText());
        Parada nuevaParada = new Parada(nombre, distancia, angulo);
        lista_paradas.add(nuevaParada);
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_paradas_agregar_estudiante.getModel();
        modelo.addElement(nuevaParada);
        cb_paradas_agregar_estudiante.setModel(modelo);
        tf_nombre_paradas.setText("");
        tf_angulo_parada.setText("");
        tf_distancia_parada.setText("");
        ventana_agregar_parada.dispose();
    }//GEN-LAST:event_jb_agregar_paradaMouseClicked

    private void jb_agregar_al_busMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_al_busMouseClicked
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_estudiantes.getModel();
        Estudiante seleccionado = (Estudiante) modelo.getSelectedItem();
        Bus.getLista_estudiantes().add(seleccionado);
        modelo.removeElement(seleccionado);
        cb_estudiantes.setModel(modelo);
        ventana_agregar_al_bus.dispose();
    }//GEN-LAST:event_jb_agregar_al_busMouseClicked

    private void jb_agregar_EstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_EstudianteMouseClicked
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_paradas_agregar_estudiante.getModel();
        Parada seleccionada = (Parada) modelo.getSelectedItem();
        Estudiante nuevoEstudiante = new Estudiante(tf_nombre_estudiante.getText(), Integer.parseInt(tf_edad_estudiante.getText()), Integer.parseInt(tf_numero_cuenta.getText()), seleccionada);
        lista_estudiantes.add(nuevoEstudiante);
        cb_paradas_agregar_estudiante.setModel(modelo);
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cb_estudiantes.getModel();
        modelo2.addElement(nuevoEstudiante);
        cb_estudiantes.setModel(modelo2);
        tf_nombre_estudiante.setText("");
        tf_edad_estudiante.setText("");
        tf_numero_cuenta.setText("");
        ventana_crear_estduiante.dispose();
    }//GEN-LAST:event_jb_agregar_EstudianteMouseClicked

    private void jb_agreEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agreEstMouseClicked
        ventana_crear_estduiante.setModal(true);
        ventana_crear_estduiante.setLocationRelativeTo(this);
        ventana_crear_estduiante.pack();
        ventana_crear_estduiante.setVisible(true);
    }//GEN-LAST:event_jb_agreEstMouseClicked

    private void jb_agreEstBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agreEstBusMouseClicked
        ventana_agregar_al_bus.setModal(true);
        ventana_agregar_al_bus.setLocationRelativeTo(this);
        ventana_agregar_al_bus.pack();
        ventana_agregar_al_bus.setVisible(true);
    }//GEN-LAST:event_jb_agreEstBusMouseClicked

    private void jb_crearBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearBMouseClicked
        ventana_crear_bus.setModal(true);
        ventana_crear_bus.setLocationRelativeTo(this);
        ventana_crear_bus.pack();
        ventana_crear_bus.setVisible(true);
    }//GEN-LAST:event_jb_crearBMouseClicked

    private void jb_crearPArKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb_crearPArKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_crearPArKeyPressed

    private void jb_crearPArMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearPArMouseClicked
        ventana_agregar_parada.setModal(true);
        ventana_agregar_parada.setLocationRelativeTo(this);
        ventana_agregar_parada.pack();
        ventana_agregar_parada.setVisible(true);
    }//GEN-LAST:event_jb_crearPArMouseClicked

    private void jb_crear_busMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crear_busMouseClicked
        Bus = new Autobus(tf_id_bus.getText(), tf_placa_bus.getText(), tf_color_bus.getText(), Double.parseDouble(tf_velocidad_bus.getText()));
        tf_id_bus.setText("");
        tf_placa_bus.setText("");
        tf_color_bus.setText("");
        tf_velocidad_bus.setText("");
        ventana_crear_bus.dispose();
    }//GEN-LAST:event_jb_crear_busMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Autobus busito = Bus;
        hilo_simulacion HS = new hilo_simulacion(jProgressBar1, jl_tiempo, jl_parada_actual, jTable1, true, true, busito);
        HS.start();
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    Autobus Bus = null;
    ArrayList<Estudiante> lista_estudiantes = new ArrayList();
    ArrayList<Parada> lista_paradas = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JComboBox<String> cb_estudiantes;
    private javax.swing.JComboBox<String> cb_paradas_agregar_estudiante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_agreEst;
    private javax.swing.JButton jb_agreEstBus;
    private javax.swing.JButton jb_agregar_Estudiante;
    private javax.swing.JButton jb_agregar_al_bus;
    private javax.swing.JButton jb_agregar_parada;
    private javax.swing.JButton jb_crearB;
    private javax.swing.JButton jb_crearPAr;
    private javax.swing.JButton jb_crear_bus;
    private javax.swing.JButton jb_volver;
    private javax.swing.JButton jb_volver_bus;
    private javax.swing.JButton jb_volver_meterBus;
    private javax.swing.JLabel jl_parada_actual;
    private javax.swing.JLabel jl_tiempo;
    private javax.swing.JTextField tf_angulo_parada;
    private javax.swing.JTextField tf_color_bus;
    private javax.swing.JTextField tf_distancia_parada;
    private javax.swing.JTextField tf_edad_estudiante;
    private javax.swing.JTextField tf_id_bus;
    private javax.swing.JTextField tf_nombre_estudiante;
    private javax.swing.JTextField tf_nombre_paradas;
    private javax.swing.JTextField tf_numero_cuenta;
    private javax.swing.JTextField tf_placa_bus;
    private javax.swing.JTextField tf_velocidad_bus;
    private javax.swing.JDialog ventana_agregar_al_bus;
    private javax.swing.JDialog ventana_agregar_parada;
    private javax.swing.JDialog ventana_crear_bus;
    private javax.swing.JDialog ventana_crear_estduiante;
    // End of variables declaration//GEN-END:variables
}
