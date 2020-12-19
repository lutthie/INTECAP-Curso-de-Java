package ejemplointerfaz;

public class DVD implements Reproduccion{

    @Override //SOBREESCRITURA <-- Ya existe
    public void play() {
        System.out.println("Audio y video");
    }

    @Override
    public void regresar() {
        System.out.println("Audio y video");
    }

    @Override
    public void stop() {
        System.out.println("Solo muestra imagen");
    }

    @Override
    public void adelantar() {
        System.out.println("Audio y video");
    }
}
