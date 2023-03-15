package javabasics._12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1 - String score:");
        exercise1("Java runs on over 2 billion devices", 15);
        exercise1("+31 2 58765446", 48);
        exercise1("hello world", 42);

        System.out.println("\nExercise 2 - Meal score:");
        exercise2("sandwich", 2.5, 12.5);
        exercise2("soup", 10, 30);
        exercise2("soup", 1, 5);
    }

    /**
     * 1: We are going to 'score' strings, given a string you are to calculate its score based on the following factors.
     *
     *    Start with a base score of the string's length, this is the starting score. Use .length() on a string
     *
     *    The Maximum starting score is 20, if a score is over 20. Set it to 20.
     *
     *    If the string contains the letter a, -5 from the score
     *
     *    If the string is all lowercase, add 10 to the score.
     *
     *    If the score is now over 20, times it by 2
     */
    public static double exercise1(String text, double expectedScore) {
        double yourScore = 0;

        // Start your code here

        //setting the string to score and calculating length
        String txt = "+31 2 58765446";
        double startingScore = txt.length();
        // setting 20 as cap for starting score

        if (startingScore <=20){
            yourScore = startingScore;
        } else {
            yourScore = 20;
        }
        // If the string contains the letter a, -5 from the score
        if (txt.contains("a")){
            yourScore -= 5;
        }
        // If the string is all lowercase, add 10 to the score.
        if(txt.equals(txt.toLowerCase())){
            yourScore += 10;
        }
        //If the score is now over 20, times it by 2
        if (yourScore > 20){
            yourScore *= 2;
        }
        // End it here

        System.out.print("Expected score=" + expectedScore +", actual score=" + yourScore);
        if (expectedScore != yourScore) {
            System.out.println(" - Failed: Wrong score for '" + text +"'");
        } else {
            System.out.println(" - Success!");
        }

        return yourScore;
    }

    /**
     * 2: We are going to 'score' a meal, given a string of mealType you are to calculate its score based on the following factors.
     *
     *    For the meal type sandwich calculate score like the following: 5 * weight
     *
     *    For the meal type of soup calculate score like the following 3 * weight
     *
     *    The minimum score should be 5, if a score is lower than this increase it to 5
     */
    public static double exercise2(String mealType, double weight, double expectedScore) {
        double yourMealScore = 0;
        // Start your code here
        //setting the type of meal and its weight
        String meal = "soup";
         weight = 10; //in questo modo la scritta weight nello scope usciva in grigio, avevo cambiato nome
                     // credendo fosse un errore, invece ti dice solo che potrebbe diventare una variabile locale
        //calculating score based on the type of meal
        if (meal.contains("sandwich")){
            yourMealScore = 5 * weight;
        } else if(meal.contains("soup")){
            yourMealScore = 3 * weight;
        } else {
            System.out.println("meal type not supported");
        }
        //if a score is lower than 5, increase it to 5
        if (yourMealScore < 5){
            yourMealScore = 5;
        } //qui è stata una defaillance, nell'esercizio 1 in situazioni simili non ho commesso questo errore :)
        // End it here

        System.out.print("Expected score=" + expectedScore +", actual score=" + yourMealScore);
        if (expectedScore != yourMealScore) {
            System.out.println(" - Failed: Wrong score for '" + mealType +"'");
        } else {
            System.out.println(" - Success!");
        }

        return yourMealScore;
    }
}
