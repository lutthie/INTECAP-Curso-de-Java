package ejemplowhile;

import java.util.Scanner;

public class EjemploWhile {

    public static void main(String[] args) {
        //---------- EJEMPLO 1 ----------
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        /*while(num >= 0){
            System.out.println("El cuadrado de " + num + " es: " + num*num);
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
        }*/
        //---------- EJEMPLO 2 ----------
        while(num != 0){
            if(num > 0){
                System.out.println("El numero " + num + " es POSITIVO");
            }
            else{
                System.out.println("El numero " + num + " es NEGATIVO");
            }
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
        }
        
    }
    
}
