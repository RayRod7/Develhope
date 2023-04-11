package src.javaoopadvaced._1;

public class Dog extends Animal {
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
    public String toString() {
        return "Dog{" + "height in cm: " + getHeight() + ", weight in kg: " + getWeight() +
                ", breed: " + breed +
                '}';
    }

    public Double runSpeedMetersPerSecond() {
        double runSpeed = this.getHeight() * 2;
        return runSpeed;
    }
}
