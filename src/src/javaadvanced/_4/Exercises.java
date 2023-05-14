package src.javaadvanced._4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
            Files.createFile(MY_PATH);
            //method that writes myString to a file
            stringToFileAdder(myString);
           

            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static void stringToFileAdder(String myString) throws IOException {
        Files.writeString(MY_PATH, myString);


        System.out.println("File created and mySting wrote into it");
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            //Write a method that reads the file from exercise 1 and prints it out
            printingContentReadInFile();
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static void printingContentReadInFile() throws IOException {
        String fileContent = Files.readString(MY_PATH);
        System.out.println("Our string into the file is: " + fileContent);
    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        int linesCount = 0;
        // Write code here to read the file and return the number of lines "\n", string.split

        try {
            //method that reads a file and print the number of lines.
            fileLinesCounter(linesCount);

            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static void fileLinesCounter(int linesCount) throws IOException {
        List<String> filecontentAsList = Files.readAllLines(MY_PATH);
        for (String line : filecontentAsList) {
            linesCount++;
        }
        System.out.println("The number of lines in our file is: " + linesCount);
    }


    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     * <p>
     * Then deletes the previous file with Files.delete() use inside the try block
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        int wordsCount = 0;

        try {
            //method that reads a file and returns the number of words in the file
            fileWordCounter(wordsCount);
            //deleting file
            Files.delete(MY_PATH);


            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static void fileWordCounter(int wordsCount) throws IOException {
        String contentAsString = Files.readString(MY_PATH);
        for (String word : contentAsString.split(" ")) {
            wordsCount++;
        }
        System.out.println("The number of words is: " + wordsCount);
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            creatingDirectory(myDirectoryPath);

            // Your code
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static void creatingDirectory(Path myDirectoryPath) throws IOException {
        Files.createDirectory(myDirectoryPath);
        System.out.println("Directory 'mydirectory' with file.txt created");
    }
}
