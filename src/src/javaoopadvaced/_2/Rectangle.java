package src.javaoopadvaced._2;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    Double calculateArea() {
        return height * width;
    }
}
