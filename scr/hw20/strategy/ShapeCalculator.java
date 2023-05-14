package hw20.strategy;

public class ShapeCalculator {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public double calculateArea() {
        return shape.getArea();
    }
}
