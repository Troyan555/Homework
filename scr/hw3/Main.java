package hw3;
// ДЗ 3 за 03.12
// 1-3 Cтворити клас "Співробітник" з полями: ПІБ, посада, email, телефон, вік.
// Конструктор класу повинен заповнювати ці поля під час створення об'єкта.
//Забезпечити інкапсуляцію внутрішніх властивостей класу.
// 4. Створити два класи з однаковим ім'ям SameName. (Використовувати пакети)
// 5. Створити клас Car з публічним методом start. Метод start викликає у собі методи:
// - startElectricity()
//  - startCommand()
// - startFuelSystem()
//  Перелічені методи, є внутрішньою (прихованою) частиною комплексного методу start.
//  Вони по суті відображають внутрішню поведінку класу Car і не повинні використовуватися за межами даного класу.


    public class Main {
    public static void main(String[] args)
    {
        Employee obj = new Employee ( "Irina Troian",33,  "Java Senior",  "Ira@gmail.com",  "+17...39");
        obj.Print();

        Car c = new Car();
        c.start();
    }
}




