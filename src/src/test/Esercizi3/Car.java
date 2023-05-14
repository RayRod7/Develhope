package src.test.Esercizi3;

public class Car extends Vehicle {
    public Car(String mark, String model, Integer year) {
        super(mark, model, year);
    }

    public void calculateMilesPerGallon(){
        System.out.println("car miles per gallon");
    }

    public void displayInformation(){
        System.out.println("Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}');
    }

}
