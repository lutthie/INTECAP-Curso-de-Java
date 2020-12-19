package ejemplohashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class EjemploHashTable {

    public static void main(String[] args) {
        //DECLARANDO HASHTABLE
        Hashtable<Integer,String> hash1 = new Hashtable<>();
        //agreganole valores
        hash1.put(1001, "Avengers EndGame");
        hash1.put(1002, "Joker");
        hash1.put(1003, "Avatar");
        hash1.put(1004, "Sueños de Fuh");
        hash1.put(1005, "Minions");
        //Mostrando datos
        System.out.println(hash1.get(1005));
        System.out.println(hash1.get(1003));
        //Recorriendo hashtable por medio de elementos
        Enumeration<String> datos = hash1.elements();
        while(datos.hasMoreElements()){ //Ingresan como el tipo pila
            System.out.println(datos.nextElement());
        }
        //Recorriendo hashtable por medio de llaves (Mostrar llaves)
        Enumeration<Integer> llaves = hash1.keys();
        while(llaves.hasMoreElements()){
            System.out.println(llaves.nextElement());
        }
    }
}
