package ejercicioarreglo2;

import javax.swing.JOptionPane;

public class EjercicioArreglo2 {

    public static void main(String[] args) {
        // DECLARANDO VARIABLES
        int d;
        // PIDIENDO LA DIMENSION DEL ARREGLO
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del arreglo: "));
        String a[] = new String[d];
        //Joptionpane.showmessagedialog(null, "texto);
        JOptionPane.showMessageDialog(null, "NOMBRE DE ANIMALES"); //Un titulo en dialogo
        //System.out.println(".: NOMBRES DE ANIMALES :. "); //Un titulo xd
        //PIDIENDO NOMBRES DE ANIMALES
        for(int i = 0; i < d; i++){
            a[i] = JOptionPane.showInputDialog("Ingrese el nombre del animal: ");
        }
        //MOSTRANDO LOS ANIMALES
        System.out.println("Animales ingresados: ");
         for(int i = 0; i < d; i++){
            System.out.print(a[i] + "   ");
        }
         System.out.println("");
    }
}
