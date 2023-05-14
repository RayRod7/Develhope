package src.test.Esercizi2;

public class Guitar extends Instrument implements Playable{

    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("guitar play");
    }
}
