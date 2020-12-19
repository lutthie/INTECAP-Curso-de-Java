package ejerciciomatrizinsertar;

import javax.swing.JOptionPane;

public class EjercicioMatrizInsertar {

    public static void main(String[] args) {
        //----- PIDIENDO LA DIMENSION DE LA MATRIZ -----
        int f, c; //Variables para el numero de filas (f) y columnas (c)
        f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
        int[][] numeros = new int[f][c];
        //Llenando matriz
        int dato;
        for(int i = 0; i <  f; i++){
            for(int j = 0; j < c; j++){
                dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero en la posicion " + i + "x" + j + ": "));
                numeros[i][j] = dato;
            }
        }
        //Mostranso la matriz
        for(int i = 0; i < f; i++){
            for (int j = 0; j < c; j++){
                System.out.print(numeros[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
