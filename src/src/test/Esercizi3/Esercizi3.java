package src.test.Esercizi3;

import src.test.Esercizi1.Bank;

public class Esercizi3 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    private static void exercise1() {
        System.out.println("Esercizio 1:");
        Flyable[] flyingObj = {new Aeroplane(), new Bird()};
        for (Flyable obj: flyingObj) {
            obj.fly();
        }


    }

    /**
     * Create an abstract class called "Vehicle" with properties for "mark", "model", and "year". Create at least
     * two concrete classes that inherit from "Vehicle" and implement their own unique methods such as
     * "calculateMilesPerGallon()" and "displayInformation()".
     */
    private static void exercise2() {
        System.out.println("\nEsercizio 2:");
        Car car1 = new Car("Fiat", "panda", 2000);
        car1.displayInformation();
        car1.calculateMilesPerGallon();

    }




    /**
     * Define an interface called "Playable" with methods "play()", "stop()", and "rewind()" that returns void. Create
     * at least two different classes that implement the "Playable" interface and implement unique playback methods
     * such as for a video or an audio file.
     */
    private static void exercise3() {
        System.out.println("\nEsercizio 3:");


    }
}



