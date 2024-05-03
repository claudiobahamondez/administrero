package administrero;

import Connection.ConexionDATA;
import Connection.ConexServerNEW815_100;
import Connection.Equipo;
import Vistas.Buscar;
import Vistas.Cambiar;
import Vistas.IngresarActaSalida;
import Vistas.V_CartonLPN;
import Vistas.V_InformarLPN;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Main extends javax.swing.JFrame {

    ConexServerNEW815_100 con = new ConexServerNEW815_100();
    DefaultTableModel modeloTabla;
    Equipo e = new Equipo();
    String master = e.dameCD();
    ConexionDATA data = new ConexionDATA();
    Connection cxx;
    int xx, xy;

    public Main() {
        initComponents();
        
        jPanel2.setOpaque(false);
        jPanel1.setOpaque(false);
        jPanel1.grabFocus();
        this.setLocationRelativeTo(null);
        
        try {
            Image im = ImageIO.read(new File(".\\img\\cd1.png"));
            this.setIconImage(im);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar icono : " + e);
        }
        
        ImageIcon image1 = new ImageIcon(".\\img\\tianel.png");
        Icon fondoTianel = new ImageIcon(image1.getImage().getScaledInstance(lblTianel.getWidth(), lblTianel.getHeight(), Image.SCALE_DEFAULT));
        lblTianel.setIcon(fondoTianel);
        repaint();
        ImageIcon image = new ImageIcon(".\\img\\paris.png");
        Icon fondoParis = new ImageIcon(image.getImage().getScaledInstance(lblParis.getWidth(), lblParis.getHeight(), Image.SCALE_DEFAULT));
        lblParis.setIcon(fondoParis);
        repaint();
        cxx = con.conectar();
        if (mensajeEspecial().equals("")) {
        } else {
            JOptionPane.showMessageDialog(null, mensajeEspecial());
        }
        actualizarTablaDeSupervisores();
        modelo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTianel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lblParis = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 500));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("—");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 20, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 20, 20));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 53, 94));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PANEL ADMINISTRADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1050, 46));
        getContentPane().add(lblTianel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 382, 100));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("REFRESH");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 600, 260));
        getContentPane().add(lblParis, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 119, 118));

        jButton3.setBackground(new java.awt.Color(51, 53, 94));
        jButton3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Informar Faltante/Extracción");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 53, 94));
        jButton4.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Informar Cartón a Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 53, 94));
        jButton5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 260));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrero/img/background.jpg"))); // NOI18N
        labelFondo.setMaximumSize(new java.awt.Dimension(1050, 500));
        labelFondo.setMinimumSize(new java.awt.Dimension(1050, 500));
        labelFondo.setPreferredSize(new java.awt.Dimension(1050, 500));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });

        jMenu1.setText("Vistas  ");

        jMenuItem2.setText("Buscar registro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Otro  ");

        jMenuItem4.setText("Informar Manualmente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Settings  ");

        jMenuItem1.setText("Cambiar Area");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        V_InformarLPN ias = new V_InformarLPN(this, true);
        ias.setLocationRelativeTo(null);
        ias.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        V_CartonLPN asignar = new V_CartonLPN(this, true);
        asignar.setLocationRelativeTo(null);
        asignar.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Buscar bu = new Buscar(this, true);
        bu.setLocationRelativeTo(null);
        bu.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //modelo();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //   borrarEncontrados();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        IngresarActaSalida ias = new IngresarActaSalida(this, true);
        ias.setLocationRelativeTo(null);
        ias.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modelo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jMenuBar1MousePressed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jMenuBar1MouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Longi lo = new Longi(this, true);
        lo.setLocationRelativeTo(null);
        lo.setVisible(true);
        Cambiar window = new Cambiar(this, true);
        window.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel lblParis;
    private javax.swing.JLabel lblTianel;
    // End of variables declaration//GEN-END:variables

    public void modelo() {
        modeloTabla = new DefaultTableModel(new String[]{"AREA", "N°", "LPN", "CARTON", "SKU", "DESCRIPCION", "QTY"}, 0) {
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class,
                java.lang.Object.class, java.lang.Object.class,
                java.lang.Object.class, java.lang.Object.class,
                java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
        jTable1.setModel(modeloTabla);
        setFilas();
        TableColumnModel columnModel = jTable1.getColumnModel();
        int anchos[] = {80, 75, 105, 105, 95, 250, 40};
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            jTable1.getColumnModel().getColumn(i).setResizable(false);
        }
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setColumnSelectionAllowed(true);
    }

    private void setFilas() {
        try {
            String sql = "Select TOP 100 AREA, NUM_ACTA, LPN, CARTON, SKU, DESCRIPCION, CANT FROM MERMA WHERE NUM_ACTA is not null " + dameCondArea(master) + " ORDER BY ID_REGISTRO DESC";
            PreparedStatement pstm = cxx.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            Object datos[] = new Object[7]; //columnas de la consulta           
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    datos[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(datos);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hay un error : " + ex + ". Lamentable.");
            System.exit(0);
        }
    }

    public String dameCondArea(String master) {
        String resp = "AND (AREA='Shelving')";
        try {
            Connection c = this.data.conectar();
            String sql1 = "SELECT COND_AREA FROM CONFIG WHERE CD=?";
            PreparedStatement pstm1 = c.prepareStatement(sql1);
            pstm1.setString(1, master);
            ResultSet r = pstm1.executeQuery();
            if (r.next()) {
                resp = r.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return resp;
    }

    public String mensajeEspecial() {
        String resp = "";
        try {
            String sql1 = "SELECT MENSAJE FROM MENSAJESESPECIALES";
            PreparedStatement pstm1 = cxx.prepareStatement(sql1);
            ResultSet r = pstm1.executeQuery();
            if (r.next()) {
                resp = r.getString(1);
            }
        } catch (SQLException ex) {
            resp = "";
        }
        return resp;
    }

    public void actualizarTablaDeSupervisores() {
        System.out.println(this.getClass().toString() + ">>" + "actualizarUsuarios");
        try {
            Connection conexionConElAccess = this.data.conectar();
            Connection conexionConElServidor = cxx;
            String sql0, sql1, sql;
            sql = "DELETE FROM SUPERVISORES";
            PreparedStatement ps = conexionConElAccess.prepareStatement(sql);
            ps.executeUpdate();

            sql0 = "SELECT NOMBRE, EMPRESA FROM COMBOBOX_SUPERVISORES ORDER BY NOMBRE";
            PreparedStatement pstm0 = conexionConElServidor.prepareStatement(sql0);
            ResultSet rs0 = pstm0.executeQuery();
            while (rs0.next()) {
                String SUPERVISOR = rs0.getString("NOMBRE");
                String EMPRESA = rs0.getString("EMPRESA");

                sql1 = "INSERT INTO SUPERVISORES(NOMBRE,EMPRESA) VALUES(?,?)";
                PreparedStatement pstm1 = conexionConElAccess.prepareStatement(sql1);
                pstm1.setString(1, SUPERVISOR);
                pstm1.setString(2, EMPRESA);
                pstm1.executeUpdate();
                System.out.println(SUPERVISOR);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Se ha producido el siguente error: " + ex);
        }
    }

}
