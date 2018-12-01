
package Vista;

import Modelo.JugadoresClase;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class PrincipalJugadores extends javax.swing.JFrame {

    public static DefaultTableModel modeloJugadores = new DefaultTableModel();
    public static DefaultTableModel modeloEstaturas = new DefaultTableModel();
    public static DefaultTableModel modeloEdades = new DefaultTableModel();

    ArrayList <JugadoresClase> listajugadores = new ArrayList<JugadoresClase>();
    
    public PrincipalJugadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelAñadir.setVisible(false);
        this.tabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelAñadir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cbPosicion = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstaturas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEdad = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAñadir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelAñadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        panelAñadir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel3.setText("Estatura: (cm)");
        panelAñadir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel4.setText("Posicion:");
        panelAñadir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel5.setText("Fecha de Nacimiento:");
        panelAñadir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        txtEstatura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelAñadir.add(txtEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelAñadir.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 170, -1));

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelAñadir.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 30));

        cbPosicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delantero", "Volante", "Defensa", "Arquero" }));
        panelAñadir.add(cbPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, -1));

        btnAgregar.setBackground(new java.awt.Color(204, 255, 204));
        btnAgregar.setText("ADD");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelAñadir.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 60, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 204, 204));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panelAñadir.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 90, 30));

        jLabel6.setText("(dd/mm/aaaa)");
        panelAñadir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel1.add(panelAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 360, 200));

        tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaJugadores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, 520));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE JUGADORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnAñadir.setBackground(new java.awt.Color(204, 255, 204));
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 80, 30));

        btnOrdenar.setBackground(new java.awt.Color(255, 255, 204));
        btnOrdenar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOrdenar.setText(">>");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 80, 40));

        tablaEstaturas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaEstaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEstaturas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 360, 140));

        tablaEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaEdad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaEdad);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 360, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        panelAñadir.setVisible(true);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        panelAñadir.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        if (txtEstatura.getText().length()==0||txtFecha.getText().length()==0||txtNombre.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos","Completar",JOptionPane.WARNING_MESSAGE);

        } else if(txtFecha.getText().length()<10 || txtFecha.getText().length()>10){
            
            JOptionPane.showMessageDialog(null, "Recuerde que el formato en que debe ingresar la fecha es: dd/mm/aaaa"+"\nEjemplos: 17/07/2001 | 27/12/1998 | 06/09/2007","Error al ingresar la fecha de nacimiento",JOptionPane.ERROR_MESSAGE);
            
        }else {
        
        
        JugadoresClase jug = new JugadoresClase(txtNombre.getText(),
                txtFecha.getText(), 
                cbPosicion.getSelectedItem().toString(),
                Integer.parseInt(txtEstatura.getText()));
        
        listajugadores.add(jug);
        JOptionPane.showMessageDialog(null,txtNombre.getText()+ " ha sido registrado con exito");
        mostrar();
        limpiar();
        
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
     recorrerEstatura();
     recorrerEdades();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    public void mostrar(){
        
        String matris []= new String[4];
        
        for (int i = 0; i < listajugadores.size(); i++) {
            
            matris[0]=listajugadores.get(i).getNombre();
            matris[1]=listajugadores.get(i).getFechanacimiento();
            matris[2]=listajugadores.get(i).getPosicion();
            matris[3]=Integer.toString(listajugadores.get(i).getEstatura());
            
        }
        
        modeloJugadores.addRow(matris);
        
               
    }
    
    public void limpiar(){
        
        txtEstatura.setText("");
        txtNombre.setText("");
        txtFecha.setText("");
        
    }
    
    public void tabla(){
        
        modeloJugadores.addColumn("Nombre");
        modeloJugadores.addColumn("Fecha de Nacimiento");
        modeloJugadores.addColumn("Posicion");
        modeloJugadores.addColumn("Estatura");
        
        tablaJugadores.setModel(modeloJugadores);
        
        TableColumnModel columnModel = tablaJugadores.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(160);
        columnModel.getColumn(2).setPreferredWidth(90);
        columnModel.getColumn(3).setPreferredWidth(80);
        
        modeloEstaturas.addColumn("Estaturas Ordenadas de Mayor a Menor");
        
        tablaEstaturas.setModel(modeloEstaturas);
        
        modeloEdades.addColumn("Edades Ordenadas de Mayor a Menor");
        
        tablaEdad.setModel(modeloEdades);
        
    }
    
    public void recorrerEdades(){
        
        int [] edad = new int[listajugadores.size()];
        
        for (int i = 0; i < listajugadores.size(); i++) {
            
            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechanacimiento = LocalDate.parse(tablaJugadores.getValueAt(i, 1).toString(),date);
            LocalDate fechaactual = LocalDate.now();

            Period periodo = Period.between(fechanacimiento, fechaactual);
            
            edad[i] = periodo.getYears();

        }
        
        for(int i = 0; i < edad.length - 1; i++)
        {
            for(int j = 0; j < edad.length - 1; j++)
            {
                if (edad[j] < edad[j + 1])
                {
                    int tmp = edad[j+1];
                    edad[j+1] = edad[j];
                    edad[j] = tmp;
                }

            }           
            
        }
        
        modeloEdades.setNumRows(0);
        
        for (int i = 0; i < listajugadores.size(); i++) {
            
            String matrise []= new String[1];
            
            for (int j = 0; j < listajugadores.size(); j++) {

                    matrise[0]=edad[i]+" años";

            }
           
            
            modeloEdades.addRow(matrise);
        }
        
        
        
        
    }
    
    public void recorrerEstatura(){
        
        int [] est = new int[listajugadores.size()];
        
        for (int i = 0; i < listajugadores.size(); i++) {
            
            est[i] = Integer.parseInt(tablaJugadores.getValueAt(i, 3).toString());
            
        }
        
        for(int i = 0; i < est.length - 1; i++)
        {
            for(int j = 0; j < est.length - 1; j++)
            {
                if (est[j] < est[j + 1])
                {
                    int tmp = est[j+1];
                    est[j+1] = est[j];
                    est[j] = tmp;
                    
                }
            }
            
        }
        
        modeloEstaturas.setNumRows(0);
        
        for(int i = 0;i < est.length; i++)
        {
            
            String matris []= new String[1];
        
            for (int j = 0; j < listajugadores.size(); j++) {
                
                matris[0]=est[i]+" cm";
 
            }

            modeloEstaturas.addRow(matris);

        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbPosicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelAñadir;
    private javax.swing.JTable tablaEdad;
    private javax.swing.JTable tablaEstaturas;
    private javax.swing.JTable tablaJugadores;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
