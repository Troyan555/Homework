package hw4;

public class Square implements Figure {
    private double side; // side of a square

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

}
