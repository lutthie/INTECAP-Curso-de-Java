package ejercicioarreglos2;

public class EjercicioArreglos2 {

    public static void main(String[] args) {
        int[] numero = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int suma = 0;
        System.out.println("Numeros ingresados: ");
        for(int i = 0; i < 15; i++){
            System.out.print(numero[i] + " ");
            suma = suma + numero[i];
        }
        System.out.println("\nLa suma de los numeros ingresados es: " + suma);
    }
    
}
