
package Vistas;

import Modelo.Medicamentos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Principal_Taller1 extends javax.swing.JFrame {

    public static DefaultTableModel modeloMedicamentos = new DefaultTableModel();
    public static DefaultTableModel modeloPastillas = new DefaultTableModel();
    public static DefaultTableModel modeloJarabes = new DefaultTableModel(); 
    
    public static ArrayList<Medicamentos> listaMedicamentos = new ArrayList<>();
    
    public Principal_Taller1() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        modeloMedicamentos.addColumn("Codigo");
        modeloMedicamentos.addColumn("Nombre");
        modeloMedicamentos.addColumn("Descrip.");
        modeloMedicamentos.addColumn("Tipo");
        modeloMedicamentos.addColumn("Estado");
        
        tablaMedicamentos.setModel(modeloMedicamentos);
        
        modeloPastillas.addColumn("Codigo");
        modeloPastillas.addColumn("Nombre");
        modeloPastillas.addColumn("Descrip.");
        modeloPastillas.addColumn("Tipo");
        modeloPastillas.addColumn("Estado");
        
        tablaPastillas.setModel(modeloPastillas);
        
        modeloJarabes.addColumn("Codigo");
        modeloJarabes.addColumn("Nombre");
        modeloJarabes.addColumn("Descrip.");
        modeloJarabes.addColumn("Tipo");
        modeloJarabes.addColumn("Estado");
        
        tablaJarabes.setModel(modeloJarabes);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedicamentos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPastillas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaJarabes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnPasar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCION", "TIPO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tablaMedicamentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 410, 440));

        tablaPastillas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCION", "TIPO", "ESTADO"
            }
        ));
        jScrollPane2.setViewportView(tablaPastillas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, 180));

        tablaJarabes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaJarabes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 450, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("JARABES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("MEDICAMENTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("PASTILLAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        btnPasar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPasar.setText(">>");
        btnPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        (new Añadir(this, true)).setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarActionPerformed
        try {
            int fs = tablaMedicamentos.getSelectedRow();
        
        if(tablaMedicamentos.getValueAt(fs, 3).toString().equals("Jarabe")){
            String datos[] = new String[5];
        
            datos[0] = tablaMedicamentos.getValueAt(fs, 0).toString();
            datos[1] = tablaMedicamentos.getValueAt(fs, 1).toString();
            datos[2] = tablaMedicamentos.getValueAt(fs, 2).toString();
            datos[3] = tablaMedicamentos.getValueAt(fs, 3).toString();
            datos[4] = tablaMedicamentos.getValueAt(fs, 4).toString();

            modeloJarabes.addRow(datos);
            
            modeloMedicamentos.removeRow(fs);
        
        }else{
            
            String datos[] = new String[5];

            datos[0] = tablaMedicamentos.getValueAt(fs, 0).toString();
            datos[1] = tablaMedicamentos.getValueAt(fs, 1).toString();
            datos[2] = tablaMedicamentos.getValueAt(fs, 2).toString();
            datos[3] = tablaMedicamentos.getValueAt(fs, 3).toString();
            datos[4] = tablaMedicamentos.getValueAt(fs, 4).toString();

            modeloPastillas.addRow(datos);
            
            modeloMedicamentos.removeRow(fs);
        }
        
   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun medicamento");
        }
        
        
        
    }//GEN-LAST:event_btnPasarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnPasar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaJarabes;
    private javax.swing.JTable tablaMedicamentos;
    private javax.swing.JTable tablaPastillas;
    // End of variables declaration//GEN-END:variables
}
