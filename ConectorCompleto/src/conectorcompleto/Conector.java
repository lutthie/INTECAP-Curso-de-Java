package conectorcompleto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {

    //Declaracion de variables principales del conector con acceso privado
    private String driver = "com.mysql.jdbc.Driver"; //Es el nombre del archivo JAR, sin la version para que sea compatible con el que sea ".Driver"
    private String servidor = "localhost"; 
    private String usuario = "root"; 
    private String password = "";
    private String bd = "muestra"; //Nomnbre de la base de datos
    private String cadena;

    //Objetos de conexion
    //Permite realizar la conexión con la base de datos
    Connection c;
    //Permite procesar una sentencia SQL y obtener los resultados producidos
    Statement st; //Ingresa codigo sql en el java

    //Método para la conexion con la Base de Datos
    public void conectar() {
        
        cadena = "jdbc:mysql://" + servidor + "/" + bd;
        try {
            Class.forName(driver).newInstance();
            c = DriverManager.getConnection(cadena, usuario, password);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    //Método para realizar todo tipo de consultas a la Base de Datos
    public int consultaG(String consulta) { //insertamos
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

    //Objeto ResultSet este tien varios métodos que nos permite obtener 
    //varios datos de una columna correspondiente a una fila
    public ResultSet consultar(String consulta) { //mostrar datos
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

    //Método para desconectarse de la Base de Datos
    public void desconectar() {
        try {
            c.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
