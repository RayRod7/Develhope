package src.javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        int age = 28;
        System.out.println("Exercise 1:");
        System.out.println("I am " +age+ " years old");
        // Write your code here
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char nameInitial = 'R';
        int myAge = 28;
        System.out.println("My age is " + myAge + "and my name starts with " + nameInitial);
        //Write your code here
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //set boolean variable to check if the lunch was eaten or not
        boolean hasEatenLunch = false;
        //set lunch price
        double lunchCost = 5.99;
        //print out the lunch cost and if it was eaten or not using 2 print statements
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
