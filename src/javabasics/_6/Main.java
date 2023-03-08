package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        double value = 16;
        double valueSquareRoot = Math.sqrt(value);
        System.out.println(valueSquareRoot);
        // Write your code here
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;

        System.out.println("Max=" + Math.max(valueA, valueB));
        System.out.println("Min=" + Math.min(valueA, valueB));
        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //I changed the name of variables adding euros where needed because the guy in the video says
        //it's important,in this cases, to explicit what the value is referred to (because it could be pound, dollar ecc)
        int totalEuros = 51;
        int costPerBurger = 9;
        int eurosLeftAfterBurgers = totalEuros % costPerBurger;
        int burgersBought = totalEuros / costPerBurger;
        // Write your code here
        System.out.println("Remainder= " + eurosLeftAfterBurgers + " Euros");
        System.out.println("Burgers Bought= " + burgersBought);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // math.ceil round up a given number to his closer integer
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));

        // math.floor round down a given number to his closer integer
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));

        // math.round rounds down if the first number after comma is between 1 and 4,
        // and rounds up if it's between 5 and 9
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));

        // Math.pow is the exponentation, in fact 4.5*4.5=20.25
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));

        // Same as above, but this time by 3, in facct 4.5 * 4.5 * 4.5= 91.125
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));

        // Math.random assign a random number >= 0 and < 1
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}