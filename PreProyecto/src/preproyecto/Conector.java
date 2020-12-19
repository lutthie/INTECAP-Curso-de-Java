package preproyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {

    private String driver = "com.mysql.jdbc.Driver"; 
    private String servidor = "localhost"; 
    private String usuario = "root"; 
    private String password = "";
    private String bd = "veterinaria"; 
    private String cadena;
    
    Connection c;
    Statement st;

    public void conectar() {
        
        cadena = "jdbc:mysql://" + servidor + "/" + bd;
        try {
            Class.forName(driver).newInstance();
            c = DriverManager.getConnection(cadena, usuario, password);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public int consultaG(String consulta) { 
        int resultado;
        try {
            this.conectar();
            st = c.createStatement();
            resultado = st.executeUpdate(consulta);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return 0;
        }
        return resultado;

    }

    public ResultSet consultar(String consulta) { 
        try {
            this.conectar();
            ResultSet respuesta = null;
            st = c.createStatement();
            respuesta = st.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public void desconectar() {
        try {
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
