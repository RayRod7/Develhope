package src.test.Esercizi2;

public class Circle extends Shape{

    public Circle(double diameter) {
        super(diameter, diameter);
    }

    @Override
    public Double calculateArea() {
        double circleArea = Math.PI * Math.pow((getHeight() / 2), 2);
        return circleArea;
    }
}
