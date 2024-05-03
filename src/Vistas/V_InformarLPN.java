package Vistas;

import Connection.ConexServerNEW815;
import Connection.ConexionDATA;
import Connection.ConexServerNEW815_100;
import Connection.Equipo;
import administrero.Main;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ec1697
 */
public class V_InformarLPN extends javax.swing.JDialog {

    ConexServerNEW815_100 cs = new ConexServerNEW815_100();
    Connection cc = cs.conectar();
    ConexionDATA data;
    Equipo e = new Equipo();
    String master = e.dameCD();
    ConexServerNEW815 elservidor815 = new ConexServerNEW815();
    Connection ss = elservidor815.conectar(); 
            
    public V_InformarLPN(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
                try{
            Image im = ImageIO.read(new File(".\\img\\cd1.png"));
            this.setIconImage(im);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al cargar icono : "+e);
        }  
        data = new ConexionDATA();
        llenaComboSup();
                cbArea.setSelectedItem(dameArea(master));
        ExcelAdapter myAd = new ExcelAdapter(jTable2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        cbMotivo = new javax.swing.JComboBox<>();
        cbZona = new javax.swing.JComboBox<>();
        cbArea = new javax.swing.JComboBox<>();
        cbSupervisor = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnGuardar.setBackground(new java.awt.Color(51, 53, 94));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Ingresar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setText("ADAPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 53, 94));
        jPanel1.setForeground(new java.awt.Color(51, 53, 94));

        jLabel12.setFont(new java.awt.Font("Perpetua", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("INFORMAR LPN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antigüedad", "Cíclico", "Daño", "Error de sistema", "Ext para cumplir", "Extravío", "Faltante", "Faltante (Paris)", "Hurto", "Incompleto", "No en ubicación", "Tarea canc" }));
        cbMotivo.setSelectedIndex(10);

        cbZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacenamiento", "C&C", "Despacho", "Empaque", "Panal", "Pre-Despacho", "Recepción", "Tránsito", "Ubicación", "-" }));
        cbZona.setSelectedIndex(8);

        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vestuario", "Vest_Paris", "Shelving", "C&C", "Rack" }));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel16.setText("Motivo : ");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel17.setText("Zona :");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel19.setText("Área : ");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel20.setText("Supervisor : ");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Filas : ");

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "LPN", "CANT", "SKU", "DESCRIPCION", "UBIC"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            final int x = Integer.parseInt(jTextField1.getText().replace(" ", ""));
            final DefaultTableModel model = (DefaultTableModel)this.jTable2.getModel();
            model.setNumRows(x);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Favor ingresa n\u00famero de filas.");
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ArrayList <String[]> laMatriz = new ArrayList<>();
        ArrayList <String> losLPN = new ArrayList<>();
       
        String condicionero = " (LPN.ILPN_ID = ''SHEVCHEBKO'' ";
        
        if (this.tieneVacios()) {
            JOptionPane.showMessageDialog(null, "Tiene vacios");
        }
        else if (this.noCorresponde()) {
            JOptionPane.showMessageDialog(null, "Verifica que cantidades y SKU's sean n\u00fameros");
        }
        else if (this.tieneCeros()) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser superior a 0");
        }
        else {
                String motivo = (String)this.cbMotivo.getSelectedItem();
                String zona = (String)this.cbZona.getSelectedItem();
                String area = (String)this.cbArea.getSelectedItem();
                String supervisor = (String)this.cbSupervisor.getSelectedItem();
                
                System.out.println("ESTA ES LA MATRIZ ORIGINAL: ");
                
            for (int i = 0; i < this.jTable2.getRowCount(); ++i) {
                String LPN = this.jTable2.getValueAt(i, 0).toString().replace(" ", "").toUpperCase();
                String SKU = this.jTable2.getValueAt(i, 2).toString().replace(" ", "");
                String DESC = this.jTable2.getValueAt(i, 3).toString().toUpperCase();
                String CANT = this.jTable2.getValueAt(i, 1).toString().replace(" ", "");
                String UBIC = this.jTable2.getValueAt(i, 4).toString().replace(" ", "").toUpperCase();
 
                condicionero = condicionero + " OR LPN.ILPN_ID=''"+LPN+"'' ";
                
                String aux [] = new String [5];
                aux[0]=LPN;aux[1]=SKU;aux[2]=DESC;aux[3]=CANT;aux[4]=UBIC;
                System.out.println(LPN+"\t"+SKU+"\t"+DESC+"\t"+CANT+"\t"+UBIC);
                laMatriz.add(aux);
                losLPN.add(LPN);
            }
                condicionero=condicionero+")";
            validarTodo(laMatriz, losLPN, condicionero, motivo, zona, area, supervisor);
        }
 
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(V_InformarLPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_InformarLPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_InformarLPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_InformarLPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                V_InformarLPN dialog = new V_InformarLPN(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<String> cbMotivo;
    private javax.swing.JComboBox<String> cbSupervisor;
    private javax.swing.JComboBox<String> cbZona;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelDatos;
    // End of variables declaration//GEN-END:variables

     
       public boolean tieneVacios() {
        boolean resp = false;
        for (int i = 0; i < this.jTable2.getRowCount(); ++i) {
            for (int j = 0; j < 5; ++j) {
                if (this.jTable2.getValueAt(i, j) == null) {
                    resp = true;
                }
                else if (this.jTable2.getValueAt(i, j).toString().equals("")) {
                    resp = true;
                }
            }
        }
        return resp;
    }
       
    public boolean tieneCeros() {
        final boolean resp = false;
        for (int i = 0; i < this.jTable2.getRowCount(); ++i) {
                if(Integer.parseInt(this.jTable2.getValueAt(i, 1).toString())<1){
                    return true;
                }
        }
        return resp;
    }

    
    public boolean noCorresponde() {
        final boolean resp = false;
        for (int i = 0; i < this.jTable2.getRowCount(); ++i) {
            try {
                Integer.parseInt(this.jTable2.getValueAt(i, 1).toString());
                Integer.parseInt(this.jTable2.getValueAt(i, 2).toString());
            }
            catch (NumberFormatException ex) {
                return true;
            }
        }
        return resp;
    }

        public boolean lpnYaEstaEnPlanilla(final String LPN) {
        boolean resp = false;
        try {
            final String sql1 = "SELECT LPN FROM MERMA WHERE LPN= ?";
            final PreparedStatement pstm1 = cc.prepareStatement(sql1);
            pstm1.setString(1, LPN);
            final ResultSet r = pstm1.executeQuery();
            while (r.next()) {
                resp = true;
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }
    


       public void llenaComboSup() {
        this.cbSupervisor.removeAllItems();
        try {
            final Connection c = this.data.conectar();
            final String sql1 = "SELECT NOMBRE FROM SUPERVISORES WHERE NOMBRE IS NOT NULL "+dameCondSup(master)+" ORDER BY NOMBRE";
            final PreparedStatement pstm1 = c.prepareStatement(sql1);
            final ResultSet r = pstm1.executeQuery();
            while (r.next()) {
                this.cbSupervisor.addItem(r.getString("NOMBRE").toUpperCase());
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
     public String dameArea(String master){
         String resp ="Shelving";
          try {
            Connection c = this.data.conectar();
            String sql1 = "SELECT AREA FROM CONFIG WHERE CD=?";
            PreparedStatement pstm1 = c.prepareStatement(sql1);
            pstm1.setString(1, master);
            ResultSet r = pstm1.executeQuery();
            if (r.next()) {
                resp=r.getString(1);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }      
          return resp;
     }       
       
     public String dameCondSup(String master){
         String resp ="";
          try {
            Connection c = this.data.conectar();
            String sql1 = "SELECT COND_SUP FROM CONFIG WHERE CD=?";
            PreparedStatement pstm1 = c.prepareStatement(sql1);
            pstm1.setString(1, master);
            ResultSet r = pstm1.executeQuery();
            if (r.next()) {
                resp=r.getString(1);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }      
          return resp;
     }        
     
     public boolean existeEnManhattan(String lpi){
         boolean resp =false;
          try {
            String sql1 = "SELECT LPN FROM LPN WHERE LPN=?";
            PreparedStatement pstm1 = ss.prepareStatement(sql1);
            pstm1.setString(1, lpi);
            ResultSet r = pstm1.executeQuery();
            if (r.next()) {
                resp=true;
                JOptionPane.showMessageDialog(null, "Hola");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }      
          return resp;
     }  
     
    public String dameSKU(String lpi, int jku){
         String resp =""+jku;
          try {
            String sql1 = "SELECT SKU FROM LPN WHERE LPN=?";
            PreparedStatement pstm1 = ss.prepareStatement(sql1);
            pstm1.setString(1, lpi);
            ResultSet r = pstm1.executeQuery();
            if (r.next()) {
                resp=r.getString(1);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }      
          return resp;
     }
    
    public int dameQTY(String lpi, int jant){
         int resp = jant;
          try {
            String sql1 = "SELECT QTY FROM LPN WHERE LPN=?";
            PreparedStatement pstm1 = ss.prepareStatement(sql1);
            pstm1.setString(1, lpi);
            ResultSet r = pstm1.executeQuery();
            if (r.next()) {
                resp=r.getInt(1);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }      
          return resp;
     }    
    
public void validarTodo(ArrayList matriz, ArrayList lpns, String condicionero, String motivo, String zona, String area, String supervisor){
        ArrayList <String[]> matrizFinal = new ArrayList<>();
        System.out.println("ESTA ES LA MATRIZ VALIDA: ");
        try { 
        String sql1 = "SELECT LPN, SKU, QTY FROM OPENQUERY(WMS2, 'SELECT DISTINCT LPN.ILPN_ID as LPN, "
        + "DI.ITEM_ID AS SKU, DI.ON_HAND AS QTY FROM default_dcinventory.DCI_ILPN LPN INNER JOIN "
        + "default_dcinventory.DCI_INVENTORY DI ON DI.INVENTORY_CONTAINER_ID = LPN.ILPN_ID "
        + "WHERE (LPN.STATUS=''3000'') AND "+condicionero+"')";
  
            System.out.println(sql1);
            PreparedStatement pstm1 = ss.prepareStatement(sql1);
            ResultSet r = pstm1.executeQuery();
            while (r.next()) {
                String auz [] = new String [5];
                String LPN_VALIDO=r.getString("LPN");
                int SKU_VALIDO = Integer.parseInt(r.getString("SKU"));
                int QTY_VALIDO = r.getInt("QTY");
                int pos = encontrarPosicionDelLPNenLaMatriz(LPN_VALIDO,matriz);
                String DESCRIPCION = dameDESCORIGINAL(LPN_VALIDO,matriz,pos);
                String UBICACION = dameUBICORIGINAL(LPN_VALIDO,matriz,pos);
                if(QTY_VALIDO<1){
                QTY_VALIDO = dameQTYORIGINAL(LPN_VALIDO,matriz,pos);                   
                }
                auz[0]=LPN_VALIDO;auz[1]=""+SKU_VALIDO;auz[2]=""+QTY_VALIDO;auz[3]=DESCRIPCION;auz[4]=UBICACION;
                System.out.println(LPN_VALIDO+"\t"+SKU_VALIDO+"\t"+QTY_VALIDO+"\t"+DESCRIPCION+"\t"+UBICACION);
                matrizFinal.add(auz);
                lpns.remove(LPN_VALIDO);    
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ACTIVE: "+ex.toString());
        }     

        ingresarLosLPI(matrizFinal, lpns, motivo, zona, area, supervisor);
}
 
public void ingresarLosLPI(ArrayList matrizFinal, ArrayList lpns, String motivo, String zona, String area, String supervisor){
                SimpleDateFormat formatoTXT = new SimpleDateFormat("yyyyMMddHHmmssSSS");
                SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                System.out.println("INGRESANDO :");
    for(int i=0;i< matrizFinal.size();i++){
                String aux[]= (String[])matrizFinal.get(i);
                String LPN = aux[0];
                int SKU = Integer.parseInt(aux[1]);
                String DESCRIPCION = aux[3];
                int CANT = Integer.parseInt(aux[2]);
                String UBICACION = aux[4];
                
                System.out.println(LPN+"\t"+SKU+"\t"+CANT+"\t"+DESCRIPCION+"\t"+UBICACION);
                
                Date da = new Date();
                String fecha = formato.format(da);
    try {

                    String PRI_K0 = "" + SKU;
                    String PRI_K1 = LPN + SKU;
                    String sql3 = "INSERT INTO MERMA (LPN, SKU, DESCRIPCION, MOTIVO, ZONA, CANT, PRI_K0, AREA, FECHA_ACTA, SUPERVISOR, UBIC, PRI_K1) values(?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement guardarStmt = cc.prepareStatement(sql3);
                    guardarStmt.setString(1, LPN);
                    guardarStmt.setInt(2, SKU);
                    guardarStmt.setString(3, DESCRIPCION);
                    guardarStmt.setString(4, motivo);
                    guardarStmt.setString(5, zonero(zona,motivo));
                    guardarStmt.setInt(6, CANT);
                    guardarStmt.setString(7, PRI_K0);
                    guardarStmt.setString(8, area);
                    guardarStmt.setString(9, fecha);
                    guardarStmt.setString(10, supervisor);
                    guardarStmt.setString(11, UBICACION);
                    guardarStmt.setString(12, PRI_K1);
                    if (this.lpnYaEstaEnPlanilla(LPN)) {
                        System.out.println("El LPN '" + LPN + "' ya esta en planilla. Se omitir\u00e1.");
//                        JOptionPane.showMessageDialog(null, "El LPN '" + LPN + "' ya esta en planilla. Se omitir\u00e1.");
                    }
                    else {
                        guardarStmt.executeUpdate();
                    }
                }catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
                    JOptionPane.showMessageDialog(null, "Hay un error : "+ex+". Lamentable." );
                    System.exit(0);
                }
            }
              if(lpns.size()>0){
                    Date rightnow = new Date();
                    crearTXTFail(lpns,formatoTXT.format(rightnow));      
            }else{
                  JOptionPane.showMessageDialog(null, "Finalizado."); 
              }
            dispose();
}
    

public int encontrarPosicionDelLPNenLaMatriz(String lpi, ArrayList matriz){
    int x = 0;
    for(int i=0;i< matriz.size();i++){
        String aux[]= (String[])matriz.get(i);
        if(lpi.equals(aux[0])){
            x=i;
        }
}
   return x; 
}

public int dameQTYORIGINAL(String lpi, ArrayList matriz, int posicion){
    int resp = 0;
    String aux[] = (String []) matriz.get(posicion);
    String cantEnString = aux[3];
    resp = Integer.parseInt(cantEnString);
    return resp;  
}

public String dameDESCORIGINAL(String lpi, ArrayList matriz, int posicion){
    String resp = "";
    String aux[] = (String []) matriz.get(posicion);
    String descreba = aux[2];
    resp = descreba;
    return resp;  
}

public String dameUBICORIGINAL(String lpi, ArrayList matriz, int posicion){
    String resp = "";
    String aux[] = (String []) matriz.get(posicion);
    String ubika = aux[4];
    resp = ubika;
    return resp;  
}

    public void crearTXTFail(ArrayList fracasados, String flecha){
        try{    
    String ruta = ".\\FAILS\\FAIL_"+flecha+".txt"; 
    File archivo = new File(ruta);
    String mensaje = "Finalizado. ";
    BufferedWriter bw;
    bw = new BufferedWriter(new FileWriter(archivo));
    for (int i=0; i<fracasados.size(); i++){
            bw.write(fracasados.get(i).toString()+" no es valido\n");
            mensaje = mensaje + fracasados.get(i).toString()+", ";
    }
    mensaje = mensaje+" invalido(s).";
    bw.close();
    JOptionPane.showMessageDialog(null, mensaje); 
    }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            }
    }

    public String zonero(String zona, String motivo){
    if(motivo.equals("Antigüedad")){
        return "-";
    }else{
        return zona;
        }
    }
    
    
}
