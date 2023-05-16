package hw22;

public class CoffeeOrderBoardRunner {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Ira");
        orderBoard.add("Nick");
        orderBoard.add("Dima");
        orderBoard.add("Alex");
        orderBoard.add("Masha");

        orderBoard.draw();

        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();

        orderBoard.draw();

        orderBoard.deliver(7);
        orderBoard.deliver(6);

        orderBoard.draw();
    }
}
