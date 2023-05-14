package src.javaoopadvaced._2;

public class Car implements Movable {

    @Override
    public void moveForward() {
        System.out.println("Car moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car moving backward");
    }
}
