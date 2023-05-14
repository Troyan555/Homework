package hw20.fabric;

public class FurnitureFactory {
    public Furniture furnitureCreate(FurnitureType furnitureType) {
        return switch (furnitureType) {
            case BED -> new Bed();
            case CHAIR -> new Chair();
            case TABLE -> new Table();
            default -> throw new IllegalArgumentException("Unknown furniture type " + furnitureType);
        };
    }
}