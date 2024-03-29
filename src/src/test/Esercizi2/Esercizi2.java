package src.test.Esercizi2;


public class Esercizi2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * Create an abstract class called "Shape" with fields of height and width
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape(intende Shape?) class and implement the calculateArea() method.
     * Create instances of both and calculate their area
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("Esercizio 1:");
        Circle circle = new Circle(2.7);
        Rectangle rect = new Rectangle(2.5, 2.0);

        System.out.println(circle.calculateArea());
        System.out.println(rect.calculateArea());

    }

    /**
     * 2:
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     * <p>
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     * <p>
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("Esercizio 2:");
        Boat boat = new Boat();
        Car car = new Car();

        boat.moveForward();
        car.moveBackward();

    }


    /**
     * 3:
     * Create an interface called "Playable" with an abstract method called "play()".
     * <p>
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     * <p>
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     * <p>
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("Esercizio 3:");
        Guitar guitar = new Guitar("guitar", "fender");
        Piano piano = new Piano("piano", "mozart");

        piano.play();
        guitar.play();

    }
}


