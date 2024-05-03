
package Vistas;


import Connection.ConexServerNEW815;
import Connection.ConexionDATA;
import Connection.ConexServerNEW815_100;
import Connection.Equipo;
import administrero.Main;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class IngresarActaSalida extends javax.swing.JDialog {
   // Date laFecha = formatoFecha.parse(fechaActa);

    
    
    ConexServerNEW815_100 cs = new ConexServerNEW815_100();
    Connection cc = cs.conectar();
    ConexionDATA data = new ConexionDATA();
    Equipo e = new Equipo();
    String master = e.dameCD();
    ConexServerNEW815 elservidor815 = new ConexServerNEW815();
    Connection ss = elservidor815.conectar();
    
    public IngresarActaSalida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
                try{
            Image im = ImageIO.read(new File(".\\img\\cd1.png"));
            this.setIconImage(im);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al cargar icono : "+e);
        }  
        llenaComboSup();
        comboBoxSector.setSelectedItem(dameArea(master));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblLPN1 = new javax.swing.JLabel();
        txtCarton = new javax.swing.JTextField();
        lblLPN = new javax.swing.JLabel();
        txtLPN = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        lblSKU = new javax.swing.JLabel();
        txtSKU = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        cbSupervisor = new javax.swing.JComboBox<>();
        lblSupervisor = new javax.swing.JLabel();
        lblSector = new javax.swing.JLabel();
        comboBoxSector = new javax.swing.JComboBox<>();
        comboBoxZona = new javax.swing.JComboBox<>();
        lblZona = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        comboBoxMotivo = new javax.swing.JComboBox<>();
        txtUbic = new javax.swing.JTextField();
        lblCantidad1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 53, 94));
        jPanel1.setForeground(new java.awt.Color(51, 53, 94));

        jLabel12.setFont(new java.awt.Font("Perpetua", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LPN EXTRAÍDO A ACTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblLPN1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblLPN1.setText("Cartón :");

        txtCarton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCartonFocusLost(evt);
            }
        });

        lblLPN.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblLPN.setText("LPN :");

        txtLPN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLPNFocusLost(evt);
            }
        });

        lblDescripcion.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblDescripcion.setText("Descripción : ");

        lblSKU.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblSKU.setText("SKU : ");

        txtSKU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSKUActionPerformed(evt);
            }
        });

        txtCantidad.setText("1");
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblCantidad.setText("Cantidad : ");

        cbSupervisor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANGEL SOZA", "CRISTINA GATICA", "DANIELA ANCAHUAIL", "FRANCISCO DIAZ", "INGRID CONTRERAS", "KAREN CORTEZ", "MARIA ARMIJO", "MARJORIE VERGARA", "MARYORI ORELLANA", "SANDRA SALVATIERRA", "SOLEDAD CARRASCO", "YASNA LUCIC", "Sup Paris" }));

        lblSupervisor.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblSupervisor.setText("Supervisor : ");

        lblSector.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblSector.setText("Sector : ");

        comboBoxSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vestuario", "Vest_Paris", "Shelving", "C&C", "Rack" }));

        comboBoxZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C&C", "Despacho", "Empaque", "Panal", "Pre-Despacho", "Recepción", "Tránsito", "Ubicación" }));
        comboBoxZona.setSelectedIndex(7);

        lblZona.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblZona.setText("Zona Daño/Extravío : ");

        lblMotivo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblMotivo.setText("Motivo : ");

        comboBoxMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cíclico", "Daño", "Error de sistema", "Ext para cumplir", "Extravío", "Faltante", "Faltante (Paris)", "Hurto", "Incompleto", "No en ubicación", "Tarea canc" }));
        comboBoxMotivo.setSelectedIndex(9);

        txtUbic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicActionPerformed(evt);
            }
        });

        lblCantidad1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblCantidad1.setText("Ubic picking : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSKU, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLPN1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLPN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLPN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMotivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUbic, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblZona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxZona, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSector, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSupervisor))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxSector, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLPN1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLPN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSKU, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZona, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSector, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnGuardar.setBackground(new java.awt.Color(51, 53, 94));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Ingresar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSKUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSKUActionPerformed
        
    }//GEN-LAST:event_txtSKUActionPerformed

    private void txtLPNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLPNFocusLost
      
    }//GEN-LAST:event_txtLPNFocusLost

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCartonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCartonFocusLost
//        if(txtCarton.getText()==""){
//            }
//        else{
//     String carton = txtCarton.getText().replace(" ","").toUpperCase;
//     String descripcion;
//     String SK;              
//     try {           
//            Connection c=cbd.conectar();           
//            PreparedStatement verificarStmt = c.prepareStatement("SELECT CARTON FROM MERMA WHERE CARTON=?");
//            verificarStmt.setString(1,carton);
//            ResultSet rs = verificarStmt.executeQuery();
//            if (rs.next()){
//                int confirmado = JOptionPane.showConfirmDialog(null,"CARTON ya existe en acta. ¿Desea ingresarlo de todas formas?");
//             if (JOptionPane.OK_OPTION == confirmado){
//                 txtCantidad.grabFocus();
//             }                
//             else
//               dispose();
//                             }                           
//            else{              
//                txtCantidad.grabFocus();                       
//            }   } catch (SQLException ex) {
//            Logger.getLogger(IngresarActaSalida.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "Se ha producido el siguiente error : "+ex);
//        }                                   
//        }  
//        
    }//GEN-LAST:event_txtCartonFocusLost

    private void txtUbicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
