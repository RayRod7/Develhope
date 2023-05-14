package src.test.Esercizi2;

public class Boat implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Boat is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Boat is moving backward");
    }
}
