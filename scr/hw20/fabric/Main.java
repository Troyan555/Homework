package hw20.fabric;

import static hw20.fabric.FurnitureType.*;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory=new FurnitureFactory();
        factory.furnitureCreate(FurnitureType.CHAIR).create();
        factory.furnitureCreate(FurnitureType.TABLE).create();
        factory.furnitureCreate(FurnitureType.BED).create();
    }
}
