package ejemplointerfaz;

public interface Reproduccion {
    /*ACA NO SE PERMITEN VARIABLES
    int a;*/
    /* TAMPOCO SE LE PUEDE AGREGAR CUERPO A LOS METODOS
    public void play(){
      <---- ESTE ES EL CUERPO ---->  
    }
    */
    public void play();
    
    public void regresar();
    
    public void stop();
    
    public void adelantar();
}