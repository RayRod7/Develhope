package src.javaadvanced._1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();

    }

    /**
     * 1:
     * <p>
     * 1. Add some numbers (1, 1, 5, 2, 1) to the set using the add() method.
     * 2. Remove '1' from  the set using the .remove(1)
     * 3. Print the set again to confirm the element was removed.
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        Set<Integer> ourSet = new HashSet<>();

        // Add some numbers using the add method
        ourSet.add(1);//ourSet.add(8);
        ourSet.add(1);
        ourSet.add(2);
        ourSet.add(5);
        ourSet.add(1);
        // Your code
        for (int i = 0; i < 100; i++) {
            int value = Integer.valueOf((int) (Math.random() * 100));
            System.out.println("indice: " + i + " valore: " + value);
            ourSet.add(value);
        }

        /*
        if (ourSet.containsAll(Set.of(1, 1, 5, 2, 1))) {
            System.out.println("1a. Set contains all numbers");
        } else {
            System.out.println("1a. Set does not contain all numbers");
        }
        */

        System.out.println(ourSet);

        // Remove the element '1'
        ourSet.remove(1);
        // Your code

        System.out.println(ourSet);

        if (ourSet.contains(1)) {
            System.out.println("1b. The set still contains 1");
        } else {
            System.out.println("1b. The set does not contain 1");
        }
    }

    /**
     * 2:
     * <p>
     * Read the comments below and write comments on what you think our print statement will output!
     */
    private static void exercise2() {
        Set<String> fruitsSet = new HashSet<>();

        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        fruitsSet.add("kiwi");
        fruitsSet.add("mango");

        fruitsSet.addAll(fruitsSet);

        //2a. What will this output? [it will print the strings we added in random order]

        System.out.println("2a: " + fruitsSet);

        List<String> fruitsList = List.of("apple", "banana", "grapes", "pear", "mango");

        fruitsSet.addAll(fruitsList);

        //2b. What will this output? [it will print the strings we added and fruitsList in random order, without duplicates]
        System.out.println("2b: " + fruitsSet);
    }

    /**
     * 3: Write code to solve the following problems
     */
    private static void exercise3() {
        // 3a. Find the min and max values in the Set below
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int max = Integer.MAX_VALUE; //
        int min = Integer.MIN_VALUE; //


        for (Integer number : numbers) {
            if (number > max || max == Integer.MAX_VALUE) {
                max = number;
            }
        }
        for (Integer number : numbers) {
            if (number < min || min == Integer.MIN_VALUE) {
                min = number;
            }
            // Your code
        }

        if (max != 10 || min != 1) {
            System.out.println("3a. Incorrect min or max values");
        } else {
            System.out.println("3a. Correct min or max values"); //aggiunto per stampare qualcosa quando il risultato è corretto
        }

        // 3b. Find which items from set a are also in set b, add these to itemsContainedInBothSets
        //     use the `contains` method and "nested" for loop
        Set<Integer> setA = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> setB = Set.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Set<Integer> itemsContainedInBothSets = new HashSet<>();

        for (Integer indexA : setA) {
            if (setB.contains(indexA)) {
                itemsContainedInBothSets.add(indexA);
            }
            for (Integer indexB : setB) {
                if (setA.contains(indexB)) {
                    itemsContainedInBothSets.add(indexB);
                }
            }
        }
        // Your code

        if (!itemsContainedInBothSets.equals(Set.of(5, 6, 7, 8, 9, 10))) {
            System.out.println("3b. Incorrect number of items in itemsContainedInBothSets");
        } else {
            System.out.println("3b. Correct number of items in itemsContainedInBothSets");

        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * -----------------------------------------------------------------------
     */
    private static void exercise4() {
        Set<Integer> orderedNumbers = new TreeSet<>();
        orderedNumbers.addAll(Set.of(5, 3, 1, 2, 4, 6, 7, 8, 9, 10));
        // 4a. Find the min value in the TreeSet with as few loops as possible,
        //     you can use `break;` to exit the loop once you've found it!
        //int min = Integer.MAX_VALUE;

        //commento la riga 155 per poter impostare il valore di min direttamente quando dichiaro la variabile
        // inizialmente avevo scritto così: int min = orderedNumbers.first(); ma mi dava errore perchè il nostro è
        // Set<Integer>... e non TreeSet<Integer>...
        //ma passando il mouse sull'errore mi suggerisce di fare il cast come di seguito:

        int min = ((TreeSet<Integer>) orderedNumbers).first();


        // Your code

        if (min != 1) {
            System.out.println("4a. Incorrect min value");
        } else {
            System.out.println("4a. Correct min value");
        }
    }


}

