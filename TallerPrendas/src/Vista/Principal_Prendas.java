
package Vista;

import Modelo.Prendas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal_Prendas extends javax.swing.JFrame {

    public static DefaultTableModel modeloSucias = new DefaultTableModel();
    public static DefaultTableModel modeloJabonadas = new DefaultTableModel();
    public static DefaultTableModel modeloEnjuagadas = new DefaultTableModel();
    public static DefaultTableModel modeloLimpias = new DefaultTableModel();
    
    public static ArrayList<Prendas> listaPrendas = new ArrayList<>();
    
    public Principal_Prendas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        modeloSucias.addColumn("Codigo");
        modeloSucias.addColumn("Tipo");
        modeloSucias.addColumn("Color");
        modeloSucias.addColumn("Talla");
        
        tablaSucias.setModel(modeloSucias);
        
        modeloJabonadas.addColumn("Codigo");
        modeloJabonadas.addColumn("Tipo");
        modeloJabonadas.addColumn("Color");
        modeloJabonadas.addColumn("Talla");
        
        tablaJabonadas.setModel(modeloJabonadas);
        
        modeloEnjuagadas.addColumn("Codigo");
        modeloEnjuagadas.addColumn("Tipo");
        modeloEnjuagadas.addColumn("Color");
        modeloEnjuagadas.addColumn("Talla");
        
        tablaEnjuagadas.setModel(modeloEnjuagadas);
        
        modeloLimpias.addColumn("Codigo");
        modeloLimpias.addColumn("Tipo");
        modeloLimpias.addColumn("Color");
        modeloLimpias.addColumn("Talla");
        
        tablaLimpias.setModel(modeloLimpias);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSucias = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJabonadas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEnjuagadas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaLimpias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        LS = new javax.swing.JButton();
        SJ = new javax.swing.JButton();
        SE = new javax.swing.JButton();
        JS = new javax.swing.JButton();
        JE = new javax.swing.JButton();
        ES = new javax.swing.JButton();
        EL = new javax.swing.JButton();
        EJ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaSucias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaSucias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 410, 490));

        tablaJabonadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaJabonadas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 400, 120));

        tablaEnjuagadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaEnjuagadas);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 400, 140));

        tablaLimpias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaLimpias);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 400, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LIMPIAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SUCIAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("JABONADAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ENJUAGADAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        btnAñadir.setText("ADD");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        LS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LS.setText("U");
        LS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LSActionPerformed(evt);
            }
        });
        jPanel1.add(LS, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, -1, -1));

        SJ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SJ.setText("J");
        SJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SJActionPerformed(evt);
            }
        });
        jPanel1.add(SJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        SE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SE.setText("E");
        SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEActionPerformed(evt);
            }
        });
        jPanel1.add(SE, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        JS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JS.setText("P");
        JS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSActionPerformed(evt);
            }
        });
        jPanel1.add(JS, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, -1, -1));

        JE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JE.setText("E");
        JE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEActionPerformed(evt);
            }
        });
        jPanel1.add(JE, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, -1, -1));

        ES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ES.setText("P");
        ES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESActionPerformed(evt);
            }
        });
        jPanel1.add(ES, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, -1, -1));

        EL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EL.setText("S");
        EL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELActionPerformed(evt);
            }
        });
        jPanel1.add(EL, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, -1, -1));

        EJ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EJ.setText("J");
        EJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EJActionPerformed(evt);
            }
        });
        jPanel1.add(EJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        (new Añadir_Prenda(this, true)).setVisible(true);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void SJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SJActionPerformed
        try {
            int fs = tablaSucias.getSelectedRow();
            String datos[] = new String[4];
        
            datos[0] = tablaSucias.getValueAt(fs, 0).toString();
            datos[1] = tablaSucias.getValueAt(fs, 1).toString();
            datos[2] = tablaSucias.getValueAt(fs, 2).toString();
            datos[3] = tablaSucias.getValueAt(fs, 3).toString();

            modeloJabonadas.addRow(datos);
            
            modeloSucias.removeRow(fs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna prenda","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SJActionPerformed

    private void JSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSActionPerformed
        try {
            int fs = tablaJabonadas.getSelectedRow();
            String datos[] = new String[4];
        
            datos[0] = tablaJabonadas.getValueAt(fs, 0).toString();
            datos[1] = tablaJabonadas.getValueAt(fs, 1).toString();
            datos[2] = tablaJabonadas.getValueAt(fs, 2).toString();
            datos[3] = tablaJabonadas.getValueAt(fs, 3).toString();

            modeloSucias.addRow(datos);
            
            modeloJabonadas.removeRow(fs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna prenda","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_JSActionPerformed

    private void SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEActionPerformed
        try {
            int fs = tablaSucias.getSelectedRow();
            String datos[] = new String[4];
        
            datos[0] = tablaSucias.getValueAt(fs, 0).toString();
            datos[1] = tablaSucias.getValueAt(fs, 1).toString();
            datos[2] = tablaSucias.getValueAt(fs, 2).toString();
            datos[3] = tablaSucias.getValueAt(fs, 3).toString();

            modeloEnjuagadas.addRow(datos);
            
            modeloSucias.removeRow(fs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna prenda","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SEActionPerformed

    private void JEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEActionPerformed
        try {
            int fs = tablaJabonadas.getSelectedRow();
            String datos[] = new String[4];
        
            datos[0] = tablaJabonadas.getValueAt(fs, 0).toString();
            datos[1] = tablaJabonadas.getValueAt(fs, 1).toString();
            datos[2] = tablaJabonadas.getValueAt(fs, 2).toString();
            datos[3] = tablaJabonadas.getValueAt(fs, 3).toString();

            modeloEnjuagadas.addRow(datos);
            
            modeloJabonadas.removeRow(fs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna prenda","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_JEActionPerformed

    private void ESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESActionPerformed
        try {
            int fs = tablaEnjuagadas.getSelectedRow();
            String datos[] = new String[4];
        
            datos[0] = tablaEnjuagadas.getValueAt(fs, 0).toString();
            datos[1] = tablaEnjuagadas.getValueAt(fs, 1).toString();
            datos[2] = tablaEnjuagadas.getValueAt(fs, 2).toString();
            datos[3] = tablaEnjuagadas.getValueAt(fs, 3).toString();

            modeloSucias.addRow(datos);
            
            modeloEnjuagadas.removeRow(fs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna prenda","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ESActionPerformed

    private void ELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELActionPerformed
        try {
            int fs = tablaEnjuagadas.getSelectedRow();
            String datos[] = new String[4];
        
            datos[0] = tablaEnjuagadas.getValueAt(fs, 0).toString();
            datos[1] = tablaEnjuagadas.getValueAt(fs, 1).toString();
            datos[2] = tablaEnjuagadas.getValueAt(fs, 2).toString();
            datos[3] = tablaEnjuagadas.getValueAt(fs, 3).toString();

            modeloLimpias.addRow(datos);
            
            modeloEnjuagadas.removeRow(fs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna prenda","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ELActionPerformed

    private void EJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EJActionPerformed
        try {
            int fs = tablaEnjuagadas.getSelectedRow();
            String datos[] = new String[4];
        
            datos[0] = tablaEnjuagadas.getValueAt(fs, 0).toString();
            datos[1] = tablaEnjuagadas.getValueAt(fs, 1).toString();
            datos[2] = tablaEnjuagadas.getValueAt(fs, 2).toString();
            datos[3] = tablaEnjuagadas.getValueAt(fs, 3).toString();

            modeloJabonadas.addRow(datos);
            
            modeloEnjuagadas.removeRow(fs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna prenda","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EJActionPerformed

    private void LSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LSActionPerformed
        try {
            int fs = tablaLimpias.getSelectedRow();
            String datos[] = new String[4];
        
            datos[0] = tablaLimpias.getValueAt(fs, 0).toString();
            datos[1] = tablaLimpias.getValueAt(fs, 1).toString();
            datos[2] = tablaLimpias.getValueAt(fs, 2).toString();
            datos[3] = tablaLimpias.getValueAt(fs, 3).toString();

            modeloSucias.addRow(datos);
            
            modeloLimpias.removeRow(fs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No ha seleccionado ninguna prenda","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_LSActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EJ;
    private javax.swing.JButton EL;
    private javax.swing.JButton ES;
    private javax.swing.JButton JE;
    private javax.swing.JButton JS;
    private javax.swing.JButton LS;
    private javax.swing.JButton SE;
    private javax.swing.JButton SJ;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaEnjuagadas;
    private javax.swing.JTable tablaJabonadas;
    private javax.swing.JTable tablaLimpias;
    private javax.swing.JTable tablaSucias;
    // End of variables declaration//GEN-END:variables
}
