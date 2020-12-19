package ejercicioforanidado;

public class EjercicioForAnidado {

    public static void main(String[] args) {
        //DECLARANDO MATRICES
        String[][] m1 = new String[4][4];
        char[][] m2 = new char[5][3];
        int[][] m3 = new int[3][7];
        //LLENANDO MATRIZ DE TIPO STRING
        //FILA 0
        m1[0][0] = "Caballo";
        m1[0][1] = "Oveja";
        m1[0][2] = "Cerdo";
        m1[0][3] = "Pollo";
        //FILA 1
        m1[1][0] = "Blanco";
        m1[1][1] = "Cafe";
        m1[1][2] = "Rosado";
        m1[1][3] = "Amarillo";
        //FILA 2
        m1[2][0] = "Transporte";
        m1[2][1] = "Ropa";
        m1[2][2] = "Carne";
        m1[2][3] = "Huevos";
        //FILA 3
        m1[3][0] = "Yija";
        m1[3][1] = "Bee";
        m1[3][2] = "Oink";
        m1[3][3] = "Piopio";
        //MOSTRANDO VALORES DE MATRIZ 1
        System.out.println("Matriz STRING");
        //System.out.print(m1[0][1] + " " + m1[1][2] + " " + m1[2][3]);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(m1[i][j] + "   ");            
            }
            System.out.println();
        }
        //LLENANDO MATRIZ TIPO CHAR
        //FILA 0
        m2[0][0] = 'A';
        m2[0][1] = 'B';
        m2[0][2] = 'C';
        //FILA 1
        m2[1][0] = 'X';
        m2[1][1] = 'Y';
        m2[1][2] = 'Z';
        //FILA 2
        m2[2][0] = 'D';
        m2[2][1] = 'E';
        m2[2][2] = 'F';
        //FILA 3
        m2[3][0] = 'U';
        m2[3][1] = 'V';
        m2[3][2] = 'W';
        //FILA 4
        m2[4][0] = 'G';
        m2[4][1] = 'H';
        m2[4][2] = 'I';
        //MOSTRANDO VALORES DE MATRIZ 2
        System.out.println("\nMATRIZ CHAR");
        //System.out.print(m2[0][1] + " " + m2[1][2] + " " + m2[4][2]);
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m2[i][j] + "   ");            
            }
            System.out.println();
        }
        //LLENANDO MATRIZ TIPO INT
        //FILA 0
        m3[0][0] = 2;
        m3[0][1] = 4;
        m3[0][2] = 6;
        m3[0][3] = 8;
        m3[0][4] = 10;
        m3[0][5] = 12;
        m3[0][6] = 14;
        //FILA 1
        m3[1][0] = 3;
        m3[1][1] = 6;
        m3[1][2] = 9;
        m3[1][3] = 12;
        m3[1][4] = 15;
        m3[1][5] = 18;
        m3[1][6] = 21;
        //FILA 2
        m3[2][0] = 4;
        m3[2][1] = 8;
        m3[2][2] = 12;
        m3[2][3] = 16;
        m3[2][4] = 20;
        m3[2][5] = 24;
        m3[2][6] = 28;
        System.out.println("\nMATRIZ INT");
        //System.out.print(m3[0][6] + " " + m3[1][4] + " " + m3[2][2]);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(m3[i][j] + "   ");            
            }
            System.out.println();
        }
    }
}
