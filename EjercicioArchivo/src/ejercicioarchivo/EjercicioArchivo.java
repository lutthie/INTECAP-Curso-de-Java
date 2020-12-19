package ejercicioarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EjercicioArchivo {

    public static void main(String[] args) {
        // - - - - - CREANDO EL ARCHIVO - - - - -
        FileWriter abrir; 
        PrintWriter archivo;
        
        try {
            int n = 0;
            abrir = new FileWriter("C:\\Users\\MV-JAVA\\Documents\\NetBeansProjects\\EjercicioArchivo\\Documento.txt");
            archivo = new PrintWriter(abrir);
            archivo.println("Nombre: Luisa González");
            archivo.println("Ciudad: Guatemala");
            archivo.println("Recorrido del 0 al 100");
            do {                
                archivo.print(n + " "); //Pude usar un for xd
                n++;
            } while (n < 101);
            archivo.println("\nRecorrido del 100 al 0");
            n = n - 1;
            while (n >= 0){
                archivo.print(n + " ");
                n--;
            }
            abrir.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // - - - - - LEYENDO EL ARCHIVO - - - - -
        File buscar; 
        FileReader open; 
        BufferedReader lee;
        
        try {
            buscar = new File("C:\\Users\\MV-JAVA\\Documents\\NetBeansProjects\\EjercicioArchivo\\Documento.txt");
            open = new FileReader(buscar);
            lee = new BufferedReader(open);
            
            String lectura; 
            while((lectura = lee.readLine()) != null){ 
                System.out.println(lectura);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
