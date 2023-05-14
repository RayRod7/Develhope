package src.javaoopadvaced._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * Create a class called "Dog" that extends the Animal class.
     * Add a new field called "breed" to the Dog class.
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        System.out.println("Class created!");
        // Your code here
    }

    /**
     * 2:
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        System.out.println("Classes created!");
        // Your code here
    }


    /**
     * 3:
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog dog1 = new Dog(60.0, 32.0, "Dobermann");
        Fish fish1 = new Fish(5.0, 0.9, "Pesce rosso");
        Bird bird1 = new Bird(100.00, 7.5, 3.5);

        double dog1Speed = dog1.runSpeedMetersPerSecond();
        double fish1Speed = fish1.swimSpeedMetersPerSecond();
        double bird1Speed = bird1.flySpeedMetersPerSecond();


        if (dog1Speed > fish1Speed && dog1Speed > bird1Speed) {
            System.out.println("The faster of our animals is: " + dog1 + "\n" + "It runs " + dog1Speed + " meters per second");
        } else if (fish1Speed > dog1Speed && fish1Speed > bird1Speed) {
            System.out.println("The faster of our animals is: " + fish1 + "\n" + "It runs " + fish1Speed + " meters per second");
        } else if (bird1Speed > dog1Speed && bird1Speed > fish1Speed) {
            System.out.println("The faster of our animals is: " + fish1 + "\n" + "It runs " + fish1Speed + " meters per second");
        }

        // Your code here

    }
}
