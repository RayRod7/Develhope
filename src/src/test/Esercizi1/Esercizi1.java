package src.test.Esercizi1;


public class Esercizi1 {
        public static void main(String[] args) {
            exercise1();
            exercise2();
            exercise3();
            exercise4();
        }

        /**
         * Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited
         * in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having
         * a method named 'getBalance'. Call this method by creating an object of each of the three classes.
         */
        private static void exercise1() {
            System.out.println("Esercizio 1:");

            BankA bankA = new BankA(1000.0);
            bankA.depositing(150.0);

            System.out.println(bankA.getBalance());

        }

        /**
         *

         We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three
         abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter
         each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of
         'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea',
         'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
         Create an object of class 'Area' and call all the three methods.
         */
        private static void exercise2() {
            System.out.println("Esercizio 2:");

            Area a = new Area();
            System.out.println(a.rectArea(4, 2));
            System.out.println(a.squareArea(3));
            System.out.println(a.squareArea(3.5));
        }


        /**
         * * Create a class called "Dog" that extends the Animal class.
         *      * Add a new field called "breed" to the Dog class.
         *      * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
         *      * Write getters and setters for the breed field.
         *
         *       * Create new classes called "Fish" and "Bird" that extends the Animal class.
         *      * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
         *      * Also create constructors, getters and setters
         *
         *      * In the animal class create a method called speedMetersPerSecond() that returns
         *      * the Dog's Height * 2, the Fish's Weight * 2, the Bird's Wingspan * 4
         *      * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
         *      * and print out which of the animals has the fastest movement speed in MetersPerSecond
         */
        private static void exercise3() {
            System.out.println("Esercizio 3:");
            Dog dog9 = new Dog(60.0, 32.0, "Dobermann");
            Fish fish8 = new Fish(5.0, 0.9, "Pesce rosso");
            Bird bird7 = new Bird(100.00, 7.5, 3.5);

            double dogRun = dog9.speedMetersPerSecond();
            double fishSwim = fish8.speedMetersPerSecond();
            double birdFly = bird7.speedMetersPerSecond();

            if (dogRun > fishSwim && dogRun > birdFly){
                System.out.println("The faster is the dog with " + dogRun + " meters per second");
            }
        }

    /**
     * An abstract class has a construtor which prints "This is constructor of abstract class", an abstract method named
     * 'a_method' and a non-abstract method which prints "This is a normal method of abstract class". A class 'SubClass'
     * inherits the abstract class and has a method named 'a_method' which prints "This is abstract method". Now create
     * an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
     */
    private static void exercise4() {
        System.out.println("Esercizio 4:");
        SubClass sub = new SubClass();
        sub.NotAbstractMethod();
        sub.aMethod();

        }
    }


