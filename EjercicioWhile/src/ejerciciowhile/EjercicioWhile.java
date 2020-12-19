package ejerciciowhile;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        //---------- EJERCICIO 1 ----------
        int num = 0;
        Scanner sc = new Scanner(System.in);
        
        /*System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        while(num != 0){
            if(num%2 == 0){
                System.out.println("El numero " + num + " es PAR.");
            }
            else{
                System.out.println("El numero " + num + " es IMPAR.");
            }
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
        }*/
        //---------- EJERCICIO 2 ----------
        int cont = 0;
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        while(num >= 0){
            //contador que va contando 1 por 1
            cont++;
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
        }
        System.out.println("La cantida de numeros introducidos es: " + cont);
    }
}

