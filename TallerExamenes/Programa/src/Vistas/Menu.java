
package Vistas;

import Controladores.ControlExamenes;
import Controladores.ControlExamenesEstud;
import Modelos.Examen;
import Modelos.ExamenEstudiante;
import java.awt.HeadlessException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Menu extends javax.swing.JFrame {

    DefaultTableModel modeloExamenes = new DefaultTableModel();
    DefaultTableModel modeloExamenesCalif = new DefaultTableModel();
    
    ControlExamenesEstud cee = new ControlExamenesEstud();
    ControlExamenes ce = new ControlExamenes();
    ExamenEstudiante exe = new ExamenEstudiante();
    Examen ex = new Examen();
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        PanelCalificacion.setVisible(false);

        try  {
            ObjectInputStream oisc = new ObjectInputStream(new FileInputStream("examenesCalificados.ddr"));
            ObjectInputStream oisee = new ObjectInputStream(new FileInputStream("examenesEstudiante.ddr"));
            ObjectInputStream oise = new ObjectInputStream(new FileInputStream("examen.ddr"));
            
            cee.examenesCalif = (ArrayList<ExamenEstudiante>) oisc.readObject();
            ControlExamenesEstud.examenes = (Stack<ExamenEstudiante>) oisee.readObject();
            ce.listaExamenes= (ArrayList<Examen>) oise.readObject();
            
            listarExamCalificados();
            listarExamEstudiantes();
            
            if(!ce.listaExamenes.isEmpty()){
            
            labelCodExamen.setText(ce.listaExamenes.get(0).getCogigo());
            labelNumPreguntas.setText(Integer.toString(ce.listaExamenes.get(0).getNumeroPreguntas()));
            
            btnAceptar.setEnabled(false);
            txtCodExamen.setEnabled(false);
            txtNumPreguntas.setEnabled(false);
            
            }
        } catch (ClassNotFoundException e) {
        } catch (EOFException e) {
        } catch (IOException e) {
        } 
        
        tablaExamenes.setEnabled(false);
        tablaExamenesClaif.setEnabled(false);
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEntregar = new javax.swing.JButton();
        txtNomEstudiante = new javax.swing.JTextField();
        txtCodEstudiante = new javax.swing.JTextField();
        btnGenCodigo = new javax.swing.JButton();
        panelExamen = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtNumPreguntas = new javax.swing.JTextField();
        txtCodExamen = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnCalificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloExamenes.addColumn("Codigo");
        modeloExamenes.addColumn("Nombre");
        tablaExamenes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PanelCalificacion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        txtPregBuenas = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloExamenesCalif.addColumn("Codigo");
        modeloExamenesCalif.addColumn("Nombre");
        modeloExamenesCalif.addColumn("Preg. Buenas");
        modeloExamenesCalif.addColumn("Nota");
        tablaExamenesClaif = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        labelNumPreguntas = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        labelCodExamen = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NOMBRE:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setText("CODIGO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnEntregar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntregar.setText("ENTREGAR");
        btnEntregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, -1));
        jPanel2.add(txtNomEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, -1));
        jPanel2.add(txtCodEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, -1));

        btnGenCodigo.setBackground(new java.awt.Color(255, 255, 255));
        btnGenCodigo.setText("GENERAR CODIGO");
        btnGenCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 160));

        panelExamen.setBackground(new java.awt.Color(204, 255, 204));
        panelExamen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelExamen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("NUMERO DE PREGUNTAS:");
        panelExamen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText("CODIGO:");
        panelExamen.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panelExamen.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        panelExamen.add(txtNumPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, -1));
        panelExamen.add(txtCodExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, -1));

        jPanel1.add(panelExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 160));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalificar.setBackground(new java.awt.Color(255, 255, 255));
        btnCalificar.setText("CALIFICAR");
        btnCalificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        tablaExamenes.setModel(modeloExamenes);
        jScrollPane1.setViewportView(tablaExamenes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 230));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("EXAMENES DE LOS ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ESTUDIANTES");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 340));

        PanelCalificacion.setBackground(new java.awt.Color(204, 255, 204));
        PanelCalificacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelCalificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("PREGUNTAS BUENAS:");
        PanelCalificacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        btnOK.setBackground(new java.awt.Color(255, 255, 255));
        btnOK.setText("OK");
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        PanelCalificacion.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 60, 40));
        PanelCalificacion.add(txtPregBuenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 60, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ESTUDIANTE");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        PanelCalificacion.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CODIGO");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        PanelCalificacion.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel7.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 30));

        PanelCalificacion.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel8.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 30));

        PanelCalificacion.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 210, 30));

        jPanel1.add(PanelCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 330, 130));

        tablaExamenesClaif.setModel(modeloExamenesCalif);
        jScrollPane2.setViewportView(tablaExamenesClaif);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 390, 160));

        jPanel9.setBackground(new java.awt.Color(0, 204, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(255, 51, 51));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("X");
        btnGuardar.setToolTipText("SALIR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel9.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 50, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXAMEN REGISTRADO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shonar Bangla", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelNumPreguntas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNumPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelNumPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCodExamen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCodExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCodExamen, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("CODIGO");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("# PREGUNTAS");
        jPanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 100));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 120));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("EXAMENES CALIFICADOS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed

        try {
            
            if(tablaExamenes.getRowCount()>0){
            
            PanelCalificacion.setVisible(true);
        
            labelNombre.setText(ControlExamenesEstud.getExamenes().peek().getNombre());
            labelCodigo.setText(ControlExamenesEstud.getExamenes().peek().getCodigo());
            
            }
            
            else{
                
                JOptionPane.showMessageDialog(null, "No tiene examenes para calificar","ERROR",JOptionPane.WARNING_MESSAGE);
                
            }
            
        } catch (HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, "No tiene examenes para calificar","ERROR",JOptionPane.WARNING_MESSAGE);
            
        }


    }//GEN-LAST:event_btnCalificarActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        
        try {
            
            if(txtCodEstudiante.getText().length()==0||txtNomEstudiante.getText().length()==0){
                
                JOptionPane.showMessageDialog(null, "Complete los campos","ERROR!",JOptionPane.WARNING_MESSAGE);
                
            }
            else{
            String codigo = txtCodEstudiante.getText();
            String nombre = txtNomEstudiante.getText();
            double estado = 0.0;
            int pregBuenas = 0;

            cee.agregarExam(new ExamenEstudiante(nombre, codigo, estado, pregBuenas));

            listarExamEstudiantes();
            
            txtCodEstudiante.setText(null);
            txtNomEstudiante.setText(null);
            
            
            
                
            
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error, verifique que todo este bien","ERROR!",JOptionPane.ERROR_MESSAGE);
            
        } 
        

    }//GEN-LAST:event_btnEntregarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        try {
            
            if(labelCodExamen.getText().length()>1){
                
                JOptionPane.showMessageDialog(null, "Ya hay un examen registrado"+"\nClick en el boton 'NUEVO EXAMEN' para registrar otro","Error",JOptionPane.WARNING_MESSAGE);
                
            }
            else{
            Examen e = new Examen(txtCodExamen.getText(), Integer.parseInt(txtNumPreguntas.getText()));
            
            ce.listaExamenes.add(e);

            labelCodExamen.setText(txtCodExamen.getText());
            labelNumPreguntas.setText(txtNumPreguntas.getText());

            JOptionPane.showMessageDialog(null, "Examen creado correctamente");
            
            txtCodExamen.setText("");
            txtNumPreguntas.setText("");
            
            txtCodExamen.setEnabled(false);
            txtNumPreguntas.setEnabled(false);
            btnAceptar.setEnabled(false);
            
            
            }
            
        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Error, verifique que todo este bien","ERROR!",JOptionPane.ERROR_MESSAGE);
            
        }
     
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

        try {
            if(txtPregBuenas.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Digite el numero de preguntas buenas","ERROR!",JOptionPane.WARNING_MESSAGE);
            } else{
            String nombre = labelNombre.getText();
            String codigo = labelCodigo.getText();
            int pb = Integer.parseInt(txtPregBuenas.getText());
            double np = ce.listaExamenes.get(0).getNumeroPreguntas();
            double valor= 5.0/np;
            double nota = valor*pb;
            
            double nf= ((double) Math.round(nota * 100d)/100d);

            if(pb>np){
                
                JOptionPane.showMessageDialog(null, "El examen solamente tiene "+(int)np+" preguntas","ERROR!",JOptionPane.WARNING_MESSAGE);
                
            }
            else{

            ExamenEstudiante ee = new ExamenEstudiante(nombre, codigo, nf, pb);
            cee.examenesCalif.add(ee);
  
            listarExamCalificados();

            ControlExamenesEstud.examenes.pop();

            actualizar();

            txtPregBuenas.setText(null);
            PanelCalificacion.setVisible(false);
            
            
            
            }
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error, no se ha registrado ningun examen","ERROR!",JOptionPane.ERROR_MESSAGE);
            
        }
  
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnGenCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenCodigoActionPerformed
        
        try{
        
        int c = (int) (Math.random() * 99999) + 1;
        String cc = Integer.toString(c);
        if(cc.length()==5){
            txtCodEstudiante.setText("00000"+cc);
        }
        } catch (HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, "Error");
            
        }
        
    }//GEN-LAST:event_btnGenCodigoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
        try  {
                    
                ObjectOutputStream oosc = new ObjectOutputStream(new FileOutputStream("examenesCalificados.ddr"));
                ObjectOutputStream oosee = new ObjectOutputStream(new FileOutputStream("examenesEstudiante.ddr"));
                ObjectOutputStream oose = new ObjectOutputStream(new FileOutputStream("examen.ddr"));
                
                oosc.writeObject(cee.examenesCalif);
                oosee.writeObject(ControlExamenesEstud.examenes);
                oose.writeObject(ce.listaExamenes);
                
                this.dispose();
                    
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void actualizar(){
        
        modeloExamenes.setNumRows(0);
        
        String datos[]= new String[2];

            for (int i = 0; i < ControlExamenesEstud.getExamenes().size(); i++) {

                datos[0] = cee.gExamEst(i).getCodigo();
                datos[1] = cee.gExamEst(i).getNombre();

                modeloExamenes.addRow(datos);
                
            }

    }
    
    public void listarExamCalificados(){
        modeloExamenesCalif.setNumRows(0);

            String filas [] = new String[4];

            for (int i = 0; i < cee.examenesCalif.size(); i++) {


                filas[0] = cee.examenesCalif.get(i).getCodigo();
                filas[1] = cee.examenesCalif.get(i).getNombre();
                filas[2] = String.valueOf(cee.examenesCalif.get(i).getPreguntasBuenas());
                filas[3] = String.valueOf(cee.examenesCalif.get(i).getEstado());

                modeloExamenesCalif.addRow(filas);

            }
            
                

    }

    public void listarExamEstudiantes(){
        
        modeloExamenes.setNumRows(0);
        
        String datos[]= new String[2];

            for (int i = 0; i < ControlExamenesEstud.getExamenes().size(); i++) {

                datos[0] = cee.gExamEst(i).getCodigo();
                datos[1] = cee.gExamEst(i).getNombre();

                modeloExamenes.addRow(datos);
                
            }

            
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCalificacion;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCalificar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnGenCodigo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCodExamen;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumPreguntas;
    private javax.swing.JPanel panelExamen;
    private javax.swing.JTable tablaExamenes;
    private javax.swing.JTable tablaExamenesClaif;
    private javax.swing.JTextField txtCodEstudiante;
    private javax.swing.JTextField txtCodExamen;
    private javax.swing.JTextField txtNomEstudiante;
    private javax.swing.JTextField txtNumPreguntas;
    private javax.swing.JTextField txtPregBuenas;
    // End of variables declaration//GEN-END:variables
}
