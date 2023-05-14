package src.test.Esercizi1;

public class Dog extends Animal{
    private String breed;

    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public Double speedMetersPerSecond() {
        double dogRun = getHeight() * 2;
        return dogRun;
    }
}
