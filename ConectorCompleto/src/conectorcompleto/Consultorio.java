package conectorcompleto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultorio {
    //Union de java y sql
    //Método de tipo ArrayList para obtener todos los datos de una tabla
    public ArrayList<Tabla1> consultarTabla(){
        ArrayList<Tabla1> listado = new ArrayList();
        Conector con = new Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM tabla1");
        try {
            while(rs.next()){
            Tabla1 aux = new Tabla1();
            aux.setId(rs.getInt(1));
            aux.setNombre(rs.getString(2));
            aux.setApellido(rs.getString(3));
            aux.setEdad(rs.getInt(4));
            listado.add(aux);
            
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    return listado;
    }
    
    //Metodo para insertar registro a una tabla de la Base de Datos
    public void insertar(Tabla1 tbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("INSERT INTO tabla1 (id, nombre, apellido, edad) VALUES (" + 
        "'" + tbl.getId()+ "','" + tbl.getNombre() + "','" + tbl.getApellido() + "','"+tbl.getEdad()+"')");
        con.desconectar();
    }
    
    //Método para eliminar un registro de la Base de Datos
    public void eliminar(Tabla1 tbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("DELETE FROM tabla1 WHERE id='"+tbl.getId()+"';");
        con.desconectar();
    }
      public void modificar(Tabla1 tbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("UPDATE tabla1 SET  nombre=" + 
        "'" + tbl.getNombre()+ "',apellido='" + tbl.getApellido() + "', edad="+"'"+tbl.getEdad()+"'  WHERE codigo="+"'"+tbl.getId()+"';");
        con.desconectar();
    }
}
