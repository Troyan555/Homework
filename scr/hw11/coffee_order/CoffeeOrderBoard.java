package hw11.coffee_order;

import java.util.PriorityQueue;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orderBoard;
    private int counter = 1;

    public CoffeeOrderBoard() {
        orderBoard = new PriorityQueue<>(4, (o1, o2) -> o1.getOrderNumber() - o2.getOrderNumber());
    }

    public void add(String name) {
        Order order = new Order(counter, name);
        orderBoard.add(order);
        counter ++;
    }

    public void deliver(){
        orderBoard.remove();
    }

    public void deliver(int number) {
        for (Order order : orderBoard) {
            if (order.getOrderNumber() == number){
                orderBoard.remove(order);
                return;
            }
        }
    }

    public void draw() {
        System.out.println("\t____________");
        System.out.println(" \t  Number |\t Name ");


        for (Order order : orderBoard) {

            String stringBuilder = "\t\t" + order.getOrderNumber()
            +"\t|\t" + order.getOrderOwner();

            System.out.println(stringBuilder);
        }
    }

}
