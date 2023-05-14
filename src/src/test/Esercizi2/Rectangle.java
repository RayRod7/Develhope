package src.test.Esercizi2;

public class Rectangle extends Shape{

    public Rectangle(Double height, Double width) {
        super(height, width);
    }

    @Override
    public Double calculateArea() {
        double rectangleArea = getHeight() * getWidth();
        return rectangleArea;
    }
}
