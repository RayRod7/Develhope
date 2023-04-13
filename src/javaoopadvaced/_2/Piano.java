package src.javaoopadvaced._2;

public class Piano extends Instrument {
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("I can play piano!");
    }
}
