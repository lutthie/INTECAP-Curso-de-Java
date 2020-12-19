package ejerciciooperacionesmetodos;

public class Operaciones {
    //---------- VARIABLES ----------
    public int n1;
    public int n2;
    
    //---------- METODOS ----------
    public int suma(){
        int suma = n1 + n2;
        return suma;
    }
    
    public int resta(){
        int resta = n1 - n2;
        return resta;
    }
    
    public int multiplicacion(){
        int multiplicacion = n1 * n2;
        return multiplicacion;
    }
    
    public double division(){
        double division = n1 / n2;
        return division;
    }
    
    public double modulo(){
        double modulo = n1%n2;
        return modulo;
    }
}
