package hw5;

class Dog extends Animal {
    public static int count = 0;

    public Dog(String N) {
        super(N);
        count++;
    }

    public void swim(int L) {
        if (L <= 10) {
            System.out.print("Dog " + name + " can swim ");
            System.out.println(L + " m");
        } else {
            System.out.println(name + " can`t swim ");
        }
    }

    public void run(int L) {
        if (L <= 500) {
            System.out.print("Dog " + name + " can run ");
            System.out.println(L + " m");
        } else {
            System.out.println(name + " can`t run ");

        }
    }
}


