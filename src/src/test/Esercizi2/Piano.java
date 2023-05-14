package src.test.Esercizi2;

public class Piano extends Instrument implements Playable{

    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("piano play");
    }
}