package hw5;// 1. Створити порожній проект в IntelliJ
//2. Створити класи Собака та Кіт з успадкуванням від класу Тварини.
//3. Всі тварини можуть бігти та плисти. Як параметр кожному методу передається довжина перешкоди.
// Результатом виконання дії буде друк у консоль. (Наприклад, dog Bobik.run(150); -> 'Бобік пробіг 150 м');
//4. Кожна тварина має обмеження на дії (біг: кіт 200 м., собака 500 м.; плавання: кіт не вміє плавати, собака 10 м.).
//5. * Додати підрахунок створених котів, собак та тварин.

public class Animal {
    String name;

    public Animal() {
        name = "";
    }

    public Animal(String N) {
        name = N;
    }

    public void print() {
        System.out.println(name);
    }

    public void swim(int L) {
        System.out.println("Animal can swim");
        System.out.println(L);
    }

    public void run(int L) {

        System.out.println("Animal can run");
        System.out.println(L);
    }
}

