package src.javaoop._3;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String hairColor;
    private double heightInCm;
    private int studentCounter;


    public Student(String name, int age, String gender, String hairColor, double heightInCm) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hairColor = hairColor;
        this.heightInCm = heightInCm;
    }

    public String getName() {
        studentCounter++;
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHairColor() {

        if (hairColor.equals("bald") || hairColor.equals("no hairs")) {
            System.out.println("Bald, no hair color needed (neither an hairdryer)");
        } else {
            return hairColor;
        }
        return null;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public double getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(double heightInCm) {
        if (heightInCm > 1.90) {
            System.out.println("You could be a basket player!");
        } else {
            this.heightInCm = heightInCm;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                '}';
    }
}


