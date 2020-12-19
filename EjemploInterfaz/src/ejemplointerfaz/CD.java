package ejemplointerfaz;

public class CD implements Reproduccion {
     @Override //SOBREESCRITURA <-- Ya existe
    public void play() {
        System.out.println("Audio puro");
    }

    @Override
    public void regresar() {
        System.out.println("Audio puro");
    }

    @Override
    public void stop() {
        System.out.println("Silencio");
    }

    @Override
    public void adelantar() {
        System.out.println("Audio puro");
    }
}
