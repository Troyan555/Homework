package hw20.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V4")
                .setBody("SUV")
                .setTransmission("manual")
                .setColor("Grey")
                .build();
        System.out.println(car);

    }
}
