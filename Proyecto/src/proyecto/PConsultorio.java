package proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PConsultorio {
    //Mostrar datos
    public ArrayList<Personas> consultarTabla(){
        ArrayList<Personas> listado = new ArrayList();
        Conector con = new Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM personas");
        try {
            while(rs.next()){
                Personas aux = new Personas();
                aux.setPid(rs.getInt(1));
                aux.setNombre(rs.getString(2));
                aux.setApellido(rs.getString(3));
                aux.setEdad(rs.getInt(4));
                aux.setSexo(rs.getString(5));
                aux.setCorreo(rs.getString(6));
                aux.setTelefono(rs.getInt(7));
                aux.setNacionalidad(rs.getString(8));
                aux.setDepartamento(rs.getString(9));
                aux.setEstudios(rs.getString(10));
                listado.add(aux);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listado;
    }
    //Insertar
    public void insertar(Personas ptbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("INSERT INTO personas (nombre, apellido, edad, sexo, correo, telefono, nacionalidad, departamento, estudios) VALUES (" + 
        "'" + ptbl.getNombre() + "','" + ptbl.getApellido() + "','" + ptbl.getEdad() + "','" + ptbl.getSexo() + "','" + ptbl.getCorreo()+ "','" + ptbl.getTelefono() + "','" + ptbl.getNacionalidad() + "','" + ptbl.getDepartamento()+"','" + ptbl.getEstudios() +"')");
        con.desconectar();
    }
    //Eliminar
    public void eliminar(Personas ptbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("DELETE FROM personas WHERE pid = '" + ptbl.getPid() + "';");
        con.desconectar();
    }
    //Modificar
    public void modificar(Personas ptbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("UPDATE personas SET  nombre = " + 
        "'" + ptbl.getNombre()+ "', apellido = '" + ptbl.getApellido() + "', edad = " + "'" + ptbl.getEdad() + "', sexo = " + ptbl.getSexo() + "', correo = " + ptbl.getCorreo() + "', telefono = " + ptbl.getTelefono() + "', nacionalidad = " + ptbl.getNacionalidad() + "', departamento = " + ptbl.getDepartamento() + "', estudios = " + ptbl.getEstudios() + "'  WHERE pid = " + "'" + ptbl.getPid() + "';");
        con.desconectar();
    }
}
