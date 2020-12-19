package ejercicioforeach;

public class EjercicioForEach {

    public static void main(String[] args) {
        System.out.println("----- Ejercicio 1 -----");
        String[] nombre = {"Luisa", "Fernnda", "Gonzalez", "Morataya"};
        char[] iniciales = {'L', 'F', 'G', 'M'};
        int[] nacimiento = {23, 7, 1998};
        System.out.println("Mostrando 3 arreglos");
        System.out.print("Mi nombre es: ");
        for(String s: nombre){
            System.out.print(s + " ");
        }
        System.out.print("\nMis iniciales son: ");
        for(char c: iniciales){
            System.out.print(c + " ");
        }
        System.out.print("\nNaci el: ");
        for(int i: nacimiento){
            System.out.print(i + "/");
        }
        System.out.println("\n----- Ejercicio 2 -----");
        int[] n1 = {1, 3, 5, 7, 9};
        int[] n2 = {2, 4, 6, 8, 10};
        int suma1 = 0;
        int suma2 = 0;
        System.out.print("Arreglo 1: ");
        for(Integer n: n1){
            System.out.print(n + " ");
            suma1 = suma1 + n;
        }
        System.out.println("\nSuma del arreglo 1: " + suma1);
        System.out.print("\nArreglo 2: ");
        for(Integer n: n2){
            System.out.print(n + " ");
            suma2 = suma2 + n;
        }
        System.out.println("\nSuma del arreglo 2: " + suma2);
    }
}
