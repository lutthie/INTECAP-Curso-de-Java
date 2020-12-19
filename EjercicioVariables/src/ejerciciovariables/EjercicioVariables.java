package ejerciciovariables;

public class EjercicioVariables {
    public static void main(String[] args) {
        byte b = 125;
        short s = 32450;
        int i = 780455;
        long l = 999530678; //<num>l <- la l indica que usamos el rango máximo total de la variable (puede ser mayúscula o minúscula
        float f = 3; //<num>f <- la f indica que expresa decimales y ahi si se pueden agregar los decimales 
        double d = 3.141598; 
        char c = 'H'; //Es de un solo caracter se puede poner en una simple comilla o en código ASCII
        char ascii = 89;
        boolean bo = true;
        System.out.println("\t\tVARIABLES PRIMITIVAS");
        System.out.println("\t   Luisa Fernanda González Morataya");
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char con comilla: " + c + " Char con ascii: " + ascii);
        System.out.println("Boolean: " + bo);   
    }
}
