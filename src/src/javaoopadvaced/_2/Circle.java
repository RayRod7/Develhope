package src.javaoopadvaced._2;

public class Circle extends Shape {
    public Circle(double height, double width) {
        super(height, width);
        if (height != width) {
            this.width = this.height;
            System.out.println("Height and width must have the same values to be a circle!\n" +
                    "automatically set width = height and height = radius.");
        }
    }

    @Override
    Double calculateArea() {
        return Math.PI * Math.pow((height / 2), 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + height +
                '}';
    }
}
