package ejercicioarreglos;

public class EjercicioArreglos {

    public static void main(String[] args) {
        //---------- DECLARANDO ARREGLOS ----------
        int[] enteros = new int[4];
        short[] shorts = new short[4];
        float[] floats = new float[4];
        //---------- AGREGANDO VALORES FORMA 1 ----------
        //********** INT **********
        enteros[0] = 2;
        enteros[1] = 4;
        enteros[2] = 6;
        enteros[3] = 8;
        //********** SHORT **********
        shorts[0] = 10000;
        shorts[1] = 20000;
        shorts[2] = 30000;
        shorts[3] = 31000;
        //********** FLOAT **********
        floats[0] = 3.1f;
        floats[1] = 3.14f;
        floats[2] = 3.141f;
        floats[3] = 3.1416f;
        //---------- AGREGANDO VALORES FORMA 2 ----------
        //********** INT **********
        int[] n = {1, 3, 5, 7};
        //********** SHORT **********
        short[] s = {9000,11000,13000,15000,17000};
        //********** FLOAT **********
        float[] f = {3.1f, 3.14f, 3.141f, 3.1416f,};
        //---------- MOSTRANDO VALORES FORMA 1 ----------
        System.out.println("Mostrando valores de la forma 'UNO POR UNO'");
        //********** INT **********
        System.out.print("Enteros en la posicion 3: " + enteros[3]);
        System.out.print("N en la posición 1: " + n[1]);
        //********** SHORT **********
        System.out.print("Shorts en la posicion 0: " + shorts[0]);
        System.out.println("S en la posicion 3: " + s[3]);
        //********** FLOAT **********
        System.out.println("Floats en la posicion 2: " + floats[2]);
        System.out.println("F en la posicion 0: " + f[0]);
        //---------- MOSTRANDO VALORES FORMA 2 ----------
        System.out.println("Mostrando valores de la forma 'TODOS JUNTOS'");
        //********** INT **********
        for(int i = 0; i < 4; i++ ){
            System.out.println("Enteros: ");
            System.out.println("N: ");
        }
        //********** SHORT **********
        for(int i = 0; i < 4; i++ ){
            System.out.println("Shorts: ");
            System.out.println("S: ");
        }
        //********** FLOAT **********
        for(int i = 0; i < 4; i++ ){
            System.out.println("Floats: ");
        }
    }
    
}
