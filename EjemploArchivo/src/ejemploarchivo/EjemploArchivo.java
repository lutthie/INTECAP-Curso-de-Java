package ejemploarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EjemploArchivo {

    public static void main(String[] args) {
        //- - - - - LECTURA DE UN ARCHIVO DE TEXTO - - - - -
        File ruta , ruta1; //Busca el archivo
        FileReader fr, fr1; //Abre el archivo
        BufferedReader br, br1; //Lee su contenido    
        
        try {
            //BUSCANDO EL ARCHIVO
            // La doble diagonal \\ es una busqueda que hace exactamente en la ruta especificada
            ruta = new File("C:\\Users\\MV-JAVA\\Documents\\NetBeansProjects\\EjemploArchivo\\Documendo de Prueba.txt");
            ruta1 = new File("C:\\Users\\MV-JAVA\\Documents\\NetBeansProjects\\EjemploArchivo\\EjercicioOperadores.java"); //Tambien con archivos java!!!
            //Abra el archivo (ruta) <-- es el archivo que se almacena en esa variable
            fr = new FileReader(ruta);
            fr1 = new FileReader(ruta1);
            //Va a leer el archivo en fr
            br = new BufferedReader(fr);
            br1 = new BufferedReader(fr1);
            //Leyendolo en consola
            //System.out.println(br.readLine()); //Solo lee una linea
            //Leyendo todo el archivo
            String lineas; //Variables donde se va a almacenar todo el texto del archivo
            String lineas1;
            while((lineas = br.readLine()) != null){ //Mientras siga habiendo lineas
                System.out.println(lineas);
            }
            while((lineas1 = br1.readLine()) != null){
                System.out.println(lineas1);
            }
        } catch (Exception e) {
            //Obtiene un mensaje que es el posible error que pueda estar surgiendo
            System.err.println(e.getMessage());
        }
        //- - - - - ESCRITURA DE UN ARCHIVO DE TEXTO - - - - -
        FileWriter fw; //Crear y abre el archivo
        PrintWriter pw; //Escribe dentro de el
        try {
            //Creando el archivo y abriendolo
            fw = new FileWriter("C:\\Users\\MV-JAVA\\Documents\\NetBeansProjects\\EjemploArchivo\\PruebaEscritura.txt");
            pw = new PrintWriter(fw);
            //Para escribir dentro del archivo
            pw.println("En el bosque de la China la Chinita se perdió");
            //Cerrar el archivo para que se guarden los cambios realizados
            fw.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}