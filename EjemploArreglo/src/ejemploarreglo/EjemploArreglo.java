package ejemploarreglo;

public class EjemploArreglo {

    public static void main(String[] args) {
        //DECLARACION DE ARREGLOS
        //---------- CON ENTEROS ----------
        int[] notas  = new int[4];
        //FORMA 1 DE LLENAR EL ARREGLO
        notas[0] = 61;
        notas[1] = 84;
        notas[2] = 60;
        notas[3] = 95;
        // OTRA FORMA DE RELLENAR EL ARREGLO -- NO RECOMENDABLE --
        int[] n = {1, 8, 2, 3, 6, 4, 9, 7, 8, 5, 1, 2, 30};
        //Como acceder a los datos uno por uno
        System.out.println("Recorrido uno por uno: ");
        System.out.print("Recorrido notas: ");
        System.out.println(notas[2]);
        System.out.print("Recorrido de n: ");
        System.out.println(n[11]);
        //TODO JUNTO
        System.out.println("Recorrido de notas:");
        for(int i = 0; i < 4; i++){
            System.out.print(notas[i] + " ");
        }
        System.out.println("");
        System.out.println("Recorrido de n:");
        for(int i = 0; i < 13; i++){
            System.out.print(n[i] + " ");
        }
            //---------- CON CHAR ----------
        char[] secciones = new char[3];
       
        secciones[0] = 'A';
        secciones[1] = 'B';
        secciones[2] = 'C';
        char[] s = {'D', 'E', 'F', 'G'};
        
        System.out.println("Recorrido uno por uno: ");
        System.out.print("Recorrido de secciones: ");
        System.out.println(secciones[1]);
        System.out.print("Recorrido de s: ");
        System.out.println(s[2]);
        System.out.println("Recorrido de todos");
    }
}
