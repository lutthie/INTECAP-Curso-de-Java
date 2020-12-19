package ejemploclase;

public class EjemploClase {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculos sedan = new Vehiculos();
        sedan.marca = "Toyota";
        sedan.combustible = "Gasolina";
        sedan.pasajero = 5;
        sedan.velocidad = 150;
        Vehiculos pickup = new Vehiculos();
        pickup.marca = "Ford";
        pickup.combustible = "Diesel";
        pickup.pasajero = 2;
        pickup.velocidad = 180;
        Vehiculos microbus = new Vehiculos();
        microbus.marca = "Nissan";
        microbus.combustible = "Diesel";
        microbus.pasajero = 12;
        microbus.velocidad = 150;
        
        System.out.println("Sedan " + sedan.marca);
        sedan.metodo1();
        //sedan.metodo2();
        System.out.println("Pickup " + pickup.marca);
        pickup.metodo1();
        //pickup.metodo2();
        System.out.println("Microbus " + microbus.marca);
        microbus.metodo1();
        //microbus.metodo2();
    }
    
}
