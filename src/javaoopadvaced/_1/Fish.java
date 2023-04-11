package src.javaoopadvaced._1;

public class Fish extends Animal {
    private String species;

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
    public String toString() {
        return "Fish{" + "height in cm: " + getHeight() + ", weight in kg: " + getWeight() +
                ", Species: " + species +
                '}';
    }

    public Double swimSpeedMetersPerSecond() {
        double swimSpeed = this.getWeight() * 2;
        return swimSpeed;
    }
}
