package ejercicioarray1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioArray1 {

    public static void main(String[] args) {
        //---------- VARIABLES ----------
        //******** PIDIENDO EL VALOR DE LA DIMENSION DEL ARREGLO ********
        int d;//Dimension
        //Parse convierte el string en entero
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del arreglo: ")); //Va a abrir una ventanita como un messagebox
        String[] m = new String[d]; //Obtiene la dimension ingresada por el usuario
        
        Scanner sc = new Scanner(System.in);
        System.out.println(".: NOMBRES DE MASCOTA :. "); //Un titulo xd
        //******** PIDIENDO VALORES DE CADA BLOQUE ********
        for(int i = 0; i < d; i++){
            System.out.print("Ingrese el nombre de la mascota: ");
            m[i] = sc.next();
        }
        //******** MOSTRANDO DATOS DEL ARREGLO ********
        for(int i = 0; i < d; i++){
            System.out.print(m[i] + "   ");
        }
        System.out.println("");
        
    }
}
