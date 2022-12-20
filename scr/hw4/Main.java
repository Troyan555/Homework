package hw4;

public class Main {

    public static void getTotalArea(Figure[] figures) {
        double totalArea = 0;
        for (int i = 0; i < figures.length; i++)
        {
            totalArea += figures[i].getArea();
        }
        System.out.println("TOTAL: " + totalArea);
    }

    public static void main(String[] args) {

        Figure[] figures = new Figure[3];

        figures[0] = new Square(7);
        figures[1] = new Triangle(3, 5, 4);
        figures[2] = new Circle(5);

        getTotalArea(figures);
    }
}
