package src.javaoopadvaced._2;

public class Boat implements Movable {

    @Override
    public void moveForward() {
        System.out.println("Boat moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Boat moving backward");
    }
}
