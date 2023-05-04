package hw14.task1;

import java.util.concurrent.Semaphore;

public class PetrolStation implements Runnable, Station {
    private Semaphore semaphore;
    private volatile int amount;

    public PetrolStation(int amount, Semaphore semaphore) {
        this.amount = amount;
        this.semaphore = semaphore;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void doRefuel() throws InterruptedException {
        int counterFuel = (int) ((Math.random() * 60) + 5);
        if (counterFuel >= amount) {
            counterFuel = amount;
        }
        semaphore.acquire();
        setAmount(amount - counterFuel);
        semaphore.release();
        System.out.println("Car " + Thread.currentThread().getName() + " refuel " + counterFuel + " l");

        Thread.sleep((long) ((Math.random() * 7000) + 3000));
        System.out.println("Petrol remaining after refuel car " + Thread.currentThread().getName() + "=" + amount);

    }
    @Override
    public void run() {
        while (amount > 0) {
            try {
                doRefuel();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
