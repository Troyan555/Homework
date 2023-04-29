package hw13;

public class ValueCalculator {
    private static final int size = 10000000;
    private final int halfSize = size / 2;
    private float[] array = new float[size];

    public void doSomethingWithMultithreading() {
        long start = System.currentTimeMillis();

        fillArray();

        float[] a1 = new float[halfSize];
        float[] a2 = new float[halfSize];

        System.arraycopy(array, 0, a1, 0, halfSize);
        System.arraycopy(array, halfSize, a2, 0, halfSize);

        Thread thread1 = new Thread(() -> operationWithArray(a1));
        Thread thread2 = new Thread(() -> operationWithArray(a2));
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.arraycopy(a1, 0, array, 0, halfSize);
        System.arraycopy(a2, 0, array, halfSize, halfSize);

        long end = System.currentTimeMillis();
        System.out.println("With multithreading");
        System.out.println(end - start);
    }

    public void doSomethingWithoutMultithreading() {
        long start = System.currentTimeMillis();
        fillArray();
        operationWithArray(array);

        long end = System.currentTimeMillis();

        System.out.println("Without multithreading");
        System.out.println(end - start);

    }

    public void fillArray() {
        float element = (float) (Math.random() * 10) + 1;
        for (int i = 0; i < size; i++) {
            array[i] = element;
        }
    }

    public void operationWithArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
    }
}
