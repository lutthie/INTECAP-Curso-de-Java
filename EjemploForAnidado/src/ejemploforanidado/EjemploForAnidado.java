package ejemploforanidado;

public class EjemploForAnidado {

    public static void main(String[] args) {
        //Declarando mi matriz
        int[][] m1 = new int[2][4];
        //LLenando matriz .: FORMA 1 :.
        //Primera fila
        m1[0][0] = 100;
        m1[0][1] = 200;
        m1[0][2] = 300;
        m1[0][3] = 400;
        //Segunda fila
        m1[1][0] = 500;
        m1[1][1] = 600;
        m1[1][2] = 700;
        m1[1][3] = 800;
        //ACCEDIENDO A DATOS
        /*System.out.println(m1[0][1]);
        System.out.println(m1[1][2]);
        System.out.println(m1[0][3]);
        System.out.println(m1[1][3]);*/
        //RECORRIENDO MATRIZ
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
