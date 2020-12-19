package ejemploclase;

public class Vehiculos {
    public int pasajero;
    public String combustible;
    public int velocidad;
    public String marca;
    
    public void metodo1(){
        System.out.println("Hola soy un automovil");
    }
    
    private void metodo2(){
        System.out.println("Arranco y me voy!");
    }
    
    //<--- EJEMPLO DEL USO DEL 'THIS' --->
    public void descripcion(){
        int pasajero;
        String marca;
        
        //PARA PODER LLAMAR A LAS VARIABLES QUE YA TENGO    
        marca = this.marca;
        pasajero = this.pasajero;
        
        //LLAMA TAMBIEN METODOS
        this.metodo1();
        this.metodo2();
    }
}
