package hw3;

public class Car {

    private void startElectricity() {
        System.out.println("avtomat");
    }

    private void startCommand() {
        System.out.println("start");
    }

    private void startFuelSystem() {
        System.out.println("oil");
    }

    public void start() {
        this.startElectricity();
        this.startCommand();
        this.startFuelSystem();
    }
}
