package src.javaadvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     * <p>
     * <p>
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     * <p>
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     * <p>
     * Verify that the methods return the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-3, calculator.add(0, -3));
        Assertions.assertEquals(-2, calculator.subtract(-5, -3));
        // Your code here

    }

    /**
     * 2:
     * <p>
     * <p>
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     * <p>
     * Test the same kind of inputs as before as exercise 1
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        Assertions.assertEquals(0, calculator.multiply(-7, 0));
    }

    /**
     * 3:
     * <p>
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     * <p>
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0.04, calculator.power(5.0, -2.0));
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.power(0.0, -2.0));

        // Your code here
    }
}