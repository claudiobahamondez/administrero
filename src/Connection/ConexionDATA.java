package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionDATA {
   
    
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    
    Connection conn = null;
    public String nomservidor;
    public static final String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    public String nombre=".\\data.accdb";
    public String usuario = "";
    public String clave = "";
    
    public Connection conectar(){
        try{
        conn = DriverManager.getConnection("jdbc:ucanaccess://"+this.nombre,this.usuario,this.clave);
         if (conn!=null){
        System.out.println("Conexión a base de datos listo...");
    }
         
    else if (conn==null)
    {
    throw new SQLException();
    }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }catch (NullPointerException e){
        JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: "+e.getMessage());
    }finally{
    return conn;
    }
    }
    

public void desconectar(){
    conn = null;
    System.out.println("Desconexion a base de datos listo...");
}
}