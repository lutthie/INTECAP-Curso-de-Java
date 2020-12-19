package ejercicioarraylist;

import java.util.ArrayList;

public class EjercicioArrayList {

    public static void main(String[] args) {
        //Declarando mis ArrayList
        ArrayList<String> nombre = new ArrayList<>();
        ArrayList<String> apellido = new ArrayList<>();
        //Agregando datos a los ArrayList
        //ArrayList nombre
        nombre.add("Luisa");
        nombre.add("Fernanda");
        nombre.add("Evelyn");
        nombre.add("Elise");
        nombre.add("Zoe");
        nombre.add(5, "Mario");
        nombre.add(6, "Marco");
        nombre.add(7, "Felix");
        nombre.add(8, "Carlos");
        nombre.add(9, "Javier");
        //ArrayList apellido
        apellido.add("Gonzalez");
        apellido.add("Morataya");
        apellido.add("Menendez");
        apellido.add("Solis");
        apellido.add("Campos");
        apellido.add(0, "Fernandez");
        apellido.add(1, "Guzman");
        apellido.add(2, "Lopez");
        apellido.add(3, "Velazques");
        apellido.add(4, "Ramirez");
        //Mostrando el size
        System.out.println("- - - - - .: MOSTRANDO EL TAMAÑO :. - - - - -");
        System.out.println("Tamaño de nombre: " + nombre.size());
        System.out.println("Tamaño de apellido: " + apellido.size());
        //Mostrando datos en la posicion n
        System.out.println("- - - - - .: DATOS EN LA POSICION 3, 6 Y 9 :. - - - - -");
        System.out.println("ArrayList nombre:");
        System.out.println("Posicion 3: " + nombre.get(3));
        System.out.println("Posicion 6: " + nombre.get(6));
        System.out.println("Posicion 9: " + nombre.get(9));
        System.out.println("ArrayList apellido:");
        System.out.println("Posicion 3: " + apellido.get(3));
        System.out.println("Posicion 6: " + apellido.get(6));
        System.out.println("Posicion 9: " + apellido.get(9));
        //Comprobar el elemento en la ultima posicion 
        System.out.println("- - - - - .: COMPROBACION DEL EEMENTO DE LA ULTIMA POSICION :. - - - - -");
        System.out.println("Posicion de la ultima ocurrencia de nombre: " + nombre.lastIndexOf("Luisa"));
        System.out.println("Posicion de la ultima ocurrencia de apellido: " + apellido.lastIndexOf("Menendez"));
        //Eliminando un elemento
        System.out.println("- - - - - .: ELIMINANDO SEGUN SU POSICION :. - - - - -");
        System.out.println("Eliminando el nombre: " + nombre.remove(6) + " en la posicion 6.");
        System.out.println("Eliminando el apellido: " + apellido.remove(8) + " en la posicion 8.");
        //Agregando un nuevo elemento
        System.out.println("Agregando el elemento nuevo en nombre:");
        nombre.set(6, "Diego");
        System.out.println("Nuevo elemento 6: " + nombre.get(6));
        System.out.println("Agregando el elemento nuevo en apellido:");
        apellido.set(8, "Poroj");
        System.out.println("Nuevo elemento 8: " + apellido.get(8));
        //Mostrando todo el arreglo
        System.out.println("- - - - - .: MOSTRANDO TODO EL ARREGLO :. - - - - -");
        System.out.println("ArrayList nombre: ");
        for (String s : nombre) {
            System.out.print(s + "  ");
        }
        System.out.println("\nArrayList apellido: ");
        for(String n : apellido){
            System.out.print(n + "  ");
        }
        System.out.println("");
    }
}
