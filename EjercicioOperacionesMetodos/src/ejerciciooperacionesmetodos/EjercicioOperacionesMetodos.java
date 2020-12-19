package ejerciciooperacionesmetodos;

import java.util.Scanner;

public class EjercicioOperacionesMetodos {

    public static void main(String[] args) {
        Operaciones operar = new Operaciones();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        int res = 0;
        
        System.out.print("Ingrese n1: ");
        operar.n1 = sc.nextInt();
        
        System.out.print("Ingrese n2: ");
        operar.n2 = sc.nextInt();
        
        /*System.out.println("Suma: " + operar.suma());
        System.out.println("Resta: " + operar.resta());
        System.out.println("Multiplicacion: " + operar.multiplicacion());
        System.out.println("Division: " + operar.division());
        System.out.println("Modulo: " + operar.modulo());*/
        //---------- EJERCICIO 2 ----------
        do{
                System.out.println("\t\t.:MENU:.");
                System.out.println("\t1. Mostrar suma");
                System.out.println("\t2. Mostrar resta");
                System.out.println("\t3. Mostrar multiplicacion");
                System.out.println("\t4. Mostrar division");
                System.out.println("\t5. Mostrar modulo");
                System.out.print("\t Elija su opcion: ");
                op = sc.nextInt();
                switch(op){
                    case 1:{
                        System.out.println("La suma es: " + operar.suma());
                        break;
                    }
                    case 2:{
                        System.out.println("La resta es: " + operar.resta());
                        break;
                    }
                    case 3:{
                        System.out.println("La multiplicacion es: " + operar.multiplicacion());
                    }
                    case 4:{
                        System.out.println("La division es: " + operar.division());
                        break;
                    }
                    case 5:{
                        System.out.println("El modulo es: " + operar.modulo());
                        break;
                    }
                }
                System.out.print("Desea mostrar otra operacion? [si=1/n=0] ");
                res = sc.nextInt();
        }while(res==1);
    }
    
}