play();
    }//GEN-LAST:event_btnGuardarActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {              
                IngresarActaSalida dialog = new IngresarActaSalida(new javax.swing.JFrame(), true);               
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
    private javax.swing.JComboBox<String> cbSupervisor;
    private javax.swing.JComboBox<String> comboBoxMotivo;
    private javax.swing.JComboBox<String> comboBoxSector;
    private javax.swing.JComboBox<String> comboBoxZona;
    public static javax.swing.ButtonGroup grupoBtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidad1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblLPN;
    private javax.swing.JLabel lblLPN1;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblSKU;
    private javax.swing.JLabel lblSector;
    private javax.swing.JLabel lblSupervisor;
    private javax.swing.JLabel lblZona;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCarton;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtLPN;
    private javax.swing.JTextField txtSKU;
    private javax.swing.JTextField txtUbic;
    // End of variables declaration//GEN-END:variables

public void play(){
        if (this.tieneVacios()) {
            JOptionPane.showMessageDialog(null, "Tiene vacios");
        }
        else if (this.noCorresponde()) {
            JOptionPane.showMessageDialog(null, "Verifica que cantidades y SKU's sean n\u00fameros");
        }
        else if (this.tieneCeros()) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser superior a 0");
        }
        else    {
                String motivo = (String)comboBoxMotivo.getSelectedItem();
                String zona = (String)comboBoxZona.getSelectedItem();
                String area = (String)comboBoxSector.getSelectedItem();
                String supervisor = (String)cbSupervisor.getSelectedItem();
    
                String LPN = txtLPN.getText().replace(" ", "").toUpperCase();
                String DESC = txtDescripcion.getText().replace("'", "").toUpperCase();
                String UBIC = txtUbic.getText().replace(" ","").toUpperCase();
                String CANT = txtCantidad.getText().replace(" ", "");
                String SKU = txtSKU.getText().replace(" ", "");
                String CARTON = txtCarton.getText().replace(" ","").toUpperCase();

                String aux [] = new String [6];
                aux[0]=LPN;aux[1]=SKU;aux[2]=DESC;aux[3]=CANT;aux[4]=UBIC;aux[5]=CARTON;
                
                validarTodo(aux, motivo, zona, area, supervisor);
    }
}

