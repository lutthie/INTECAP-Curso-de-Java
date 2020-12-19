package preproyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultorio {
    
    public ArrayList<Gatos> consultarTabla(){
        ArrayList<Gatos> listado = new ArrayList();
        Conector con = new Conector();
        con.conectar();
        ResultSet rs = con.consultar("SELECT * FROM gatos");
        try {
            while(rs.next()){
            Gatos aux = new Gatos();
            aux.setId(rs.getInt(1));
            aux.setNombre(rs.getString(2));
            aux.setRaza(rs.getString(3));
            aux.setEdad(rs.getInt(4));
            aux.setDiagnostico(rs.getString(5));
            listado.add(aux);
            
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listado;
    }
    
    public void insertar(Gatos gtbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("INSERT INTO gatos (nombre, raza, edad, diagnostico) VALUES (" + 
        "'"  + gtbl.getNombre() + "','" + gtbl.getRaza() + "','" + gtbl.getEdad() + "','" + gtbl.getDiagnostico() + "')");
        con.desconectar();
    }
    
    public void eliminar(Gatos gtbl) {
        Conector con = new Conector();
        con.conectar();
        con.consultaG("DELETE FROM gatos WHERE id='"+gtbl.getId()+"';");
        con.desconectar();
    }
}
