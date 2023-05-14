package src.test.Esercizi4;

import java.util.*;

public class Esercizi4 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }


    /**
     *Write a program to create a HashMap and add key-value pairs to it. Then, display the values associated with all
     * the keys in the HashMap.
     */
    private static void exercise1() {
        System.out.println("Esercizio 1:");
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        myMap.put("four", 4);

        for (Map.Entry<String, Integer> number : myMap.entrySet()){
            System.out.println(number);
        }

    }

    /**
     *Write a program to create an ArrayList of Strings and sort it in ascending order based
     * on the length of the strings.
     */
    private static void exercise2() {
        System.out.println("\nEsercizio 2:");
        List<String> strs = new ArrayList<>();
        strs.add("ciao");
        strs.add("mi");
        strs.add("chiamo");
        strs.add("Raimondo");

        strs.sort(Comparator.comparingInt(String::length));
        System.out.println(strs);
    }


    /**
     * Write a program to create a HashSet and add elements to it. Then, use the HashSet to remove duplicates
     * from an array and display the unique elements.
     */
    private static void exercise3() {
        System.out.println("\nEsercizio 3:");
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);


        Integer[] numberArray = new Integer[]{1, 5, 9, 5, 1};
        numberSet.addAll(List.of(numberArray));
        System.out.println(numberSet);
    }

    /**
     * Write a program to create a TreeMap and add key-value pairs to it. Then, display the values associated
     * with all the keys in the TreeMap.
     */
    private static void exercise4() {
        System.out.println("\nEsercizio 4:");
        Map<Integer, String> myMap = new TreeMap<>();
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");

        System.out.println(myMap);

        for (Map.Entry<Integer, String> str : myMap.entrySet()){
            System.out.println(str.getKey());
        }


    }
}



