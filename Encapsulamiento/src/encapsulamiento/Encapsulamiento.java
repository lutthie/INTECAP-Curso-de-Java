/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import java.util.Scanner;

/**
 *
 * @author MV-JAVA
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        Operaciones op = new Operaciones();
        System.out.print("Ingrese primer número: ");
        op.setn1(teclado.nextByte());
        System.out.print("Ingrese segundo número: ");
        op.setn2(teclado.nextByte());
        System.out.println("Qué desea realizar");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("5. RESIDUO");
        System.out.print("Ingrese opción: ");
        opcion = teclado.nextByte();
        switch(opcion){
            case 1:
                System.out.println("El resultado de la suma es: " + op.getsuma());
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + op.getresta());
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + op.getmultiplicacion());
                break;
            case 4:
                System.out.println("El resultado de la división es: " + op.getdivision());
                break;
            case 5:
                System.out.println("El resultado del residuo es: " + op.getresiduo());
                break;
            default:
                System.out.println("Ingrese una opción válida");
        }
    }
    
}
