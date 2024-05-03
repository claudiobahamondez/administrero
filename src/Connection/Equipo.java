package Connection;

import Vistas.Buscar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Equipo {
     ConexionDATA data = new ConexionDATA();
     
     public String dameCD(){
         String resp ="SHELVING";
          try {
            Connection c = this.data.conectar();
            String sql1 = "SELECT AREA FROM CD WHERE ID=1";
            PreparedStatement pstm1 = c.prepareStatement(sql1);
            ResultSet r = pstm1.executeQuery();
            if (r.next()) {
                resp=r.getString("AREA").toUpperCase();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }      
          return resp;
     }
     
       
    }
     
     
     
     
    

