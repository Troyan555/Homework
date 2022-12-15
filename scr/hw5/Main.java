package hw5;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        dog.swim(10);
        dog.run(500);


        Cat cat = new Cat("Kitty");

        cat.swim(0);
        cat.run(200);

        System.out.println("dog: " + Dog.count);
        System.out.println("cat: " + Dog.count);
        int count = Dog.count + Cat.count;
        System.out.println("all Animals: " + count);
    }

}



