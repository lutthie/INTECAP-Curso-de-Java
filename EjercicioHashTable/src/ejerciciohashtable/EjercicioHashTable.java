package ejerciciohashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class EjercicioHashTable {

    public static void main(String[] args) {
        Hashtable<String,String> paises = new Hashtable<>();
        
        paises.put("GT", "Guatemala");
        paises.put("JP", "Japon");
        paises.put("BR", "Brazil");
        paises.put("CR", "Costa Rica");
        paises.put("CO", "Colombia");
        System.out.println("- - - - - MOSTRANDO 2 PAISES POR SU DOMINIO - - - - -");
        System.out.println("GT: " + paises.get("GT"));
        System.out.println("JP: " + paises.get("JP"));
        
        Enumeration<String> elementos = paises.elements();
        Enumeration<String> llaves = paises.keys();
        System.out.println("- - - - - MOSTRANDO TODOS LOS PAISES CON SU DOMINIO - - - - -");
        while(elementos.hasMoreElements()){ 
            while(llaves.hasMoreElements()){
                System.out.println(llaves.nextElement() + " - " + elementos.nextElement());
            }
        }
    }   
}