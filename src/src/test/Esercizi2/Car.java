package src.test.Esercizi2;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("Car is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car is moving backward");
    }
}
