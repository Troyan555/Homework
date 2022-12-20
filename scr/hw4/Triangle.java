package hw4;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double halfP = (a + b + c) / 2;
        return Math.pow(halfP * (halfP - a) * (halfP - b) * (halfP - c), 0.5);
    }
}

