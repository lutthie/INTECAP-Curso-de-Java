package ejemploforeach;

public class EjemploForEach {

    public static void main(String[] args) {
        //Creando arreglos
        String[] s = {"a","e","i","o","u"};
        int [] n = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        //Recorrer arregos
        //FOR ( <tipo_variable> <nombre> : <variable> )
        System.out.println("Mostrando STRING");
        for(String st: s){
            System.out.print(st + " ");
        }
        System.out.println("\nMostrando INT");
        for(Integer in: n){
            System.out.print(in + " ");
        }
        System.out.println("\nMOSTRANDO CON EL OBJECT");
        //Si no se que tipo de dato es
        for(Object o: n){
            System.out.print(o + " ");
        }
        System.out.println("");
    }
    
}
