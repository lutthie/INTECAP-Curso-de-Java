package ejerciciostring;

public class EjercicioString {

    public static void main(String[] args) {
        System.out.println("EJERCICIO CONCATENANDO STRING\n");
        String nombre = "Luisa Fernanda";
        String apellido = "González Morataya";
        int edad = 21;
        char genero = 'F';
        String estudio = "Ingeniería en sistemas";
        String auto = "Smart fortwo";
        String color = "Celeste";
        String comida = "Dobladas de queso";
        
        System.out.println("Mi nombre es " + nombre + " " + apellido + ".");
        System.out.println("Tengo " + edad + " años, soy del género " + genero + " y estudio " + estudio + ".");
        System.out.println("Mi auto favorito es el " + auto + " y mi color favorito es el " + color + ".");
        System.out.println("Y me encantan las " + comida + "!!!!");
    }
    
}
