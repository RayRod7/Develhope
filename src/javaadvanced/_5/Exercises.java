package src.javaadvanced._5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        // Your code here

        String userInputFileName = "test-file.txt";
        File file = new File(userInputFileName);
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("The file could not be found");
        }
    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            Integer.parseInt("house");
        } catch (NumberFormatException e) {
            System.out.println("input is not a valid integer");
        }
    }


    /**
     * 4:
     * <p>
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        //Dividing a Double for 0.0 do not throw Artmetic Exception unless you do such as the if statement as the one at line 91
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";
        Double division = num1 / Double.parseDouble(num2AsString);

        try {
            if (division == Double.POSITIVE_INFINITY || division == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Aritmetic Exception");
        } catch (NumberFormatException e) {
            System.out.println("The string does not have the appropriate format to be converted");
        }
        // Your catch blocks here

    }
}




