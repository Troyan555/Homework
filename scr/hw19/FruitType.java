package hw19;

public enum FruitType {
    STRAWBERRY("Strawberry"),
    APPLE("Apple"),
    PEAR("Pear"),
    ORANGE("Orange");

    FruitType(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