public boolean lpnYaEstaEnPlanilla(String LPN) {
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
     
public boolean tieneVacios() {
        boolean resp = false;
            if(txtLPN.getText().replace(" ","").equals("")){
                resp=true;
            }if(txtDescripcion.getText().replace(" ","").equals("")){
                resp=true;
            }if(txtUbic.getText().replace(" ","").equals("")){
                resp=true;
            }   
        return resp;
    }
       
public boolean tieneCeros() {
        final boolean resp = false;
                if(Integer.parseInt(txtCantidad.getText().replace(" ",""))<1){
                    return true;
        }
        return resp;
    }
    
public boolean noCorresponde() {
        boolean resp = false;
            try {
                Integer.parseInt(txtCantidad.getText().replace(" ",""));
                Integer.parseInt(txtSKU.getText().replace(" ",""));
            }
            catch (NumberFormatException ex) {
                return true;
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

public void crearTXTFail(String fracasado, String flecha){
        try{    
    String ruta = ".\\FAILS\\FAIL_"+flecha+".txt"; 
    File archivo = new File(ruta);
    String mensaje = "El ";
    BufferedWriter bw;
    bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(fracasado+" no es valido\n");
            mensaje = mensaje + fracasado+" es ";
    
    mensaje = mensaje+" invalido.";
    bw.close();
    JOptionPane.showMessageDialog(null, mensaje); 
    }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            }
    }
    
public void validarTodo(String aux[], String motivo, String zona, String area, String supervisor){
        System.out.println("ESTE ES EL LPI VALIDO: ");
        String lpnInvalido="";
        String auz [] = new String [6];
    try {
            String sql1 = "SELECT LPN, SKU, QTY FROM LPN WHERE LPN= ?";
            PreparedStatement pstm1 = ss.prepareStatement(sql1);
            pstm1.setString(1, aux[0]);
            ResultSet r = pstm1.executeQuery();
            if(r.next()) {
      
                String LPN_VALIDO = r.getString("LPN");
                int SKU_VALIDO = Integer.parseInt(r.getString("SKU"));
                int QTY_VALIDO = r.getInt("QTY");
                String DESCRIPCION = aux[2];
                String UBICACION = aux[4];
                String CARTON = aux[5];
                if(QTY_VALIDO<1){
                QTY_VALIDO = Integer.parseInt(aux[1]);                 
                }
                auz[0]=LPN_VALIDO;auz[1]=""+SKU_VALIDO;auz[2]=""+QTY_VALIDO;auz[3]=DESCRIPCION;auz[4]=UBICACION;auz[5]=CARTON;
                System.out.println(LPN_VALIDO+"\t"+SKU_VALIDO+"\t"+QTY_VALIDO+"\t"+DESCRIPCION+"\t"+UBICACION+"\t"+CARTON);      
            }else{
                lpnInvalido=aux[0];
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ACTIVE: "+ex.toString());
        }     
        ingresarLPI(auz, lpnInvalido, motivo, zona, area, supervisor);
}

public void ingresarLPI(String aux[], String lpnInvalido, String motivo, String zona, String area, String supervisor) {
    SimpleDateFormat formatoTXT = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    System.out.println("INGRESANDO :");
        
    if(lpnInvalido.length()==0){
        String LPN = aux[0];
        int SKU = Integer.parseInt(aux[1]);
        String DESCRIPCION = aux[3];
        int CANT = Integer.parseInt(aux[2]);
        String UBICACION = aux[4];
        String CARTON = aux[5];
                
        System.out.println(LPN+"\t"+SKU+"\t"+CANT+"\t"+DESCRIPCION+"\t"+UBICACION+"\t"+CARTON);

        Date da = new Date();
        String fecha = formato.format(da);

        try{
                String PRI_K0 = "" + SKU;
                String PRI_K1 = LPN + SKU;
                String sql3 = "INSERT INTO MERMA(CARTON, SKU, DESCRIPCION, MOTIVO, ZONA, CANT, PRI_K0, AREA, FECHA_ACTA, SUPERVISOR, UBIC, PRI_K1, LPN) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement guardarStmt = cc.prepareStatement(sql3);
                guardarStmt.setString(1, CARTON);
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
                guardarStmt.setString(13, LPN);
        if (this.lpnYaEstaEnPlanilla(LPN)) {
              System.out.println("El LPN '" + LPN + "' ya esta en planilla. Se omitir\u00e1.");
//                JOptionPane.showMessageDialog(null, "El LPN '" + LPN + "' ya esta en planilla. Se omitir\u00e1.");
        }
        else {
            guardarStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Finalizado."); 
            dispose();
            }
        }catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "Hay un error : "+ex+". Lamentable." );
            System.exit(0);
        }
    }else{
                Date rightnow = new Date();
                crearTXTFail(lpnInvalido,formatoTXT.format(rightnow));
                txtLPN.grabFocus();
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
