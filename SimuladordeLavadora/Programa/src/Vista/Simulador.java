
package Vista;

import Controladores.ControlLavadora;
import Controladores.ControlPrenda;
import Modelo.Lavadora;
import Modelo.Prenda;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Simulador extends javax.swing.JFrame {

    static DefaultTableModel modeloPrendas=new DefaultTableModel();
    static DefaultTableModel modeloLavadoras=new DefaultTableModel();
    static DefaultTableModel modeloSimulaciones=new DefaultTableModel();
    
    
    public Simulador() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelLavadoras.setVisible(false);
        panelPrendas.setVisible(false);
        holders();
    }
    
    public void openFace(){
        try {
            Desktop.getDesktop().browse(URI.create("https://www.facebook.com"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnPrendas = new javax.swing.JButton();
        btnLavadoras = new javax.swing.JButton();
        btnSimulacion = new javax.swing.JButton();
        btnFacebook = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelPrendas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadTela = new javax.swing.JTextField();
        txtCodigoPrenda = new javax.swing.JTextField();
        txtTipoPrenda = new javax.swing.JTextField();
        txtColorPrenda = new javax.swing.JTextField();
        txtNivSucioPrenda = new javax.swing.JTextField();
        btnCerrarPrendas = new javax.swing.JButton();
        btnAgregarPrenda = new javax.swing.JButton();
        panelLavadoras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCapacidadPrendas = new javax.swing.JTextField();
        btnCerrarLavadoras = new javax.swing.JButton();
        btnAgregarLavadora = new javax.swing.JButton();
        txtCapacidadQuitarSucio = new javax.swing.JTextField();
        txtMarcaLavadora = new javax.swing.JTextField();
        txtCodigoLavadora = new javax.swing.JTextField();
        txtCapacidadAbarcarTela = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSimulaciones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloPrendas.addColumn("Codigo");
        modeloPrendas.addColumn("Nivel de Sucio");
        tablaPrendas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        modeloLavadoras.addColumn("Codigo");
        modeloLavadoras.addColumn("marca");
        modeloLavadoras.addColumn("CAT");
        modeloLavadoras.addColumn("CQS");
        tablaLavadoras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnPrendas.setBackground(new java.awt.Color(255, 255, 51));
        btnPrendas.setText("PRENDAS");
        btnPrendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrendas.setFocusable(false);
        btnPrendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrendasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPrendas);

        btnLavadoras.setBackground(new java.awt.Color(255, 153, 0));
        btnLavadoras.setText("LAVADORAS");
        btnLavadoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLavadoras.setFocusable(false);
        btnLavadoras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLavadoras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLavadoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLavadorasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLavadoras);

        btnSimulacion.setBackground(new java.awt.Color(153, 255, 153));
        btnSimulacion.setText("SIMULACION");
        btnSimulacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimulacion.setFocusable(false);
        btnSimulacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSimulacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulacionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSimulacion);

        btnFacebook.setBackground(new java.awt.Color(0, 102, 204));
        btnFacebook.setForeground(new java.awt.Color(255, 255, 255));
        btnFacebook.setText("FACEBOOK");
        btnFacebook.setFocusable(false);
        btnFacebook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacebook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebookActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFacebook);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrendas.setBackground(new java.awt.Color(255, 255, 153));
        panelPrendas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelPrendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ingrese datos de la prenda:");
        panelPrendas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        panelPrendas.add(txtCantidadTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, -1));
        panelPrendas.add(txtCodigoPrenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));
        panelPrendas.add(txtTipoPrenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));
        panelPrendas.add(txtColorPrenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, -1));
        panelPrendas.add(txtNivSucioPrenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, -1));

        btnCerrarPrendas.setBackground(new java.awt.Color(255, 153, 153));
        btnCerrarPrendas.setText("Cerrar");
        btnCerrarPrendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarPrendas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCerrarPrendasMouseMoved(evt);
            }
        });
        btnCerrarPrendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarPrendasMouseExited(evt);
            }
        });
        btnCerrarPrendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPrendasActionPerformed(evt);
            }
        });
        panelPrendas.add(btnCerrarPrendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 30));

        btnAgregarPrenda.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregarPrenda.setText("Agregar");
        btnAgregarPrenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPrenda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAgregarPrendaMouseMoved(evt);
            }
        });
        btnAgregarPrenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarPrendaMouseExited(evt);
            }
        });
        btnAgregarPrenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPrendaActionPerformed(evt);
            }
        });
        panelPrendas.add(btnAgregarPrenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 200, 80, 30));

        jPanel1.add(panelPrendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 250));

        panelLavadoras.setBackground(new java.awt.Color(255, 153, 0));
        panelLavadoras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelLavadoras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese datos de la lavadora:");
        panelLavadoras.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        panelLavadoras.add(txtCapacidadPrendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, -1));

        btnCerrarLavadoras.setBackground(new java.awt.Color(255, 153, 153));
        btnCerrarLavadoras.setText("Cerrar");
        btnCerrarLavadoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarLavadoras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCerrarLavadorasMouseMoved(evt);
            }
        });
        btnCerrarLavadoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarLavadorasMouseExited(evt);
            }
        });
        btnCerrarLavadoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarLavadorasActionPerformed(evt);
            }
        });
        panelLavadoras.add(btnCerrarLavadoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 30));

        btnAgregarLavadora.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregarLavadora.setText("Agregar");
        btnAgregarLavadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarLavadora.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAgregarLavadoraMouseMoved(evt);
            }
        });
        btnAgregarLavadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarLavadoraMouseExited(evt);
            }
        });
        btnAgregarLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLavadoraActionPerformed(evt);
            }
        });
        panelLavadoras.add(btnAgregarLavadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 200, 80, 30));
        panelLavadoras.add(txtCapacidadQuitarSucio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, -1));
        panelLavadoras.add(txtMarcaLavadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));
        panelLavadoras.add(txtCodigoLavadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));
        panelLavadoras.add(txtCapacidadAbarcarTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, -1));

        jPanel1.add(panelLavadoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 230, 250));

        tablaSimulaciones.setModel(modeloSimulaciones);
        jScrollPane1.setViewportView(tablaSimulaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 950, 210));

        tablaPrendas.setModel(modeloPrendas);
        jScrollPane2.setViewportView(tablaPrendas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 210, 250));

        tablaLavadoras.setModel(modeloLavadoras);
        jScrollPane3.setViewportView(tablaLavadoras);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 240, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrendasActionPerformed
        panelPrendas.setVisible(true);
    }//GEN-LAST:event_btnPrendasActionPerformed

    private void btnLavadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLavadorasActionPerformed
        panelLavadoras.setVisible(true);
    }//GEN-LAST:event_btnLavadorasActionPerformed

    private void btnCerrarPrendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPrendasActionPerformed
        panelPrendas.setVisible(false);
    }//GEN-LAST:event_btnCerrarPrendasActionPerformed

    private void btnCerrarLavadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarLavadorasActionPerformed
        panelLavadoras.setVisible(false);
    }//GEN-LAST:event_btnCerrarLavadorasActionPerformed

    private void btnAgregarPrendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPrendaActionPerformed
        if(txtCodigoPrenda.getText().equals("Codigo")||
                txtTipoPrenda.getText().equals("Tipo")||
                txtColorPrenda.getText().equals("Tipo")|
                txtNivSucioPrenda.getText().equals("Nivel de sucio")||
                txtCantidadTela.getText().equals("Cantidad de tela")){
            JOptionPane.showMessageDialog(null, "Tiene que llenar todos los campos","Error!",JOptionPane.WARNING_MESSAGE);
        } else{
            
            Prenda p = new Prenda();
            p.setCodigo(txtCodigoPrenda.getText());
            p.setColor(txtColorPrenda.getText());
            p.setTipo(txtTipoPrenda.getText());
            p.setNivelsucio(Integer.parseInt(txtNivSucioPrenda.getText()));
            p.setCantidadtela(Integer.parseInt(txtCantidadTela.getText()));
            p.setPorcentajeLavado(0);
            ControlPrenda.agregar(p);
            mostrarPrendas();
            
        }
    }//GEN-LAST:event_btnAgregarPrendaActionPerformed

    private void btnCerrarPrendasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarPrendasMouseMoved
        btnCerrarPrendas.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnCerrarPrendasMouseMoved

    private void btnCerrarPrendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarPrendasMouseExited
        btnCerrarPrendas.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnCerrarPrendasMouseExited

    private void btnAgregarPrendaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPrendaMouseMoved
        btnAgregarPrenda.setBackground(new Color(0,204,51));
    }//GEN-LAST:event_btnAgregarPrendaMouseMoved

    private void btnAgregarPrendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPrendaMouseExited
        btnAgregarPrenda.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_btnAgregarPrendaMouseExited

    private void btnCerrarLavadorasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarLavadorasMouseMoved
        btnCerrarLavadoras.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnCerrarLavadorasMouseMoved

    private void btnCerrarLavadorasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarLavadorasMouseExited
        btnCerrarLavadoras.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnCerrarLavadorasMouseExited

    private void btnAgregarLavadoraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLavadoraMouseMoved
        btnAgregarLavadora.setBackground(new Color(0,204,51));
    }//GEN-LAST:event_btnAgregarLavadoraMouseMoved

    private void btnAgregarLavadoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLavadoraMouseExited
        btnAgregarLavadora.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_btnAgregarLavadoraMouseExited

    private void btnFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebookActionPerformed
        openFace();
    }//GEN-LAST:event_btnFacebookActionPerformed

    private void btnAgregarLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLavadoraActionPerformed
        if(txtCodigoLavadora.getText().equals("Codigo")||
                txtMarcaLavadora.getText().equals("Marca")||
                txtCapacidadQuitarSucio.getText().equals("Capacidad de quitar sucio")|
                txtCapacidadAbarcarTela.getText().equals("Cantidad de tela que abarca")||
                txtCapacidadPrendas.getText().equals("Cantidad de prendas")){
            JOptionPane.showMessageDialog(null, "Tiene que llenar todos los campos","Error!",JOptionPane.WARNING_MESSAGE);
        } else{
            
            Lavadora l = new Lavadora();
            l.setCodigo(txtCodigoLavadora.getText());
            l.setMarca(txtMarcaLavadora.getText());
            l.setCapacidadAbarcarTela(Integer.parseInt(txtCapacidadAbarcarTela.getText()));
            l.setCapacidadQuitarSucio(Integer.parseInt(txtCapacidadQuitarSucio.getText()));
            l.setCapacidadPrendas(Integer.parseInt(txtCapacidadPrendas.getText()));
            ControlLavadora.agregarL(l);
            mostrarLavadoras();
            
        }
    }//GEN-LAST:event_btnAgregarLavadoraActionPerformed

    private void btnSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulacionActionPerformed
        modeloSimulaciones.setNumRows(0);
        armarTSimulacion();
        Vector fsim = new Vector();
        String cod = modeloLavadoras.getValueAt(tablaLavadoras.getSelectedRow(), 0).toString();
        Lavadora l = ControlLavadora.consultar(cod);
        vuelta(l.getCapacidadQuitarSucio(), l.getCapacidadAbarcarTela(), l.getCapacidadPrendas(), 1, fsim);
    }//GEN-LAST:event_btnSimulacionActionPerformed


    public final void holders(){
        PlaceHolder holder;
        
        //Prendas
        holder = new PlaceHolder(txtCodigoPrenda, "Codigo");
        holder = new PlaceHolder(txtTipoPrenda, "Tipo");
        holder = new PlaceHolder(txtColorPrenda, "Color");
        holder = new PlaceHolder(txtNivSucioPrenda, "Nivel de sucio");
        holder = new PlaceHolder(txtCantidadTela, "Cantidad de tela");
        
        //Lavadoras
        holder = new PlaceHolder(txtCodigoLavadora, "Codigo");
        holder = new PlaceHolder(txtMarcaLavadora, "Marca");
        holder = new PlaceHolder(txtCapacidadQuitarSucio, "Capacidad de quitar sucio");
        holder = new PlaceHolder(txtCapacidadAbarcarTela, "Cantidad de tela que abarca");
        holder = new PlaceHolder(txtCapacidadPrendas, "Cantidad de prendas");
    }
    
    public static void mostrarPrendas(){
        modeloPrendas.setNumRows(0);
        for(int i=0;i<ControlPrenda.getPrendas().size();i++){
            Prenda p=(Prenda) ControlPrenda.getPrendas().get(i);
            String[] filp={p.getCodigo(),p.getNivelsucio()+""};
            modeloPrendas.addRow(filp);
        }
    }
    
     public static void mostrarLavadoras(){
        modeloLavadoras.setNumRows(0);
        for(int i=0;i<ControlLavadora.getLavadoras().size();i++){
            Lavadora p=(Lavadora) ControlLavadora.getLavadoras().get(i);
            String[] filp={p.getCodigo(),p.getMarca(),p.getCapacidadAbarcarTela()+"",""+p.getCapacidadQuitarSucio()};
            modeloLavadoras.addRow(filp);
        }
    }
     
    public void armarTSimulacion(){
        modeloSimulaciones.setColumnCount(0);
         for(int i=0;i<ControlPrenda.getPrendas().size();i++){
            Prenda p=(Prenda) ControlPrenda.getPrendas().get(i);
            modeloSimulaciones.addColumn(p.getCodigo());
        }
    }
    
    public void vuelta(int cqs,int cat,int cp,int c, Vector filsim){
        filsim=new Vector();
        for(int i=0;i<ControlPrenda.getPrendas().size();i++){
            Prenda p = (Prenda) ControlPrenda.getPrendas().get(i);
            int matLavar = p.getCantidadtela()+p.getNivelsucio();
            int telaAbarcada = p.getCantidadtela()-cat*c;
            int sucioSacado = p.getNivelsucio()-cqs*c;
            
            if(telaAbarcada<0){
                telaAbarcada=0;
            }
            
            if(sucioSacado<0){
                sucioSacado=0;
            }
            
            p.setPorcentajeLavado((matLavar-(telaAbarcada+sucioSacado))*100/matLavar);
            c++;
            filsim.add(i, p.getPorcentajeLavado()+" %");            
        }
        modeloSimulaciones.addRow(filsim);
       if(porcetajeTotal()<100){
           vuelta(cqs,cat,cp,c,filsim);
       }else{
           JOptionPane.showMessageDialog(null, "Lavado Completo");
       }
    }
    
    public double porcetajeTotal(){
        double sum=0;
        for(int i=0;i<ControlPrenda.getPrendas().size();i++){
            Prenda p=(Prenda) ControlPrenda.getPrendas().get(i);
            sum=sum+p.getPorcentajeLavado();
        }return sum/ControlPrenda.getPrendas().size();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLavadora;
    private javax.swing.JButton btnAgregarPrenda;
    private javax.swing.JButton btnCerrarLavadoras;
    private javax.swing.JButton btnCerrarPrendas;
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnLavadoras;
    private javax.swing.JButton btnPrendas;
    private javax.swing.JButton btnSimulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panelLavadoras;
    private javax.swing.JPanel panelPrendas;
    private javax.swing.JTable tablaLavadoras;
    private javax.swing.JTable tablaPrendas;
    private javax.swing.JTable tablaSimulaciones;
    private javax.swing.JTextField txtCantidadTela;
    private javax.swing.JTextField txtCapacidadAbarcarTela;
    private javax.swing.JTextField txtCapacidadPrendas;
    private javax.swing.JTextField txtCapacidadQuitarSucio;
    private javax.swing.JTextField txtCodigoLavadora;
    private javax.swing.JTextField txtCodigoPrenda;
    private javax.swing.JTextField txtColorPrenda;
    private javax.swing.JTextField txtMarcaLavadora;
    private javax.swing.JTextField txtNivSucioPrenda;
    private javax.swing.JTextField txtTipoPrenda;
    // End of variables declaration//GEN-END:variables
}
