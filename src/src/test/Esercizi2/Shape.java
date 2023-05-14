package src.test.Esercizi2;

public abstract class Shape {
    private Double height;
    private Double width;

    public Shape(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public abstract Double calculateArea();
}
