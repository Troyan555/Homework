package hw4;

// S = π × r2, where r is the radius, π is a constant
public class Circle implements Figure {
    public final double PI = 3.14;
    private double radius; // radius of a circle

    public Circle(double radius) {
        this.radius = radius;

    }
    @Override
    public double getArea() {
        double S = PI * radius * radius;
        return S;
    }
}