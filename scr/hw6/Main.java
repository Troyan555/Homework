package hw6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] arr = new String[4][4];

        Random a = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.toString(a.nextInt(10));
                //arr[i][j] = s.next();
            }
        }
       /* for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        } */
        int sum = ArrayValueCalculator.doCalc(arr);
        if (sum != 0)
            System.out.println("Sum = " + sum);
    }
}

