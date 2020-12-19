package ejercicioarray;

public class EjercicioArray {

    public static void main(String[] args) {
        //---------- DECLARANDO VARIABLES ----------
        //***** STRING *****
        //.: FORMA 1 :.
        String[] nombre = new String[2];
        nombre[0] = "Luisa";
        nombre[1] = "Fernanda";
        //.: FORMA 2 :.
        String[] apellido = {"Gonzalez", "Morataya"};
        //***** CHAR *****
        //.: FORMA 1 :.
        char[] fecha = new char[3];
        fecha[0] = '2';
        fecha[1] = 'J';
        fecha[2] = '8';
        //.: FORMA 2 :.
        char[] iniciales = {'L','F','G','M'};
        //***** DOUBLE *****    
        //.: FORMA 1 :.
        double[] fisico = new double[2];
        fisico[0] = 1.49;
        fisico[1] = 34.5;
        //.: FORMA 2 :.
        double[] presupuesto = {1470.1, 2071.45};
        
        //---------- MOSTRANDO VARIABLES ----------
        //***** STRING *****
        System.out.println("Mostrando el string 'nombre':");
        System.out.print("    Forma normal: ");
        for(int i = 0; i < 2; i++){
            System.out.print(nombre[i] + " ");
        }
        System.out.print("\n    Invertido: ");
        for(int i = 1; i >= 0; i--){
            System.out.print(nombre[i] + " ");
        }
        System.out.println("");
        System.out.println("Mostrando el string 'apellido':");
        System.out.print("    Forma normal: ");
        for(int i = 0; i < 2; i++){
            System.out.print(apellido[i] + " ");
        }
        System.out.print("\n    Invertido: ");
        for(int i = 1; i >= 0; i--){
            System.out.print(apellido[i] + " ");
        }
        System.out.println("\n----------------------------------------");
        //***** CHAR *****
        System.out.println("Mostrando el char 'fecha':");
        System.out.print("    Forma normal: ");
        for(int i = 0; i < 3; i++){
            System.out.print(fecha[i] + "   ");
        }
        System.out.print("\n    Invertido: ");
        for(int i = 2; i >= 0; i--){
            System.out.print(fecha[i] + "   ");
        }
        System.out.println("");
        System.out.println("Mostrando el char 'iniciales'");
        System.out.print("    Forma normal: ");
        for(int i = 0; i < 4; i++){
            System.out.print(iniciales[i] + "   ");
        }
        System.out.print("\n    Invertido: ");
        for(int i = 3; i >= 0; i--){
            System.out.print(iniciales[i] + "   ");
        }
        System.out.println("\n----------------------------------------");
        //***** DOUBLE *****
        System.out.println("Mostrando el double 'fisico':");
        System.out.print("    Forma normal: ");
        for(int i = 0; i < 2; i++){
            System.out.print(fisico[i] + "   ");
        }
        System.out.print("\n    Invertido: ");
        for(int i = 1; i >= 0; i--){
            System.out.print(fisico[i] + "   ");
        }
        System.out.println("");
        System.out.println("Mostrando el double 'presupuesto':");
        System.out.print("    Forma normal: ");
        for(int i = 0; i < 2; i++){
            System.out.print(presupuesto[i] + "   ");
        }
        System.out.print("\n    Invertido: ");
        for(int i = 1; i >= 0; i--){
            System.out.print(presupuesto[i] + "   ");
        }
        System.out.println("");
    }
}
