package hw20.strategy;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(4, 8);
        calculator.setShape(rectangle);
        System.out.println("Area of rectangle: " + calculator.calculateArea());

        Triangle triangle = new Triangle(3, 6);
        calculator.setShape(triangle);
        System.out.println("Area of triangle: " + calculator.calculateArea());
    }
}
