package hw12;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"t","r","o","y","a"};
        Double[] arr3 = {1.1,2.2,3.3,4.4,5.5};
        Converter modifier = new Converter();
        System.out.println(modifier.toList(arr1));
        System.out.println(modifier.toList(arr2));
        System.out.println(modifier.toList(arr3));

        Box<Apple> box1 = new Box<>(new Apple());
        Box<Orange> box2 = new Box<>(new Orange());
        Box<Apple> box3 = new Box<>(new Apple());
        Box<Orange> box4 = new Box<>(new Orange());

        box1.addOne();
        System.out.println(box1.getAmount());
        box1.addMany(11);
        System.out.println(box1.getAmount());
        System.out.println(box1.getWeight());
        box4.addMany(14);
        System.out.println(box4.getWeight());
        System.out.println(box1.compare(box4));
        System.out.println(box1.compare(box3));
        System.out.println(box1.compare(box4));
        System.out.println(box1.merge(box3));
        box2.addMany(5);
        System.out.println(box1.merge(box2));
        System.out.println(box1.getAmount());
        System.out.println(box2.getAmount());
    }
}
