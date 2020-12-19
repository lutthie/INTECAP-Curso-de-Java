package ejemploscanner;

import java.util.Scanner; //Podemos utilizar el Scanner gracias a esta libreria

public class EjemploScanner {

    public static void main(String[] args) {
        System.out.println("EJEMPLO CON SCANNER");
        int edad;
        //Scanner <nombre> = new Scanner(system.in) <-- es un objeto entonces hay que construirlo
        Scanner teclado = new Scanner(System.in); 
        
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.println("Su edad es de: " + edad + " años");
    } 
}
