package src.javaoopadvaced._1;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Bird{" + "height in cm: " + getHeight() + ", weight in kg: " + getWeight() +
                ", wingSpan: " + wingSpan +
                '}';
    }

    public Double flySpeedMetersPerSecond() {
        double flySpeed = wingSpan * 2;
        return flySpeed;
    }
}
