
package Vistas;

import Controladores.ControlIngreso;
import Controladores.ControlPersona;
import Controladores.ControlPisos;
import Modelos.Ingreso;
import Modelos.Persona;
import Modelos.Piso;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.Timer;

/**
 *
 * @author LuisAlbertoGomez
 */
public final class MenuAscensor extends javax.swing.JFrame {

    DefaultTableModel modeloPersonas = new DefaultTableModel();
    DefaultTableModel modeloIngresados = new DefaultTableModel();
    DefaultTableModel modeloTercero = new DefaultTableModel();
    DefaultTableModel modeloCuarto = new DefaultTableModel();
    

    private Timer t;
    private Timer t1;
    
 
    public MenuAscensor() {
        initComponents();
        this.setLocationRelativeTo(null);
        panel.setVisible(false);
        
        barra.setVisible(false);
        labelAcceso.setVisible(false);
        
//        btnRecoger.setEnabled(false);
        
        try {
            
            ObjectInputStream per = new ObjectInputStream(new FileInputStream("Personal.ddr"));
            ObjectInputStream ing = new ObjectInputStream(new FileInputStream("Ingresados.ddr"));
            ObjectInputStream pero = new ObjectInputStream(new FileInputStream("PersonalOriginal.ddr"));
            ObjectInputStream ingo = new ObjectInputStream(new FileInputStream("IngresosOriginal.ddr"));

            ControlIngreso.listaIngresosT = (ArrayList<Ingreso>) ing.readObject();
            ControlPersona.listaPersonasT = (ArrayList<Persona>) per.readObject();
            ControlPersona.listaPersonas = (ArrayList<Persona>) pero.readObject();
            ControlIngreso.listaIngresos = (ArrayList<Ingreso>) ingo.readObject();
            
            listarPersonas();
            listarIngreso();
            
        } catch (FileNotFoundException e){
        } catch (IOException | ClassNotFoundException e) {
        }
        
        btnSegundoPiso.setVisible(false);
        btnTercerPiso.setVisible(false);
        btnCuartoPiso.setVisible(false);
        
        Piso p3 = new Piso("Planta", 3);
        Piso p4 = new Piso("Sistema", 4);
        
        ControlPisos.añadirPiso(p3);
        ControlPisos.añadirPiso(p4);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnADD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloPersonas.addColumn("Nombre");
        modeloPersonas.addColumn("Codigo");
        modeloPersonas.addColumn("Peso");
        tablaPersonal = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnRecepcion = new javax.swing.JButton();
        btnPlanta = new javax.swing.JButton();
        btnSistema = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloIngresados.addColumn("Nombre");
        modeloIngresados.addColumn("Piso");
        modeloIngresados.addColumn("Momento");
        tablaIngresos = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };
        btnPrimerPiso = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        modeloCuarto.addColumn("Nombre");
        modeloCuarto.addColumn("Peso");
        modeloCuarto.addColumn("Momento");
        modeloCuarto.addColumn("Orden");
        tablaCuartoPiso = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };
        jScrollPane4 = new javax.swing.JScrollPane();
        modeloTercero.addColumn("Nombre");
        modeloTercero.addColumn("Peso");
        modeloTercero.addColumn("Momento");
        modeloTercero.addColumn("Orden");
        tablaTercerPiso = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };
        btnSegundoPiso = new javax.swing.JButton();
        btnTercerPiso = new javax.swing.JButton();
        btnCuartoPiso = new javax.swing.JButton();
        barra = new javax.swing.JProgressBar();
        labelAcceso = new javax.swing.JLabel();
        btnRecoger = new javax.swing.JButton();
        barraRecoger = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnLlenarPersonal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(204, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PESO:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 30));

        jLabel2.setText("NOMBRE:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 21, -1, 30));

        jLabel3.setText("CODIGO:");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panel.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 120, 30));
        panel.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 70, 30));
        panel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 30));
        panel.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, 30));

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 410, 170));

        btnADD.setBackground(new java.awt.Color(255, 255, 255));
        btnADD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnADD.setText("+");
        btnADD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });
        jPanel1.add(btnADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        tablaPersonal.setModel(modeloPersonas);
        tablaPersonal.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaPersonal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 180));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("PISOS DISPONIBLES PARA INGRESO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnRecepcion.setBackground(new java.awt.Color(255, 255, 255));
        btnRecepcion.setText("RECEPCION");
        btnRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionActionPerformed(evt);
            }
        });
        jPanel2.add(btnRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        btnPlanta.setBackground(new java.awt.Color(255, 255, 255));
        btnPlanta.setText("PLANTA");
        btnPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantaActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 30));

        btnSistema.setBackground(new java.awt.Color(255, 255, 255));
        btnSistema.setText("SISTEMA");
        btnSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 100, 30));

        label4.setText("4");
        jPanel2.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 20, 20));

        label1.setText("1");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 20, 20));

        label3.setText("3");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 310, 100));

        tablaIngresos.setModel(modeloIngresados);
        tablaIngresos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaIngresos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 310, 200));

        btnPrimerPiso.setBackground(new java.awt.Color(255, 255, 255));
        btnPrimerPiso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrimerPiso.setText("I");
        btnPrimerPiso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrimerPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimerPisoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrimerPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 60, 70));

        tablaCuartoPiso.setModel(modeloCuarto);
        tablaCuartoPiso.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCuartoPiso.getTableHeader().setReorderingAllowed(false);
        tablaCuartoPiso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaCuartoPisoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tablaCuartoPisoFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCuartoPiso);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 280, 100));

        tablaTercerPiso.setModel(modeloTercero);
        tablaTercerPiso.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaTercerPiso.getTableHeader().setReorderingAllowed(false);
        tablaTercerPiso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaTercerPisoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tablaTercerPisoFocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(tablaTercerPiso);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 250, 100));

        btnSegundoPiso.setBackground(new java.awt.Color(255, 255, 255));
        btnSegundoPiso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSegundoPiso.setText("2");
        btnSegundoPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegundoPisoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSegundoPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 60, 70));

        btnTercerPiso.setBackground(new java.awt.Color(255, 255, 255));
        btnTercerPiso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTercerPiso.setText("3");
        btnTercerPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTercerPisoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTercerPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 60, 60));

        btnCuartoPiso.setBackground(new java.awt.Color(255, 255, 255));
        btnCuartoPiso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCuartoPiso.setText("4");
        btnCuartoPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuartoPisoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCuartoPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 60, 60));
        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 240, 30));

        labelAcceso.setText("Subiendo...");
        jPanel1.add(labelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 90, -1));

        btnRecoger.setBackground(new java.awt.Color(255, 255, 255));
        btnRecoger.setText("RECOGER");
        btnRecoger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecoger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecogerActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 330, 100, 30));
        jPanel1.add(barraRecoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 230, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Sin título.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, 400));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 90, 40));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PERSONAL DISPONIBLE");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PERSONAL A INGRESAR");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 270, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 310, 30));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setText("MINIMIZAR");
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, 40));

        btnLlenarPersonal.setBackground(new java.awt.Color(255, 255, 255));
        btnLlenarPersonal.setText("PERSONAL AUTOMATICO");
        btnLlenarPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLlenarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarPersonalActionPerformed(evt);
            }
        });
        jPanel1.add(btnLlenarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        try {
            
            if(txtCodigo.getText().length()==0||txtNombre.getText().length()==0||txtPeso.getText().length()==0){
                
            } else{
                
                Persona p = new Persona(txtNombre.getText(), txtCodigo.getText(), Double.parseDouble(txtPeso.getText()));
                
                ControlPersona.añadirPersona(p);
                ControlPersona.añadirPersTemp(p);
                
                listarPersonas();
                
                nuevo();
                
                panel.setVisible(false);
                
            }
            
        } catch (NumberFormatException e) {
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        
        panel.setVisible(true);
        
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionActionPerformed

        try {
            
            int fs = tablaIngresos.getSelectedRow();
            
            if(fs>=0){

                Persona pe = new Persona(ControlIngreso.getListaIngresosT().get(fs).getPersona().getNombre(),
                        ControlIngreso.getListaIngresosT().get(fs).getPersona().getCodigo(),
                        ControlIngreso.getListaIngresosT().get(fs).getPersona().getPeso());
                
                ControlPersona.añadirPersTemp(pe);
                ControlIngreso.getListaIngresosT().remove(fs);
                
                listarPersonas();
                listarIngreso();
  
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un personal ingresado","Error!",0);
            }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnRecepcionActionPerformed

    private void btnPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantaActionPerformed
        try {
            
            int fs = tablaPersonal.getSelectedRow();
            
            if(fs>=0){
                
                Ingreso n = new Ingreso(ControlPersona.getListaPersonasT().get(fs),
                        ControlPisos.getPisos().get(0),0);
                
                ControlIngreso.añadirIngreso(n);
                ControlIngreso.añadirIngTemp(n);
                
                ControlPersona.getListaPersonasT().remove(fs);
                
                listarIngreso();
                listarPersonas();
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un personal","Error!",0);
            }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnPlantaActionPerformed

    private void btnSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemaActionPerformed
        
        try {
            
            int fs = tablaPersonal.getSelectedRow();
            
            if(fs>=0){
                
                
                Ingreso n = new Ingreso(ControlPersona.getListaPersonasT().get(fs),
                        ControlPisos.getPisos().get(1),0);
                
                ControlIngreso.añadirIngreso(n);
                ControlIngreso.añadirIngTemp(n);
                
                ControlPersona.getListaPersonasT().remove(fs);
                
                listarIngreso();

                listarPersonas();
                
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un personal","Error!",0);
            }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnSistemaActionPerformed

    private void btnPrimerPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimerPisoActionPerformed
       
        try {
            
            if(ControlIngreso.getListaIngresosT().isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay personal a ingresar", "Error!", 0);
            } else{
                
                double tp = 0;
                
                for (int i = 0; i < ControlIngreso.getListaIngresosT().size(); i++) {
                    
                    tp = tp + ControlIngreso.getListaIngresosT().get(i).getPersona().getPeso();
                    
                }
                
                if(tp > 800){
                    
                    JOptionPane.showMessageDialog(null, "El limite de peso es de 800kg","Error",2);
                    
                } else {
            
                for (int i = 0; i < ControlIngreso.getListaIngresosT().size(); i++) {

                    Ingreso in = new Ingreso(ControlIngreso.getListaIngresosT().get(i).getPersona(),
                            ControlIngreso.getListaIngresosT().get(i).getPiso(),
                            Integer.parseInt(tablaIngresos.getValueAt(i, 2).toString()));

                    if(ControlIngreso.getListaIngresosT().get(i).getPiso().getNumero()==3){
                        ControlIngreso.añadirenCola(in);
                    } else{
                        ControlIngreso.añadiralCP(in);
                    }
                }
            
                JOptionPane.showMessageDialog(null, "Ingresados correctamente");
                
                barra.setVisible(true);
                labelAcceso.setVisible(true);
                t.start();
//
                ControlIngreso.getListaIngresosT().clear();
//                listarIngreso();
//                
//                btnSegundoPiso.setVisible(true);
//        
//                btnPrimerPiso.setVisible(false);
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
       
        
    }//GEN-LAST:event_btnPrimerPisoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        try {
            
            ObjectOutputStream per = new ObjectOutputStream(new FileOutputStream("Personal.ddr"));
            ObjectOutputStream ing = new ObjectOutputStream(new FileOutputStream("Ingresados.ddr"));
            ObjectOutputStream pero = new ObjectOutputStream(new FileOutputStream("PersonalOriginal.ddr"));
            ObjectOutputStream ingo = new ObjectOutputStream(new FileOutputStream("IngresosOriginal.ddr"));
            
            per.writeObject(ControlPersona.listaPersonasT);
            ing.writeObject(ControlIngreso.listaIngresosT);
            pero.writeObject(ControlPersona.listaPersonas);
            ingo.writeObject(ControlIngreso.listaIngresos);

            System.exit(0);
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        panel.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSegundoPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegundoPisoActionPerformed

    }//GEN-LAST:event_btnSegundoPisoActionPerformed

    private void btnTercerPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTercerPisoActionPerformed
    
    }//GEN-LAST:event_btnTercerPisoActionPerformed

    private void btnCuartoPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuartoPisoActionPerformed

    }//GEN-LAST:event_btnCuartoPisoActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(MenuAscensor.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        t = new Timer(150, new progreso());
        t1 = new Timer(150, new progreso1());
    }//GEN-LAST:event_formWindowOpened

    private void btnLlenarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarPersonalActionPerformed
        
        ControlPersona.getListaPersonasT().clear();
        
        Persona p1 = new Persona("Luis", "89292", 59.0);
        Persona p2 = new Persona("Diana", "78291", 59.0);
        Persona p3 = new Persona("Pedro", "92893", 96.0);
        Persona p4 = new Persona("Robinson", "01738", 23.0);
        Persona p5 = new Persona("Daniela", "82784", 85.0);
        Persona p6 = new Persona("Maria", "28763", 57.0);
        Persona p7 = new Persona("Johanna", "20927", 12.0);
        Persona p8 = new Persona("Juan", "13040", 125.0);
        Persona p9 = new Persona("David", "27919", 51.0);
        Persona p10 = new Persona("Romeo", "27810", 96.0);
        Persona p11 = new Persona("Jose", "28901", 100.0);
        Persona p12 = new Persona("Hellen", "84792", 32.0);
        Persona p13 = new Persona("Sebastian", "28938", 147.0);
        Persona p14 = new Persona("Leo", "82931", 74.0);
        Persona p15 = new Persona("Eliana", "82103", 84.0);
        Persona p16 = new Persona("Yaneth", "59301", 90.0);
        
        ControlPersona.añadirPersTemp(p1);
        ControlPersona.añadirPersTemp(p2);
        ControlPersona.añadirPersTemp(p3);
        ControlPersona.añadirPersTemp(p4);
        ControlPersona.añadirPersTemp(p5);
        ControlPersona.añadirPersTemp(p6);
        ControlPersona.añadirPersTemp(p7);
        ControlPersona.añadirPersTemp(p8);
        ControlPersona.añadirPersTemp(p9);
        ControlPersona.añadirPersTemp(p10);
        ControlPersona.añadirPersTemp(p11);
        ControlPersona.añadirPersTemp(p12);
        ControlPersona.añadirPersTemp(p13);
        ControlPersona.añadirPersTemp(p14);
        ControlPersona.añadirPersTemp(p15);
        ControlPersona.añadirPersTemp(p16);
        
        ControlPersona.añadirPersona(p1);
        ControlPersona.añadirPersona(p2);
        ControlPersona.añadirPersona(p3);
        ControlPersona.añadirPersona(p4);
        ControlPersona.añadirPersona(p5);
        ControlPersona.añadirPersona(p6);
        ControlPersona.añadirPersona(p7);
        ControlPersona.añadirPersona(p8);
        ControlPersona.añadirPersona(p9);
        ControlPersona.añadirPersona(p10);
        ControlPersona.añadirPersona(p11);
        ControlPersona.añadirPersona(p12);
        ControlPersona.añadirPersona(p13);
        ControlPersona.añadirPersona(p14);
        ControlPersona.añadirPersona(p15);
        ControlPersona.añadirPersona(p16);
        
        listarPersonas();
        
    }//GEN-LAST:event_btnLlenarPersonalActionPerformed

    private void tablaTercerPisoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaTercerPisoFocusGained
        
//        btnRecoger.setEnabled(true);
        
    }//GEN-LAST:event_tablaTercerPisoFocusGained

    private void tablaTercerPisoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaTercerPisoFocusLost
        
//        btnRecoger.setEnabled(false);
//        
//        tablaTercerPiso.clearSelection();
        
    }//GEN-LAST:event_tablaTercerPisoFocusLost

    private void tablaCuartoPisoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaCuartoPisoFocusGained
        
