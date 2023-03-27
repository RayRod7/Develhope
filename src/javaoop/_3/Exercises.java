package javaoop._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student student1 = new Student("Mario", 25,"male","black",1.88);

        student1.setName("Maria");
        student1.setAge(52);
        student1.setGender("female");
        student1.setHairColor("white");
        student1.setHeightInCm(1.72);

        System.out.println(student1.getName() +" "+ student1.getAge() + " "+ student1.getGender() + " "
        + student1.getHairColor() + " " + student1.getHeightInCm());
        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student2 = new Student("Mario", 25,"male","black",1.88);


        student2.setAge(17);
        //System.out.println(student2.getAge());

        student2.setHeightInCm(1.95);
        System.out.println(student2.getHeightInCm());

        student2.setName("R");
        System.out.println(student2.getName());

        student2.setHairColor("pelato");
        System.out.println(student2.getHairColor());

        //Write your code here
    }

}
