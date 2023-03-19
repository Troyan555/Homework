package hw11.coffee_order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Irina");
        orderBoard.add("Aleksandr");
        orderBoard.add("Sergii");
        orderBoard.add("Max");
        orderBoard.add("Mykola");
        orderBoard.add("Daniil");
        orderBoard.add("Serg");
        orderBoard.add("Mariia");

        orderBoard.draw();

        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();

        orderBoard.draw();

        orderBoard.deliver(6);
        orderBoard.deliver(7);

        orderBoard.draw();
    }
}
