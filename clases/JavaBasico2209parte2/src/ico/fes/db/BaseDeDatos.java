package ico.fes.db;
 
 
import java.sql.*;
 
/**
 *
 * @author unam
 */
public class BaseDeDatos {
 
    String dbPath;
    private Connection conexion;
    private static BaseDeDatos instanciaUnica;
 
    private BaseDeDatos() {
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/poo2022.db";
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión establecida...");
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public static BaseDeDatos getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new BaseDeDatos(); // llamada al constructor
        }else{
            System.out.println("El ejemplar ya existe!");
        }
        return instanciaUnica;
    }
 
    public Connection getConexion() {
        return conexion;
    }
 
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public static void main(String[] args) {
        try {
            Statement stm = new BaseDeDatos().getInstance().getConexion().createStatement();
            ResultSet rst= stm.executeQuery("SELECT * FROM prueba1;");
           
           while(rst.next()){
               System.out.println("Nombre: "+ rst.getString(1));
               System.out.println("Telefono: "+rst.getString(2));
           }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
 
 
}
