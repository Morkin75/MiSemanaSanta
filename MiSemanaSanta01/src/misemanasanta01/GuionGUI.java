/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misemanasanta01;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ManuPortatil
 */
public class GuionGUI extends javax.swing.JFrame {

    //Creamos tres gráficos para guardar el color de la capa, caperuz y túnica
    Icon graficoCaperuz;
    Icon graficoCapa;
    Icon graficoTunica;
    Icon iconoGuion;
         
    /**
     * Creates new form Guion
     */
    public GuionGUI() {
        initComponents();
        
        //Le ponemos un marco la ventana
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLUE));
        
        //Grafico para el mensaje del AlertBox
        iconoGuion = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Nazareno.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jComboElegirCaperuz = new javax.swing.JComboBox<>();
        labelCapaT = new javax.swing.JLabel();
        jComboElegirCapa = new javax.swing.JComboBox<>();
        labelTunicaT = new javax.swing.JLabel();
        jComboElegirTunica = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButtonEstablecer = new javax.swing.JButton();
        jButtonCambiarGuion = new javax.swing.JButton();
        labelCapa = new javax.swing.JLabel();
        labelCaperuz = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        labelTunica = new javax.swing.JLabel();
        labelCaperuzT = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 460));

        jComboElegirCaperuz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboElegirCaperuz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Azul", "Blanco", "Burdeos", "Celeste", "Marron", "Morado", "Negro", "Rojo", "Verde" }));
        jComboElegirCaperuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboElegirCaperuzActionPerformed(evt);
            }
        });

        labelCapaT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCapaT.setText("CAPA");

        jComboElegirCapa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboElegirCapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarilla", "Azul", "Blanca", "Burdeos", "Celeste", "Marron", "Morada", "Negra", "Roja", "Verde" }));
        jComboElegirCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboElegirCapaActionPerformed(evt);
            }
        });

        labelTunicaT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTunicaT.setText("TÚNICA");

        jComboElegirTunica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboElegirTunica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarilla", "Azul", "Blanca", "Burdeos", "Celeste", "Marron", "Morada", "Negra", "Roja", "Verde" }));
        jComboElegirTunica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboElegirTunicaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jButtonEstablecer.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEstablecer.setFont(new java.awt.Font("VAGRounded BT", 0, 14)); // NOI18N
        jButtonEstablecer.setText("ESTABLECER");
        jButtonEstablecer.setBorder(null);
        jButtonEstablecer.setBorderPainted(false);
        jButtonEstablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEstablecerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEstablecerMouseExited(evt);
            }
        });
        jButtonEstablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstablecerActionPerformed(evt);
            }
        });

        jButtonCambiarGuion.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCambiarGuion.setFont(new java.awt.Font("VAGRounded BT", 0, 12)); // NOI18N
        jButtonCambiarGuion.setForeground(new java.awt.Color(0, 0, 153));
        jButtonCambiarGuion.setText("CAMBIAR GUIÓN");
        jButtonCambiarGuion.setBorder(null);
        jButtonCambiarGuion.setBorderPainted(false);
        jButtonCambiarGuion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCambiarGuionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCambiarGuionMouseExited(evt);
            }
        });
        jButtonCambiarGuion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarGuionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCambiarGuion, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jButtonEstablecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButtonEstablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCambiarGuion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        labelCapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaAmarillo.png"))); // NOI18N

        labelCaperuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzAmarillo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Túnicas de la Hermandad: ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        botonSalir.setFont(new java.awt.Font("VAGRounded BT", 1, 24)); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.setBorderPainted(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio de la túnica:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTextPane1.setEditable(false);
        jTextPane1.setText("50");
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jTextPane2.setText("120 €");
        jTextPane2.setToolTipText("");
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        labelTunica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaAmarillo.png"))); // NOI18N

        labelCaperuzT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCaperuzT.setText("CAPERUZ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCaperuz, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTunica, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCaperuzT)
                            .addComponent(labelCapaT)
                            .addComponent(labelTunicaT))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboElegirTunica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboElegirCapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboElegirCaperuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(136, 136, 136))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboElegirCaperuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jComboElegirCapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jComboElegirTunica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(labelCaperuzT)
                                        .addGap(48, 48, 48)
                                        .addComponent(labelCapaT)
                                        .addGap(48, 48, 48)
                                        .addComponent(labelTunicaT))
                                    .addComponent(labelCaperuz, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTunica, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tercio Cristo", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tercio Palio", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose(); //Destruimos la instancia de esta ventana
        MiSemanaSanta01.ventanaPrincipal.setEnabled(true); //Activamos la ventana principal
        MiSemanaSanta01.ventanaPrincipal.setVisible(true); //Hacemos visible la ventana principal
    }//GEN-LAST:event_botonSalirActionPerformed

    private void jButtonEstablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstablecerActionPerformed
        this.setAlwaysOnTop(false);
        int opcion = JOptionPane.showConfirmDialog(null, "Vas a confirmar el guión de tu tercio de Cristo.\n¿Estás seguro?", "ESTABLECER GUIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, iconoGuion);
        //Después restamos el dinero y aumentamos la popularidad, siempre que aceptemos
        if(opcion == 0) { //Esto es que ha pulsado SÍ
            //Guardamos los datos del guión en los datos de la hermandad
            VentanaPrincipal.miHermandad.setColorCapa(jComboElegirCapa.getSelectedIndex());
            VentanaPrincipal.miHermandad.setColorCaperuz(jComboElegirCaperuz.getSelectedIndex());
            VentanaPrincipal.miHermandad.setColorTunica(jComboElegirTunica.getSelectedIndex());        
            JOptionPane.showMessageDialog(null, "Se ha establecido el guion de la Hermandad.", "GUIÓN", JOptionPane.OK_OPTION, iconoGuion);
            jButtonCambiarGuion.setEnabled(true);
            jButtonEstablecer.setEnabled(false);
            jComboElegirCapa.setEnabled(false);
            jComboElegirCaperuz.setEnabled(false);
            jComboElegirTunica.setEnabled(false);
            //this.dispose(); //Destruimos la instancia de esta ventana
            //MiSemanaSanta01.ventanaPrincipal.setEnabled(true); //Activamos la ventana principal
            //MiSemanaSanta01.ventanaPrincipal.setVisible(true); //Hacemos visible la ventana principal
            MiSemanaSanta01.ventanaPrincipal.escribirHistorico("Has cambiado el guión de tu Hermandad para el tercio de Cristo.\n\n");
        }

    }//GEN-LAST:event_jButtonEstablecerActionPerformed

    private void jComboElegirCaperuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboElegirCaperuzActionPerformed
        //Escogemos el color según el desplegable
        switch(jComboElegirCaperuz.getSelectedIndex()) { //Este es el combo del Caperuz
            case 0:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzAmarillo.png"));
                break;
            case 1:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzAzul.png"));
                break;
            case 2:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzBlanco.png"));
                break;
            case 3:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzBurdeos.png"));
                break;
            case 4:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzCeleste.png"));
                break;
            case 5:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzMarron.png"));
                break;
            case 6:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzMorado.png"));
                break;
            case 7:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzNegro.png"));
                break;
            case 8:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzRojo.png"));
                break;
            case 9:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzVerde.png"));
                break;
        };
        labelCaperuz.setIcon(graficoCaperuz); //Establecemos el inoco para el caperuz
    }//GEN-LAST:event_jComboElegirCaperuzActionPerformed

    private void jComboElegirCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboElegirCapaActionPerformed
        switch(jComboElegirCapa.getSelectedIndex()) { //Este es el combo de la capa
            case 0:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaAmarillo.png"));
                break;
            case 1:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaAzul.png"));
                break;
            case 2:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaBlanco.png"));
                break;
            case 3:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaBurdeos.png"));
                break;
            case 4:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaCeleste.png"));
                break;
            case 5:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaMarron.png"));
                break;
            case 6:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaMorado.png"));
                break;
            case 7:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaNegro.png"));
                break;
            case 8:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaRojo.png"));
                break;
            case 9:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaVerde.png"));
                break;
        };
        labelCapa.setIcon(graficoCapa); //Establecemos el inoco para la capa
    }//GEN-LAST:event_jComboElegirCapaActionPerformed

    private void jComboElegirTunicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboElegirTunicaActionPerformed
        switch(jComboElegirTunica.getSelectedIndex()) { //Este es el combo de la túnica
            case 0:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaAmarillo.png"));
                break;
            case 1:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaAzul.png"));
                break;
            case 2:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaBlanco.png"));
                break;
            case 3:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaBurdeos.png"));
                break;
            case 4:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaCeleste.png"));
                break;
            case 5:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaMarron.png"));
                break;
            case 6:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaMorado.png"));
                break;
            case 7:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaNegro.png"));
                break;
            case 8:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaRojo.png"));
                break;
            case 9:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaVerde.png"));
                break;
        };
        labelTunica.setIcon(graficoTunica); //Establecemos el inoco para la túnica
    }    
        //Ponemos el color del Caperuz cuando llamamos a este método... por ejemplo, al leer datos guardados de archivo
        public void ponerColorCaperuz(int c) {                                                    
        //Escogemos el color según el desplegable
        switch(c) { //Este es el combo del Caperuz
            case 0:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzAmarillo.png"));
                break;
            case 1:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzAzul.png"));
                break;
            case 2:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzBlanco.png"));
                break;
            case 3:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzBurdeos.png"));
                break;
            case 4:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzCeleste.png"));
                break;
            case 5:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzMarron.png"));
                break;
            case 6:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzMorado.png"));
                break;
            case 7:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzNegro.png"));
                break;
            case 8:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzRojo.png"));
                break;
            case 9:
                graficoCaperuz = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CaperuzVerde.png"));
                break;
        };
        labelCaperuz.setIcon(graficoCaperuz); //Establecemos el inoco para el caperuz
    }                                                   

    public void ponerColorCapa(int c) {                                                 
        switch(c) { //Este es el combo de la capa
            case 0:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaAmarillo.png"));
                break;
            case 1:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaAzul.png"));
                break;
            case 2:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaBlanco.png"));
                break;
            case 3:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaBurdeos.png"));
                break;
            case 4:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaCeleste.png"));
                break;
            case 5:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaMarron.png"));
                break;
            case 6:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaMorado.png"));
                break;
            case 7:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaNegro.png"));
                break;
            case 8:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaRojo.png"));
                break;
            case 9:
                graficoCapa = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/CapaVerde.png"));
                break;
        };
        labelCapa.setIcon(graficoCapa); //Establecemos el inoco para la capa
    }                                                

    public void ponerColorTunica(int c) {                                                   
        switch(c) { //Este es el combo de la túnica
            case 0:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaAmarillo.png"));
                break;
            case 1:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaAzul.png"));
                break;
            case 2:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaBlanco.png"));
                break;
            case 3:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaBurdeos.png"));
                break;
            case 4:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaCeleste.png"));
                break;
            case 5:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaMarron.png"));
                break;
            case 6:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaMorado.png"));
                break;
            case 7:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaNegro.png"));
                break;
            case 8:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaRojo.png"));
                break;
            case 9:
                graficoTunica = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/TunicaVerde.png"));
                break;
        };
        labelTunica.setIcon(graficoTunica); //Establecemos el inoco para la túnica
        
        
    }//GEN-LAST:event_jComboElegirTunicaActionPerformed

    private void jButtonCambiarGuionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarGuionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCambiarGuionActionPerformed

    private void jButtonEstablecerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstablecerMouseEntered
        if(jButtonEstablecer.isEnabled())
            jButtonEstablecer.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jButtonEstablecerMouseEntered

    private void jButtonEstablecerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstablecerMouseExited
        jButtonEstablecer.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonEstablecerMouseExited

    private void jButtonCambiarGuionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCambiarGuionMouseEntered
        if(jButtonCambiarGuion.isEnabled())
            jButtonCambiarGuion.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jButtonCambiarGuionMouseEntered

    private void jButtonCambiarGuionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCambiarGuionMouseExited
        jButtonCambiarGuion.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonCambiarGuionMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    public javax.swing.JButton jButtonCambiarGuion;
    public javax.swing.JButton jButtonEstablecer;
    public javax.swing.JComboBox<String> jComboElegirCapa;
    public javax.swing.JComboBox<String> jComboElegirCaperuz;
    public javax.swing.JComboBox<String> jComboElegirTunica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel labelCapa;
    private javax.swing.JLabel labelCapaT;
    private javax.swing.JLabel labelCaperuz;
    private javax.swing.JLabel labelCaperuzT;
    private javax.swing.JLabel labelTunica;
    private javax.swing.JLabel labelTunicaT;
    // End of variables declaration//GEN-END:variables
}
