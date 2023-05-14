package src.test.Esercizi1;

public class Fish extends Animal{
    String species;

    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public Double speedMetersPerSecond() {
        double fishSwim = getWeight() * 2;
        return fishSwim;
    }
}
