package ejemplointerfaz;

public class MediaPlayer implements Reproduccion {
    @Override //SOBREESCRITURA <-- Ya existe
    public void play() {
        System.out.println("Pulsamos y suena");
    }

    @Override
    public void regresar() {
        System.out.println("Pulsamos y retrocede");
    }

    @Override
    public void stop() {
        System.out.println("Pulsamos y se detiene");
    }

    @Override
    public void adelantar() {
        System.out.println("Pulsamos y avanza");
    }
}
