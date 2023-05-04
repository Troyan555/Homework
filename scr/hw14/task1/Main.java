package hw14.task1;

import java.util.concurrent.Semaphore;
public class Main {
        public static void main(String[] args) {
            Semaphore semaphore=new Semaphore(3);
            PetrolStation petrolStation = new PetrolStation(500, semaphore);
            Thread dispenser1=new Thread(petrolStation);
            Thread dispenser2=new Thread(petrolStation);
            Thread dispenser3=new Thread(petrolStation);

            dispenser1.start();
            dispenser2.start();
            dispenser3.start();
        }
}
