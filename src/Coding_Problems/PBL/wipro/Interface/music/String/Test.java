package wipro.Interface.music.String;


public class Test {
    public static void main(String[] args) {
        // Create an instance of Veena and call play() method
        Veena veena = new Veena();
        veena.play();

        // Create an instance of Saxophone and call play() method
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Place the instances in a variable of type Playable and call play() method
        Playable playableVeena = new Veena();
        Playable playableSaxophone = new Saxophone();

        playableVeena.play();
        playableSaxophone.play();
    }
}

