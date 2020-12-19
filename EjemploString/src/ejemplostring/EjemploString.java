package ejemplostring;

public class EjemploString {

    public static void main(String[] args) {
        //-------------------- EJEMPLOS CON STRING --------------------
        System.out.println("\t\tEJEMPLOS CON STRING");
        System.out.println("\t   Luisa Fernanda González Morataya");
        
        String cadena1 = "Guatemala ";
        String cadena2 = "tu nombre inmortal ";
        String cadena3 = "tan taran tan tan";
        String cadena4 = "ANTIGUA GUATEMALA";
        String cadena5 = "Guatemala ";
        //---------- Concatenando strings ----------
        System.out.println("Concatenando strings: ");
        System.out.println("Porcion del Himno Nacional de Guatemala"
                + " --- " + cadena1 + " " + cadena2 + cadena3);
        
        //---------- Contar el tamaño ----------
        System.out.println("Contando el tamaño de los string: ");
        System.out.println("Tamaño de cadena1: " + cadena1.length());
        System.out.println("Tamaño de cadena2: " + cadena2.length());
        System.out.println("Tamaño de cadena3: " + cadena3.length());
        
        //---------- Remplazar ----------
        System.out.println("Remplazando datos de la cadena: ");
        System.out.println("Cambiando valores de cadena1: " + cadena1.replace("mala", "buena"));
        System.out.println("Cambiando valores de cadena2: " + cadena2.replace("nombre", "apellido"));
        
        //---------- Extraer ----------
        System.out.println("Extrayendo datos siguientes depende del entero: ");
        System.out.println("Primer substring: ");
        System.out.println("Extrayendo los primeros 5 caracteres de cadena1: " + cadena1.substring(5));
        System.out.println("Extrayendo una porcion de la cadena2: " + cadena2.substring(6, 9));
        
        //---------- Comparar cadenas ----------
        System.out.println("Comparando cadenas de caracteres: ");
        System.out.println("¿Cadena1 es igual a cadena5? " + cadena1.equals(cadena5));
        
        //---------- Mayusculas a minusculas o viceversa ----------
        System.out.println("Convirtiendo cadenas de mayusculas a minúsculas o viceversa: ");
        System.out.println("De minúscula a mayúscula: " + cadena3.toUpperCase());
        System.out.println("De mayúscula a minúscula: " + cadena4.toLowerCase());
    }
    
}
