package src.test.Esercizi2;

public abstract class Instrument implements Playable {
    String name;
    String brand;

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public void play() {
    }
}