//        btnRecoger.setEnabled(true);
        
    }//GEN-LAST:event_tablaCuartoPisoFocusGained

    private void tablaCuartoPisoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaCuartoPisoFocusLost
        
//        btnRecoger.setEnabled(false);
//        
//        tablaCuartoPiso.clearSelection();
        
    }//GEN-LAST:event_tablaCuartoPisoFocusLost

    private void btnRecogerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecogerActionPerformed
        t1.start();
    }//GEN-LAST:event_btnRecogerActionPerformed


    public void nuevo(){
        
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtPeso.setText(null);
        
    }
    
    public void listarPersonas(){
        
        modeloPersonas.setNumRows(0);
        String datos[] =  new String[3];
        
        for (int i = 0; i < ControlPersona.getListaPersonasT().size(); i++) {
            
            datos[0] = ControlPersona.getListaPersonasT().get(i).getNombre();
            datos[1] = ControlPersona.getListaPersonasT().get(i).getCodigo();
            datos[2] = Double.toString(ControlPersona.getListaPersonasT().get(i).getPeso()) +" Kg";
            
            modeloPersonas.addRow(datos);
        }
        
    }
    
    public void listarIngreso(){
        
        modeloIngresados.setNumRows(0);
        String filas [] = new String[3];
        
        for (int i = 0; i < ControlIngreso.getListaIngresosT().size(); i++) {
            
            filas[0] = String.valueOf(ControlIngreso.getListaIngresosT().get(i).getPersona().getNombre());
            filas[1] = String.valueOf(ControlIngreso.getListaIngresosT().get(i).getPiso().getNumero());
            filas[2] = String.valueOf(i+1);
            
            modeloIngresados.addRow(filas);
            
        }
        
    }
    
    public void listarTercerPiso(){
        
        String datos[] = new String[4];

        modeloTercero.setNumRows(0);

        for (Ingreso ingreso : ControlIngreso.getColaTercerPiso()) {

            int nft = tablaTercerPiso.getRowCount();

            datos[0] = ingreso.getPersona().getNombre();
            datos[1] = ""+ingreso.getPersona().getPeso();
            datos[2] = ""+ingreso.getMomento();
            datos[3] = String.valueOf(nft+1);

            modeloTercero.addRow(datos);

        }
        
    }
    
    public class progreso implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            int n = barra.getValue();
            
            if(n<=25){
                
                btnPrimerPiso.setText("1");
                
                listarIngreso();
                
                btnPrimerPiso.setVisible(true);
                n++;
                barra.setValue(n);
                
            } else if(n>25 && n<=40){
                
                btnSegundoPiso.setVisible(true);
                btnPrimerPiso.setVisible(false);
                n++;
                barra.setValue(n);
                
            } else if (n>40&& n<= 55){
                
                btnTercerPiso.setVisible(true);
                btnSegundoPiso.setVisible(false);
                n++;
                barra.setValue(n);
                
            } else if(n>55 && n<=65){
                
                btnTercerPiso.setVisible(true);
                btnSegundoPiso.setVisible(false);
                n++;
                barra.setValue(n);
                
                listarTercerPiso();
                labelAcceso.setText("Ingresando...");
                
            } else if(n>65 && n<= 80){
                
                btnCuartoPiso.setVisible(true);
                btnTercerPiso.setVisible(false);
                n++;
                barra.setValue(n);
                labelAcceso.setText("Subiendo...");
                
            } else if(n>80 && n<92){
                
                btnCuartoPiso.setVisible(true);
                btnTercerPiso.setVisible(false);
                n++;
                barra.setValue(n);
                
                listarCuartoPiso();
                labelAcceso.setText("Ingresando...");
             
            } else if (n>=92&&n<100){
                
                labelAcceso.setText("Regresando...");
                n++;
                barra.setValue(n);
                
            } else if (n==100) {
                
                t.stop();
                barra.setVisible(false);
                labelAcceso.setVisible(false);
                btnPrimerPiso.setVisible(true);
                btnCuartoPiso.setVisible(false);
                barra.setValue(0);
                btnPrimerPiso.setText("I");
                labelAcceso.setText("Subiendo...");
                
            }

        }
    }
    
    public class progreso1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            int n = barraRecoger.getValue();
            
            int fs3 = tablaTercerPiso.getSelectedRow();
            int fs4 = tablaCuartoPiso.getSelectedRow();
            
            if(n<=25){
                              
                btnPrimerPiso.setVisible(true);
                n++;
                barraRecoger.setValue(n);
                btnPrimerPiso.setText("1");
                
            } else if(n>25 && n<=40){
                
                btnSegundoPiso.setVisible(true);
                btnPrimerPiso.setVisible(false);
                n++;
                barraRecoger.setValue(n);
                
            } else if (n>40&& n<= 55){
                
                btnTercerPiso.setVisible(true);
                btnSegundoPiso.setVisible(false);
                n++;
                barraRecoger.setValue(n);
                
                
                
            } else if(n>55 && n<=65){
                
                
                
                btnTercerPiso.setVisible(true);
                btnSegundoPiso.setVisible(false);
                n++;
                barraRecoger.setValue(n);

                
            } else if(n>65 && n<= 80){
                
                btnCuartoPiso.setVisible(true);
                btnTercerPiso.setVisible(false);
                n++;
                barraRecoger.setValue(n);

                
            } else if(n>80 && n<92){
                
                btnCuartoPiso.setVisible(true);
                btnTercerPiso.setVisible(false);
                n++;
                barraRecoger.setValue(n);

             
            } else if(n==92){
                
                int nfc = tablaIngresos.getRowCount();
                
                Ingreso in = new Ingreso(ControlIngreso.getPilaCuartoPiso().get(fs4).getPersona(),
                        ControlIngreso.getPilaCuartoPiso().get(fs4).getPiso(),
                        nfc+1);
                ControlIngreso.getListaIngresosT().add(in);
                
                ControlIngreso.getPilaCuartoPiso().remove(fs4);
                listarCuartoPiso();
                n++;
                barraRecoger.setValue(n);
                
            }else if (n>92&&n<100){

                n++;
                barraRecoger.setValue(n);
                
            } else if (n==100) {
                
                listarIngreso();
                t1.stop();
                btnPrimerPiso.setVisible(true);
                btnCuartoPiso.setVisible(false);
                barraRecoger.setValue(0);
                btnPrimerPiso.setText("I");
                
            }
            
        }
    }

    public void listarCuartoPiso(){
        
        modeloCuarto.setNumRows(0);
        
        String datos[] = new String[4];

        for (Ingreso ingreso : ControlIngreso.getPilaCuartoPiso()) {
           
            int nfc = tablaCuartoPiso.getRowCount();
            
            datos[0] = ingreso.getPersona().getNombre();
            datos[1] = ""+ingreso.getPersona().getPeso();
            datos[2] = ""+ingreso.getMomento();
            datos[3] = String.valueOf(nfc+1);

            modeloCuarto.addRow(datos);
            
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JProgressBar barraRecoger;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCuartoPiso;
    private javax.swing.JButton btnLlenarPersonal;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnPlanta;
    private javax.swing.JButton btnPrimerPiso;
    private javax.swing.JButton btnRecepcion;
    private javax.swing.JButton btnRecoger;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSegundoPiso;
    private javax.swing.JButton btnSistema;
    private javax.swing.JButton btnTercerPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel labelAcceso;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaCuartoPiso;
    private javax.swing.JTable tablaIngresos;
    private javax.swing.JTable tablaPersonal;
    private javax.swing.JTable tablaTercerPiso;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
