package proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultorioV {
    //Mostrar datos
    public ArrayList<Videojuegos> consultarTabla(){
        ArrayList<Videojuegos> listado = new ArrayList();
        Conector con = new Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM videojuegos");
        try {
            while(rs.next()){
                Videojuegos aux = new Videojuegos();
                aux.setVid(rs.getInt(1));
                aux.setNombre(rs.getString(2));
                aux.setPlataforma(rs.getString(3));
                aux.setGenero(rs.getString(4));
                aux.setFlanzamiento(rs.getInt(5));
                aux.setVer(rs.getFloat(6));
                aux.setDesarrollador(rs.getString(7));
                aux.setClasificacion(rs.getString(8));
                aux.setPeso(rs.getInt(9));
                aux.setLenguaje(rs.getString(10));
                listado.add(aux);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listado;
    }
    //Insertar
    public void insertar(Videojuegos vtbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("INSERT INTO videojuegos (nombre, plataforma, genero, flanzamiento, ver, desarrollador, clasificacion, peso, lenguaje) VALUES (" + 
        "'" + vtbl.getNombre() + "','" + vtbl.getPlataforma() + "','" + vtbl.getGenero() + "','" + vtbl.getFlanzamiento() + "','" + vtbl.getVer()+ "','" + vtbl.getDesarrollador() + "','" + vtbl.getClasificacion() + "','" + vtbl.getPeso()+"','" + vtbl.getLenguaje() + "')");
        con.desconectar();
    }
    //Eliminar
    public void eliminar(Videojuegos vtbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("DELETE FROM videojuegos WHERE vid = '" + vtbl.getVid() + "';");
        con.desconectar();
    }
    //Modificar
    public void modificar(Videojuegos vtbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("UPDATE videojuegos SET  nombre = " + 
        "'" + vtbl.getNombre()+ "', plataforma = '" + vtbl.getPlataforma() + "', genero = " + "'" + vtbl.getGenero() + "', flanzamiento = " + vtbl.getFlanzamiento() + "', ver = " + vtbl.getVer() + "', desarrollador = " + vtbl.getDesarrollador() + "', clasificacion = " + vtbl.getClasificacion() + "', peso = " + vtbl.getPeso() + "', lenguaje = " + vtbl.getLenguaje() + "'  WHERE vid = " + "'" + vtbl.getVid() + "';");
        con.desconectar();
    }
}
