package ejemplomatrizinsertar;

import javax.swing.JOptionPane;

public class EjemploMatrizInsertar {

    public static void main(String[] args) {
        //Declarando matriz
        String[][] autos = new String[3][4];
        String jo;
        //Pidiendo datos de la matriz
        for(int i = 0; i <  3; i++){
            for(int j = 0; j < 4; j++){
                jo = JOptionPane.showInputDialog("Ingrese un dato en la posicion " + i + "x" + j);
                autos[i][j] = jo;
            }
        }
        //Mostrar matriz
        System.out.println("----- .:Datos de la matriz:. -----");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(autos[i][j] + "    ");
            }        
            System.out.println("");
        }
    }
}
