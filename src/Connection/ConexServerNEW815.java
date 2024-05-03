package Connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexServerNEW815 {
private java.sql.Connection connection = null;
private java.sql.Connection conn = null;
 private final String url = "jdbc:jtds:sqlserver://";
 private final String serverName = "P580628WS815";
 private final String portNumber = "1433";
 private final String databaseName = "Reports";
 private final String userName = "sa";
 private final String password = "NoDo.,51";
 public static final String DRIVER = "net.sourceforge.jtds.jdbc.Driver";
 private final String selectMethod = "Direct";
 private final String instance = "Reportes";


 public ConexServerNEW815() {}

 private String getConnectionUrl() {
 return "jdbc:jtds:sqlserver://P580628ws815:1433/Reports"+";"+"instance=Reportes";
 }

 private java.sql.Connection getConnection() {
  try {
      JOptionPane.showMessageDialog(null,serverName);
   conn = java.sql.DriverManager.getConnection(getConnectionUrl(),
    userName, password);
   if (conn != null)
     // JOptionPane.showMessageDialog(null,"Conexión exitosa!"); 
       System.out.println("listo");
  } catch (Exception e) {
   e.printStackTrace();
   JOptionPane.showMessageDialog(null,"Error al conectarse al host remoto : " + e.getMessage());
  }
  return conn;
 }
 public Connection conectar(){
        try{
        conn = DriverManager.getConnection(getConnectionUrl(),userName, password);
         if (conn!=null){
        //JOptionPane.showMessageDialog(null,"Conexión a base de datos lista");
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

 

 public void displayDbProperties() {
  java.sql.DatabaseMetaData dm = null;
  java.sql.ResultSet result = null;
  try {
   conn = this.getConnection();
   if (conn != null) {
    dm = conn.getMetaData();
    JOptionPane.showMessageDialog(null,"Driver Information");
            JOptionPane.showMessageDialog(null,"\tDriver Name: " + dm.getDriverName());
                    JOptionPane.showMessageDialog(null,"\tDriver Version: " + dm.getDriverVersion());
                            JOptionPane.showMessageDialog(null,"\nDatabase Information ");
                                    JOptionPane.showMessageDialog(null,"\tDatabase Name: " + dm.getDatabaseProductName());
                                            JOptionPane.showMessageDialog(null,"\tDatabase Version: " + dm.getDatabaseProductVersion());
                                            
    System.out.println("Driver Information");
    System.out.println("\tDriver Name: " + dm.getDriverName());
    System.out.println("\tDriver Version: " + dm.getDriverVersion());
    System.out.println("\nDatabase Information ");
    System.out.println("\tDatabase Name: " + dm.getDatabaseProductName());
    System.out.println("\tDatabase Version: " + dm.getDatabaseProductVersion());

  }}
  catch (Exception e) {
   e.printStackTrace();
  }
  dm = null;
 }

 public void desconectar() {
  try {
   if (conn != null)
    conn.close();
   conn = null;
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 public void princip(){
     ConexServerNEW815 myDbTest = new ConexServerNEW815();
 // myDbTest.displayDbProperties();
 }
         

}
    

