package ejemplointerfaz;

public class EjemploInterfaz {

    public static void main(String[] args) {
        
        MediaPlayer mp = new MediaPlayer();
        mp.play();
        CD cd = new CD();
        cd.play();
        DVD dvd = new DVD();
        dvd.play();
        
    }
}
