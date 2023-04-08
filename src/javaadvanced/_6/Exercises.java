package src.javaadvanced._6;

import java.util.concurrent.TimeUnit;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");

        for (Days c : Days.values())
            System.out.println(c);
        // Your code here
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Seasons season = Seasons.FALL;
        seasonsDaysRange(season);
        // Your code here
    }

    private static void seasonsDaysRange(Seasons season) {
        switch (season) {
            case SPRING -> System.out.println("Spring starts on march 21st and ends on june 21st");

            case SUMMER -> System.out.println("Summer starts on june 22nd and ends on september 22nd");

            case FALL -> System.out.println("Fall starts on september 23rd and ends on december 22nd");

            case WINTER -> System.out.println("Winter starts on december 23rd and ends on march 20th");

            default -> System.out.println("Not existing Season");

        }
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");

        //sinceramente non sono sicuro di aver capito cosa chiede l'esercizio, se una cosa del genere oppure
        //anche un semplice switch: case RED -> sout(TrafficLight.YELLOW)) ecc
        // ma visto che uno switch lo abbiamo appena scritto sopra, ho fatto così
        TrafficLight currentState = TrafficLight.RED;
        System.out.println(currentState);
        if (currentState == TrafficLight.RED) {
            currentState = TrafficLight.YELLOW;
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(currentState);

        }
        if (currentState == TrafficLight.YELLOW) {
            currentState = TrafficLight.GREEN;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(currentState);
        }
        if (currentState == TrafficLight.GREEN) {
            currentState = TrafficLight.RED;
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(currentState);
        }
        // Your code here
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        for (Days d : Days.values()) {
            if (!d.isWeekend) {
                System.out.println(d + " is a weekday");
            } else {
                System.out.println(d + " is weekend");
            }
        }


        // Your code here
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here
        Operator operator = Operator.DIVIDE;
        double num1 = 5;
        double num2 = 0;

        mathOperations(operator, num1, num2);


    }

    private static void mathOperations(Operator operator, double num1, double num2) {
        switch (operator) {
            case ADD:
                double sum = num1 + num2;
                System.out.println("ADD: " + sum);
                break;
            case SUBTRACT:
                double subtraction = num1 - num2;
                System.out.println("SUBTRACT: " + subtraction);
                break;
            case MULTIPLY:
                double multiplication = num1 * num2;
                System.out.println("MULTIPLY: " + multiplication);
                break;
            case DIVIDE: //is not necessary any try catch because dividing a double by 0.0 do not throws any exception
                double division = num1 / num2;
                System.out.println("DIVIDE: " + division);
                break;
            default:
                System.out.println("error");

        }
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

}
