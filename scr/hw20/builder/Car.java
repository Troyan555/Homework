package hw20.builder;

public class Car {
    private String engine;
    private String transmission;
    private String body;
    private String color;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.body = builder.body;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", body='" + body + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class CarBuilder {
        private String engine;
        private String transmission;
        private String body;
        private String color;


        public CarBuilder setEngine(String engine1) {
            this.engine = engine1;
            return this;
        }

        public CarBuilder setTransmission(String transmission1) {
            this.transmission = transmission1;
            return this;
        }

        public CarBuilder setBody(String body1) {
            this.body = body1;
            return this;
        }

        public CarBuilder setColor(String color1) {
            this.color = color1;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }
}
