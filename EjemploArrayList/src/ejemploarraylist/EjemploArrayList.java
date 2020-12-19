package ejemploarraylist;

import java.util.ArrayList;

public class EjemploArrayList {

    public static void main(String[] args) {
        //Creando el ArrayList
        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        
        //Añadiendo elementos
        //- - - - - ARRAYLIST 1 - - - - -
        //Forma 1 (Sin posicion)
        al1.add("Guatemala");
        al1.add("El Salvador");
        //Forma 2 (Con posicion)
        al1.add(0, "Honduras");
        al1.add(1, "Nicaragua");
        //- - - - - ARRAYLIST2 - - - - - 
        //Forma 1 (Sin posicion)
        al2.add(10);
        al2.add(20);
        //Forma 2 (Con posicion)
        al2.add(0, 30);
        al2.add(1, 40);
        al2.add(2, 10);
        
        //Tanaño del arraylist
        System.out.println("- - - - - TAMAÑO DEL ARRAYLIST - - - - -");
        System.out.println("Tamaño de ArrayList1: " + al1.size());
        System.out.println("Tamaño de ArrayList2: " + al2.size());
        
        //Mostrar elementos de posiciones
        System.out.println("- - - - - ELEMENTOS SEGUN SU POSICION - - - - -");
        //Van entrando como en una pila
        System.out.println(al1.get(0));
        System.out.println(al1.get(3)); 
        System.out.println(al2.get(1));
        System.out.println(al2.get(2));
        //Buscando si existe un elemento
        System.out.println("- - - - - VERIFICANDO ELEMENTOS - - - - -");
        System.out.print("Existirá el elemento " + al1.contains("Nicaragua") + " ? ");
        System.out.print("Existirá el elemento " + al1.contains("guate") + " ? ");
        System.out.println("Existirá el elemento " + al2.contains(1) + " ? ");
        System.out.println("Existirá el elemento " + al2.contains(40)+ " ? ");
        
        //Mostranso la posicion de la primera ocurrencia
        System.out.println("- - - - - MOSTRAR LA POSICION DE LA PRIMERA OCURRENCIA - - - - -");
        System.out.println("Posicion de 'Guatemala': " + al1.indexOf("Guatemala"));
        System.out.println("Posicion de '10': " + al2.indexOf(10));
        System.out.println("Posicion inexistende de 'guate': " + al1.indexOf("guate"));
        //Mostrar posicion de la ultima ocurrencia
        System.out.println("- - - - - MOSTRAR LA POSICION DE LA ULTIMA OCURRENCIA - - - - -");
        System.out.println(al1.lastIndexOf("Guatemala"));
        System.out.println(al2.lastIndexOf(10));
        System.out.println(al1.lastIndexOf("Ciudad"));
        
        //REMOVER por medio de su elemento
        System.out.println(al1.remove(0));
        System.out.println(al2.remove(2));
        
        //Remover con elemento
        System.out.println(al1.remove("El Salvador"));
        //System.out.println(al2.remove("30")); //Si solo pongo el numero, lo va a tomar como una posicion
        
        //ver si esta vacia el arraylist
        System.out.println("ESTARA VACIO?");
        System.out.println(al1.isEmpty());
        System.out.println(al2.isEmpty());
        
        al1.clear();
        al2.clear();
        
        System.out.println("CLEAR APLICADO");
        System.out.println(al1.isEmpty());
        System.out.println(al2.isEmpty());
        
        //Mostrando el arreglo
        for (String s : al1) {
            System.out.println(s);
        }
        for (Integer in : al2) {
            System.out.println(in);
        }
    }
}