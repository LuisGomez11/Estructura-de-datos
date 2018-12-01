
package Vista;

import Modelo.Prendas;
import javax.swing.JOptionPane;

public class Añadir_Prenda extends javax.swing.JDialog {

    public Añadir_Prenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("CODIGO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel3.setText("TIPO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel4.setText("COLOR:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel5.setText("TALLA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));
        jPanel1.add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 90, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sueter", "Pantalon", "Medias", "Camisa" }));
        jPanel1.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 90, -1));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(txtCodigo.getText().length()==0||
                txtColor.getText().length()==0||
                txtTalla.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos!","",JOptionPane.ERROR_MESSAGE);
        }else{
        
        Principal_Prendas.listaPrendas.add(new Prendas(txtCodigo.getText(),
                cbTipo.getSelectedItem().toString(),
                txtColor.getText(),
                txtTalla.getText()));
        JOptionPane.showMessageDialog(null, "Prenda registrada correctamente", "Registrada", 1);
        Listar();
        this.dispose();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void Listar(){
        while(Principal_Prendas.modeloSucias.getRowCount() != 0){
            Principal_Prendas.modeloSucias.removeRow(0);
        }
        Principal_Prendas.listaPrendas.forEach((pre) -> {
            Principal_Prendas.modeloSucias.addRow(new Object[]{pre.getCodigo(), pre.getTipo(), pre.getColor(),
                pre.getTalla()});
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
