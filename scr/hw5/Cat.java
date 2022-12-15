package hw5;

class Cat extends Animal {
    public static int count = 0;

    public Cat(String N) {
        super(N);
        count++;
    }

    public void swim(int L) {
        System.out.println("Cat " + name + " can`t swim ");

    }

    public void run(int L) {
        if (L <= 200) {
            System.out.print("Cat " + name + " can run ");
            System.out.println(L + " m");
        } else {
            System.out.println(name + " can`t run ");
        }
    }
}