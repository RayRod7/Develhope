package src.javaoopadvaced._3;

public class Person {

    private final String name;
    private final int age;
    private final String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " +
                "is " + age + " years old and lives in '" + address + "'";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(age) + address.hashCode();
        //return super.hashCode();
    }
}
