package ejercicioscanner;

import java.util.Scanner;

public class EjercicioScanner {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        int telefono;
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese su apellido: ");
        apellido = teclado.next();
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.print("Ingrese su telefono: ");
        telefono = teclado.nextInt();
        
        System.out.println("\nSu nombre es " + nombre + " " + apellido + "\nSu edad es de: " + edad + "años.");
        System.out.println("Y su telefono es: " + telefono + ".");
    }
    
}
