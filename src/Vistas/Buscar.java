/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Connection.ConexServerNEW815_100;
import administrero.Main;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class Buscar extends javax.swing.JDialog {
   
    DefaultTableModel modeloTabla;
    ConexServerNEW815_100 con = new ConexServerNEW815_100();
    //int col;
    String NUM, LPN, SKU, CTN;
    public Buscar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
    }
    
    
    String parametro;
    String forma;
    
    public void modelo (String form){
      
       modeloTabla = new DefaultTableModel( new String[]{"FECHA","N°","SECTOR","LPN","CARTON","SKU","DESCRIPCION","CANT","MOTIVO","ZONA","ActTianel","ActParis","Otro"}, 0) {             
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class,java.lang.Object.class,
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class,
                java.lang.Boolean.class  
                
            };
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }  
        };
        jTable1.setModel(modeloTabla);        
        setFilas(form);   
        TableColumnModel columnModel = jTable1.getColumnModel();
         int anchos[] = {110,80,70,90,90,70,200,30,100,100,50,50,50};
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            jTable1.getColumnModel().getColumn(i).setResizable(false);
        }
        jTable1.getTableHeader().setReorderingAllowed(false); 
        
    
    }
public void setFilas(String form){
    String par="";
    int k=0;
    int nacta=0;
    if(form=="SKU"){
        par = txtSKU.getText().replace(" ","");
        k= Integer.parseInt(par);
    }else if (form=="CARTON"){
        par = txtCTN.getText().toUpperCase().replace(" ", "");
    }else if (form=="LPN"){
        par = txtLPN.getText().toUpperCase().replace(" ", "");
    }else if (form=="NUM_ACTA"){
        par = txtNUM.getText().toUpperCase().replace(" ","");
        nacta = Integer.parseInt(par);
    }else
        JOptionPane.showMessageDialog(null, "Error, contactar a Claudio");

    
	try{            
	String sql = "Select FECHA_ACTA, NUM_ACTA, AREA, LPN, CARTON, SKU, DESCRIPCION, CANT, MOTIVO, ZONA, ActaTianel, ActaParis, OTRO FROM MERMA  WHERE "+ form +"=?";
        Connection c;
            c = con.conectar();
        PreparedStatement pstm = c.prepareStatement(sql);
        if(k==0||nacta==0){
        pstm.setString(1, par);    
        ResultSet rs = pstm.executeQuery();    
        Object datos[] = new Object[12]; //columnas de la consulta           
        while(rs.next()){
        for(int i=0; i<12; i++){
        datos[i] = rs.getObject(i+1);
        }
        modeloTabla.addRow(datos);
        }
        rs.close();     
        }
        else{
        pstm.setInt(1, k);    
        ResultSet rs = pstm.executeQuery();    
        Object datos[] = new Object[12];        
        while(rs.next()){
        for(int i=0; i<12; i++){
        datos[i] = rs.getObject(i+1);
        }
        modeloTabla.addRow(datos);
        }
        rs.close();
        }
        }
        catch (SQLException ex){
Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
JOptionPane.showMessageDialog(null, "Hay un error : "+ex+". Lamentable." );
System.exit(0);
        }
        jTable1.getTableHeader().setReorderingAllowed(true);
        jTable1.setColumnSelectionAllowed(true);
}

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelBuscar = new javax.swing.JPanel();
        txtNUM = new javax.swing.JTextField();
        txtLPN = new javax.swing.JTextField();
        txtSKU = new javax.swing.JTextField();
        txtCTN = new javax.swing.JTextField();
        btnNUM = new javax.swing.JButton();
        btnLPN = new javax.swing.JButton();
        btnSKU = new javax.swing.JButton();
        btnCTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(

        ));
        jTable1.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtNUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNUMActionPerformed(evt);
            }
        });
        txtNUM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNUMKeyPressed(evt);
            }
        });

        txtLPN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLPNKeyPressed(evt);
            }
        });

        txtSKU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSKUKeyPressed(evt);
            }
        });

        txtCTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCTNKeyPressed(evt);
            }
        });

        btnNUM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnNUM.setText("N° acta :");
        btnNUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUMActionPerformed(evt);
            }
        });

        btnLPN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnLPN.setText("LPN :");
        btnLPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLPNActionPerformed(evt);
            }
        });

        btnSKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnSKU.setText("SKU :");
        btnSKU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSKUActionPerformed(evt);
            }
        });

        btnCTN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnCTN.setText("Cartón :");
        btnCTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNUM, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNUM, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLPN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLPN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSKU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNUM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 53, 94));
        jPanel1.setForeground(new java.awt.Color(51, 53, 94));

        jLabel12.setFont(new java.awt.Font("Perpetua", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BUSCAR REGISTRO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Se debe rellenar un campo, cualquiera que sea");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(543, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 439, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUMActionPerformed
        modelo ("NUM_ACTA");               
    }//GEN-LAST:event_btnNUMActionPerformed

    private void btnLPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLPNActionPerformed

        modelo("LPN");       
    }//GEN-LAST:event_btnLPNActionPerformed

    private void btnSKUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSKUActionPerformed
       modelo("SKU");
    }//GEN-LAST:event_btnSKUActionPerformed

    private void btnCTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTNActionPerformed
       modelo("CARTON");
    }//GEN-LAST:event_btnCTNActionPerformed

    private void txtNUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNUMActionPerformed
      
    }//GEN-LAST:event_txtNUMActionPerformed

    private void txtNUMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNUMKeyPressed
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        modelo("NUM_ACTA");     
                    }
    }//GEN-LAST:event_txtNUMKeyPressed

    private void txtLPNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLPNKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        modelo("LPN");     
                    }        
    }//GEN-LAST:event_txtLPNKeyPressed

    private void txtSKUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSKUKeyPressed
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        modelo("SKU");     
                    }     
    }//GEN-LAST:event_txtSKUKeyPressed

    private void txtCTNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCTNKeyPressed
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        modelo("CARTON");     
                    }     
    }//GEN-LAST:event_txtCTNKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Buscar dialog = new Buscar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCTN;
    private javax.swing.JButton btnLPN;
    private javax.swing.JButton btnNUM;
    private javax.swing.JButton btnSKU;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTextField txtCTN;
    private javax.swing.JTextField txtLPN;
    private javax.swing.JTextField txtNUM;
    private javax.swing.JTextField txtSKU;
    // End of variables declaration//GEN-END:variables
}
