package hw7;
import java.util.Scanner;

public class HomeWorkApp {
    static void printThreeWords() {
        System.out.print("Orange\nBanana\nApple\n ");
    }

    static void checkSumSign() {
        int a = 3, b = -5;
        if ((a + b) >= 0)
            System.out.print("Sum positive ");
        else
            System.out.print("Sum negative");
    }

    static void printColor() {
        int value = 104;
        if (value <= 0)
            System.out.println("red");
        else if (value >= 0 && value <= 100)
            System.out.println("yellow");
        else
            System.out.println("green");
    }

    static void compareNumbers(){
        int a=6, b=22;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
    static boolean task6 (int a, int b){
        int res = a+b;
        if (res >= 10 && res <=20)
            return true;
        else
            return false;
    }

    static void task7 (int a){
        if (a >= 0)
            System.out.println("positive");
        else
            System.out.println("negative");
    }

    static boolean task8 (int a){
        if (a < 0)
            return true;
        else
            return false;
    }

    static void task9 (String a, int count){
        for (int i =0; i<count; i++){
            System.out.println(a);
        }
    }

    static boolean task10 (int Year){
        if (Year %4 == 0 || (Year %100 == 0 && Year%400 ==0))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        //  printThreeWords();
        //  checkSumSign();
        //  printColor();
        //  compareNumbers();
        /*  System.out.println( "Enter 1 number");
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        System.out.println( "Enter 2 number");
        int number2 = s.nextInt();
        System.out.println(task6 (number1, number2));*/

       /* System.out.println( "Enter number");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        task7(number); */

        /* System.out.println( "Enter number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(task8 (a)); */

       /* Scanner s = new Scanner(System.in);
        System.out.println( "Enter number");
        int b= s.nextInt();
        task9 ("Hello",b); */

       /* System.out.println( "Enter Year");
        Scanner s = new Scanner(System.in);
        int Year = s.nextInt();
        System.out.println(task10(Year)); */
    }
}
