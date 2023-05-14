package src.test.Esercizi1;

public class Area extends Shape {
    @Override
    public Double rectArea(double side1, double side2) {
        double rectangleArea = side1 * side2;
        return rectangleArea;
    }

    @Override
    public Double squareArea(double side) {
        double squareArea = side *2;
        return squareArea;
    }

    @Override
    public Double circleArea(double radius) {
        double circleArea = Math.PI * (radius * radius);
        return null;
    }
}
